package model;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class writeToFile {
	
	public static void write(String arg, int num) {
		
		//creates and writes to the battle-zone files
		
		try(FileWriter fw = new FileWriter("battle-zone"+num+".txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("\n"+arg);
			    System.out.println("Hero added");
			    
			    
			} catch (IOException e) {
				System.out.println(e);
			    
			}
	}
	
	public static void moveFile(int num) {
		// moves the location of the defeated villan battle-zone file to saved the world again
		try {
			Files.move 
					(Paths.get("battle-zone"+num+".txt"),  
				     Paths.get("savedTheWorldAgain\\battle-zone"+num+".txt"));
					System.out.println("File renamed and moved successfully"); 
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to move the file"); 
		} 
		  
		
		
		
	}
	
}