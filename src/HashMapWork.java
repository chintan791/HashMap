import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class HashMapWork {


	static HashMap<Integer, String> myMap = new HashMap<Integer, String>();

	static File file = new File("MyHashMap.txt");

	public static void main(String[] args) {


		fileReader();


		// Prompt user to enter a number

		Scanner sc = new Scanner(System.in);

		int i = 1;

		while (i == 1) {




			System.out.println("The number enetered is ");

			int num = sc.nextInt();

			if (myMap.containsKey(num)) {
				System.out.println(myMap.get(num));
			} else

			{
				System.out.println("Enter the string of number entered ");
				String alpha = sc.next();

				myMap.put(num, alpha);
			}


			System.out.println("to exit enter 0, to continue enter 1");
			i = sc.nextInt();


		}
		fileWriter();
	}


	private static void fileReader() 
	{
		try{
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) 
			{	
				Integer t = input.nextInt();
				String s= input.next();
				myMap.put(t, s);
				String line = input.nextLine();
			}
			input.close();
			
		}catch (IOException e) {
			e.getMessage();
		}



	}

	private static void fileWriter(){


		try{
			FileWriter fw= new FileWriter(file);
			PrintWriter writer = new PrintWriter(file);
			for (int key : myMap.keySet())
			{

				writer.print(key);
				writer.println("\t" + myMap.get(key));
				
			}
			writer.flush();
			writer.close();

		}catch  (IOException e) {
			e.getMessage();
		}

	}
	//	return myMap;


}
