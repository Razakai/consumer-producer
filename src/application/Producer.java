package application;
import controller.producerController;
import model.Buffer;
import model.Factory;

public class Producer implements Runnable
{
  
   private final Buffer sharedLocation; // reference to shared object
   private final Factory villanFactory = new Factory();
   // constructor
   public Producer( Buffer shared )
   {
       sharedLocation = shared;
   } 

   // store values from 1 to 10 in sharedLocation
   public void run()                             
   {

      for ( int count = 1; count <= 10; count++ )
      {
         try 
         {
            sharedLocation.set( count ); // set value in buffer
            producerController produce = new producerController(villanFactory, count);
            produce.start();
            Thread.sleep(5000);
            
         }
         catch ( InterruptedException exception ) 
         {
            exception.printStackTrace();
         } 
      } 

      System.out.println( 
         "Producer done producing\nTerminating Producer" );
   }
} 
