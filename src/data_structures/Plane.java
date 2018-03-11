package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Plane {
	int numberofPassangers;
	ArrayList<Snake>array = new ArrayList<Snake>();
	Plane(int pass){
		numberofPassangers = pass;
		createSnakes();
	}

public static void main(String[] args) {
Random r = new Random();
int y = r.nextInt(100);
Plane p = new Plane(y);
p.calculateDeath();
}
public void createSnakes(){
	for (int i = 0; i < 101; i++) {
		Boolean ven;
		Random tf = new Random();
		int num = tf.nextInt(2);
		if (num == 0) {
		ven = true;
			
		}
		else {

		ven = false;
		}
		Random number = new Random();
		int x = number.nextInt(9)+1;
		Snake snake = new Snake(x,ven);
		array.add(snake);
	}
}

public int addViciousness() {
 int totalVenom = 0;
	for (int i = 0; i < array.size(); i++) {
		array.get(i).getViciousness();
	if(array.get(i).isVenomous()==true) {
		totalVenom = totalVenom +array.get(i).getViciousness();
	}
	}
	return totalVenom;
}
public void calculateDeath() {
	int chanceofDeath = 0;
	chanceofDeath=addViciousness()*10/numberofPassangers;
	if(chanceofDeath>100) {
		chanceofDeath = 100;
	}
	System.out.println("You are "+ chanceofDeath + "% going to die! ;)");
}
}
