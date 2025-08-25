package ejeornitorrinco;

 import java.util.Random;
import java.util.Scanner;

public class Castor {
    protected double longitudCola;
    protected double velocidad;

    public Castor(double longitudCola, double velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }
// agregamos geter y seter para poder modificar cola y velocidad
    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    // le agrego el Random como pide en la consigna que tiene que ser un nro de 1 a 6 (como las cuerdas).
    public void tocarGuitarra(){
     Random random = new Random();
        System.out.println("El castor toca la guitarra");
        for (int i = 0; i < 3; i++){
            int cuerda = random.nextInt(6) + 1;
            System.out.println("Toca cuerda" + cuerda);    
        }
    }
    // le agrego el sout para mostrar a la velocidad que tiene que ir el castor "8km/h"
    public void nadar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad del castor (km/h)");
        
        velocidad= sc.nextDouble();
        
        System.out.println("El castor nada a " + velocidad + "km/h");
    }
   
   
    public String tostring(){
       return "Castor Cola: " + longitudCola + "cm, Velocidad: " + velocidad + " km/h";
   }
}