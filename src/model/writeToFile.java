package model;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class writeToFile {
	
	//static int num = 0;
	public static void write(String arg, int num) {
		
		
		
		try(FileWriter fw = new FileWriter("C:\\Users\\adam\\Desktop\\java\\workspace\\Villans\\battle-zone"+num+".txt", true);
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
		
		try {
			Files.move 
			        (Paths.get("C:\\Users\\adam\\Desktop\\java\\workspace\\Villans\\battle-zone"+num+".txt"),  
			        Paths.get("C:\\Users\\adam\\Desktop\\java\\workspace\\Villans\\saved-the-world-again\\battle-zone"+num+".txt"));
					System.out.println("File renamed and moved successfully"); 
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to move the file"); 
		} 
		  
		
		
		
	}
	
}