package ejeornitorrinco;

import java.util.*;

public class EjeOrnitorrinco {

    public static void main(String[] args) {
       
        
        
        //este
        
        
        OrniVerde Pochinki = new OrniVerde (18.3,7,"Pochinki");
        OrnisAzul Blue= new OrnisAzul(16.2,6,"Blue");
        OrnisAzul Blui= new OrnisAzul(14.8,6,"Blui");
        
        
        //Ejecutamos habilidades
        
        
        System.out.println("-----ORNITORRINCO VERDE------");
        //
        
        Pochinki.nadar(); 
        Pochinki.tocarGuitorgan();
        Pochinki.tocarOrgano();
        Pochinki.tocarGuitarra(); //NOS DEJA EJECUTARLO POR QUE LO HEREDA
        
        
        System.out.println("-----ORNITORRINCOS AZULES-----");
        
        
        System.out.println("---BLUE----");
        
        Blue.nadar(); 
        Blue.tocarGuitarra();
        
        System.out.println("---BLUI---");
        Blui.nadar();
        Blue.tocarGuitarra();
        
        
        //ARREGLO
        
        Castor[] hermanos= new Castor[3]; 
        
        //usamos el exception !
        try{
        hermanos[0]= Blue;
        hermanos [1]= Pochinki;
        hermanos [2]= Blui;
        
        // SE ROMPE CUANDO LLEGAMOS A LA BLUI
        // SE SUPONE Q LO ROMPEMOS
        
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR : PASASTE EL LIMITE DEL ARREGLO");
            
            
        }finally{
            System.out.println("Los OrniHermanos juntos al fin");
        }
        
        
        
                // Lista de mejores nadadores
        ArrayList<OrnisAzul> mejoresNad = new ArrayList<>();
        
        
        for (int i = 0; i < hermanos.length; i++) {
            Castor h = hermanos[i];
            if (h instanceof OrnisAzul) {
                mejoresNad.add((OrnisAzul) h);
            }
        }
        
        
        
        // Ordenar lista por propulsion
        mejoresNad.sort(Comparator.comparingDouble(OrnisAzul::getPropulsion));

        // Mostrar lista ordenada
        System.out.println("---Lista propulsión ascendente---");
        Iterator<OrnisAzul> it = mejoresNad.iterator();
        while (it.hasNext()) {
            OrnisAzul o = it.next();
            System.out.println(o.getNombre() + " con propulsión: " + o.getPropulsion());
        }
    
        
        
    }
    
}
