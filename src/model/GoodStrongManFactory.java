package model;

import model.GoodStrongMan;

public  class GoodStrongManFactory extends PersonStore {

	@Override
	person createPerson() {
		//if (type.equals("GOODFLYMAN"))
		
			return new GoodStrongMan();
		
		
		
		
		
		
	}

	
	

}
