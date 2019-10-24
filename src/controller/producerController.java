package controller;

import model.Factory;
import model.person;
import model.writeToFile;

public class producerController extends Thread{
	
	private Factory factory;
	private int fileNum;
	public producerController(Factory factory, int num) {
		this.factory = factory;
		this.fileNum = num;
		
	}
	
	
	
	
	
	
	
	
	
	
	public void run() {
		person villan = factory.orderPerson();
		writeToFile.write(villan.getName(), fileNum);
		//writeToFile.moveFile(fileNum);

	}

}
