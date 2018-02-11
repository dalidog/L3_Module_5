package data_structures;

import javax.swing.JOptionPane;

public class fibonacci {
int x=0;
int y=1;
int z;
public static void main(String[] args) {
	fibonacci fib = new fibonacci();
	String useranswer = JOptionPane.showInputDialog("Pick a number. you will be amazed by your fibonacci sequence!!!!");
	int useranswer2 =Integer.parseInt(useranswer);
fib.dofib(useranswer2);
	}
	public void dofib(int useranswer2){
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i < useranswer2; i++) {
			
			System.out.println(x+y);
	z=y;
	y=x+y;
	x=z;

		
			
		}
	}
	
}
