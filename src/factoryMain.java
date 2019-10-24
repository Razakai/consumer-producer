
public class factoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		heroFactory factory = new heroFactory();
		
		Observing file = new Observing("");
		file.registerObserver(factory);
		while(true) {
			
			if(watchFile.monitorFile() == true) {
				String heroNeeded = watchFile.checkFile();
				if(heroNeeded != null) {
					System.out.println("Hero name:"+ heroNeeded);
					file.setPresent(heroNeeded);
				}
				
				
			}
		}
		
		

	}

}
