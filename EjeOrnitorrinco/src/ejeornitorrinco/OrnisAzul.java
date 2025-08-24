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
        
    }
    
    
}
