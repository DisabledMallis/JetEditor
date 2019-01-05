package us.Mallis.JetEditor;

import java.util.Scanner;

import us.Mallis.JetEditor.BTD5.Extract;
import us.Mallis.JetEditor.BTD5.Pack;

public class Main {

	public static String path = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		System.out.println(path);
		System.out.println("JetEditor v3.0 by Mallis");
		System.out.println("Thanks to my school for not teaching me how to do this shit.");
		System.out.println("Thanks to Bukkit for getting me started in Java.");
		System.out.println("of course, thanks to the modding community of BTD5 for their smarts.");
		System.out.println("Oh and my uncle for getting me a book on programming for christmas.");
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Options: 1. Extract 2. Pack");
			int n = input.nextInt();
			if(n == 1) {
				input = new Scanner(System.in);
				System.out.println("Options: 1. BTD5 2. BTDB");
				n = input.nextInt();
				if(n == 1) {
					System.out.println("Extracting...");
					Extract.extractBtd5();
					System.out.println("Done!");
					break;
				}
			}
			if(n == 2) {
				input = new Scanner(System.in);
				System.out.println("Options: 1. BTD5 2. BTDB");
				n = input.nextInt();
				if(n == 1) {
					System.out.println("Packing...");
					Pack.packBtd5();
					System.out.println("Done!");
					break;
				}
			}
		}
	}

}
