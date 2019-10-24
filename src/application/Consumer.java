package application;
// Consumer with a run method that loops, reading 10 values from buffer.
import java.util.Random;

import model.Buffer;
import model.Observing;
import controller.consumerController;
import model.heroFactory;

public class Consumer implements Runnable
{ 
	
   private heroFactory factory = new heroFactory();
   private Observing observe = new Observing("", -1);
   private final static Random generator = new Random();
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
      int prev = -1;
      observe.registerObserver(factory);

      for ( int count = 1; count <= 10; count++ ) 
      {
         // sleep 0 to 3 seconds, read value from buffer and add to sum
         try 
         {
            //Thread.sleep( generator.nextInt( 5000 ) );
        	Thread.sleep(5000);
            numFile = sharedLocation.get();
            
            consumerController consume = new consumerController(numFile, observe);
            consume.start();

            //sum += sharedLocation.get();
            //System.out.println("Sum = "+ sum);
         } // end try
         // if lines 26 or 27 get interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } // end catch
      } // end for

      //System.out.printf( "\n%s %d\n%s\n", 
       //  "Consumer read values totaling", sum, "Terminating Consumer" );
   } // end method run
} // end class Consumer
