package ejeornitorrinco;

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
