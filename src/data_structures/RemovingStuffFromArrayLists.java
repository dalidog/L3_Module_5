package data_structures;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */
class Stuff {
	

}
class Worm extends Stuff {
}
class Dirt extends Stuff {
}
public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		
		
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		

		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		for (int i = stuffIFoundInTheYard.size()-1; i >=0; i--) {
			if(stuffIFoundInTheYard.get(i) instanceof Dirt) {
				stuffIFoundInTheYard.remove(i);
			}
		}
		System.out.println(stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');
		for (int i = truth.size()-1; i >=0; i--) {
			System.out.println("hi");
			if(truth.get(i) .equals('#')) {
				truth.remove(i);
			}
		}
System.out.println(truth);
		/* TODO 2: Remove the hash symbols and print out the truth. */

	}
}
