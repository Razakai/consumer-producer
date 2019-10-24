package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class watchFile{
	
	private static boolean exists = false;
	//private static String temp = "C:\\Users\\adam\\Desktop\\java\\designPatternsWorkspace\\battle-zone";
	private static String temp = "battle-zone";

	


	public static boolean monitorFile(int num) { 
		// checks if file exists, if it does it returns true
		 	File location = new File(temp+num+".txt");
			exists = location.exists();
			return exists;
		 
		 
		 
	}
	
	
	public static String checkFile(int num) {
		// reads content of file to see if the content is a villan, if so it returns the name of the villan
		try {
			File location = new File(temp+num+".txt");
			BufferedReader br = new BufferedReader(new FileReader(location));
			String st; 
			  while ((st = br.readLine()) != null) 
			  {
				 
				  String[] parts = st.split(" ");
				 
				  if(parts[0].equals("Bad")) // three star prize
				  {
					 
					  br.close();
					  
					  return parts[1];
				  }
					  
				  
			  }
			  br.close();
			  
		
		
		
		
		} 
		
		catch (IOException e) { // catches error when reading in from file
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}



	
	

}
