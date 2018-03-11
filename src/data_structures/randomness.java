package data_structures;
import java.util.Random;

public class randomness {
	public static void main(String[] args) {
		randomtf();
		randomnumber();
	}
public static boolean randomtf() {
	Random tf = new Random();
	int num = tf.nextInt(2);
	if (num == 0) {
		System.out.println("true");
		return true;
	}
	else {
	System.out.println("false");
	return false;
	}
}
public static void randomnumber() {
	Random number = new Random();
	int x = number.nextInt(9)+1;
	System.out.println(x);
}
}
