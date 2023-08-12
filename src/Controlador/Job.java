package Controlador;

public class Job implements Runnable{
    
    public static boolean band=false; 
 
    
    
    /**
     * Constructor de clase
     */
    public Job(  ){
        
    }
    
    @Override
    public void run() {
        band=false;
        for (int i=0; i < 2 ; i++){
            System.out.println("Haciendo algo divertido... -> " + i + " segundo transcurrido.");

            try{Thread.sleep( 1000 );}
            catch (InterruptedException e){
                System.err.println( e.getMessage() );
            }
        }
        band=true;
        
    }
    
}
