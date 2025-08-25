package ejeornitorrinco;

import java.util.Scanner;

public class OrnisAzul extends Castor {
    private double propulsion;
    private String nombre;
    public OrnisAzul(double longitudCola, double velocidad, String nombre) {
        super(longitudCola, velocidad);
        this.nombre = nombre;
    }

    @Override
    public void nadar() {
        // la velocidad final = velocidad del padre + propulsion propia
        Scanner sc = new Scanner(System.in);
        //realizamos un bucle para q ingrese un valor correcto
        do{
        System.out.println("Ingrese el valor de propulsion entre los valores de 5 a 10 km/s");
        propulsion= sc.nextInt();
        
        if(propulsion <5 || propulsion >10){
            
            System.out.println("Ingrese un valor correcto");
        }
        }while (propulsion < 5 || propulsion >10);
        
        double velocidadFinal = getVelocidad() + propulsion;
        System.out.println(nombre + " (ornitorinco azul) activa propulsion de " + propulsion + " km/h → nada a " + velocidadFinal + " km/h");
    }
    
    
     public double getPropulsion(){
        return propulsion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
}
