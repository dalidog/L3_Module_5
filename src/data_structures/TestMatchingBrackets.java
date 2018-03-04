package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack <Integer> s = new Stack <Integer>();
		for (int i = 0; i < b.length(); i++) {

			if(Character.toString(b.charAt(i)).equals("{")) {
				s.push(1);
				
			}
			else {
				if(s.size()!= 0){
					s.pop();
				
				}
				else {
					System.out.println("You have a rogue bracket!!!!!");
					return false;
				}
			}
		}
	
	

if(s.size() == 0) {
	System.out.println("ur all good");
	return true;
}
else {
	System.out.println("You have a rogue bracket!!!!!");
	return false;
}
}

	
}
