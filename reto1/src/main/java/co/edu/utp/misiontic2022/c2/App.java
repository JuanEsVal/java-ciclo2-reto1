package co.edu.utp.misiontic2022.c2;

import java.nio.channels.ClosedSelectorException;

public class App 
{
    public static void main( String[] args )
    {
        Franquicia franquicia1 = new Franquicia();
        Franquicia franquicia2 = new Franquicia(12, 1000, 0.10);
        
        
        System.out.println("\n");

        System.out.println(franquicia1.compararFranquicia(24, 2000, 0 ));
        System.out.println();
        System.out.println(franquicia2.compararFranquicia());

        System.out.println("\n");        
    }
}
