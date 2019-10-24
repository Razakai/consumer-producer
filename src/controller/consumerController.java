package controller;

import model.Observing;
import model.writeToFile;

public class consumerController extends Thread{
	
	private int fileNum;
	private Observing observer;
	
	
	public consumerController(int num, Observing obj) {
		this.fileNum = num;
		this.observer = obj;
	}
	

	
	public void run() {
		
		if(model.watchFile.monitorFile(this.fileNum) == true) {
			String heroNeeded = model.watchFile.checkFile(this.fileNum);
			if(heroNeeded != null) {
				System.out.println("Hero name:"+ heroNeeded);
				this.observer.setPresent(heroNeeded, fileNum);
			}
			
			
		}
		writeToFile.moveFile(fileNum);
		
	}

}
