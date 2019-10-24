package application;
// Producer with a run method that inserts the values 1 to 10 in buffer.
import java.util.Random;

import controller.producerController;
import model.Buffer;
import model.Factory;

public class Producer implements Runnable
{
   private final static Random generator = new Random();
   private final Buffer sharedLocation; // reference to shared object
   private final Factory villanFactory = new Factory();
   // constructor
   public Producer( Buffer shared )
   {
       sharedLocation = shared;
   } // end Producer constructor

   // store values from 1 to 10 in sharedLocation
   public void run()                             
   {

      for ( int count = 1; count <= 10; count++ )
      {
         try // sleep 0 to 3 seconds, then place value in Buffer
         {
            //Thread.sleep( generator.nextInt( 5000 ) ); // random sleep
            sharedLocation.set( count ); // set value in buffer
            producerController produce = new producerController(villanFactory, count);
            produce.start();
            Thread.sleep(5000);
            
         } // end try
         // if lines 25 or 26 get interrupted, print stack trace
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } // end catch
      } // end for

      System.out.println( 
         "Producer done producing\nTerminating Producer" );
   } // end method run
} // end class Producer
