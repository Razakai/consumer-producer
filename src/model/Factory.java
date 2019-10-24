package model;

import java.util.Random;

public class Factory {
	static private PersonStore BadFlyMan = new BadFlyManFactory();
	static private PersonStore BadStrongMan = new BadStrongManFactory();
	static private PersonStore BadAntMan = new BadAntManFactory();
	static private Random rand = new Random();
	public person orderPerson(){
		int num = rand.nextInt(3)+1;
	      		
	      
	       if(num == 1){
	        // return new heroJoe();
	    	  person temp = BadStrongMan.createPerson();
	    	 System.out.println("my name is:"+temp.getName());
	    	 return temp;
	    	  //writeToFile.write(temp.getName());
	       }
	   	
	      else if(num == 2){
	         //return new heroPeter();
	    	  person temp = BadAntMan.createPerson();
	    	  System.out.println("my name is:"+temp.getName());
	    	  //writeToFile.write(temp.getName());
	    	  return temp;
	      }
	      
	      else if(num == 3){
		         //return new heroPeter();
		    	  person temp = BadFlyMan.createPerson();
		    	  System.out.println("my name is:"+temp.getName());
		    	  //writeToFile.write(temp.getName());
		    	  return temp;
		      }
		return null;
	   
	}

}
