package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class watchFile{
	
	private static boolean exists = false;
	private static String temp = "C:\\Users\\adam\\Desktop\\java\\workspace\\Villans\\battle-zone";
	


	public static boolean monitorFile(int num) {
		
		 	File location = new File(temp+num+".txt");
			exists = location.exists();
			return exists;
		 
		 
		 
	}
	
	
	public static String checkFile(int num) {

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
