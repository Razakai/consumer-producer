package application;
import model.Buffer;
import model.Observing;
import controller.consumerController;
import model.heroFactory;

public class Consumer implements Runnable
{ 
	
   private heroFactory factory = new heroFactory();
   private Observing observe = new Observing("", -1);
   private final Buffer sharedLocation; // reference to shared object

   // constructor
   public Consumer( Buffer shared )
   {
      sharedLocation = shared;
   } // end Consumer constructor

   // read sharedLocation's value 10 times and sum the values
   public void run()                                           
   {
      int numFile = 0;
     
      observe.registerObserver(factory);

      for ( int count = 1; count <= 10; count++ ) 
      {
         
         try 
         {
            
        	Thread.sleep(5000);
            numFile = sharedLocation.get();
            
            consumerController consume = new consumerController(numFile, observe);
            consume.start();

           
         } 
        
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } 
      }

      
   } 
} 
