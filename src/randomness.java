import java.util.Random;

public class randomness {
	public static void main(String[] args) {
		randomtf();
		randomnumber();
	}
public static boolean randomtf() {
	Random tf = new Random();
	int num = tf.nextInt(1);
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
	
}
}
