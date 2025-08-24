package ejeornitorrinco;

import java.util.Scanner;

public class OrniVerde extends Castor implements MamaPato {

    private String nombre;

    public OrniVerde(double longitudCola, double velocidad, String nombre) {
        super(longitudCola, velocidad);
        this.nombre = nombre;
    }

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi");
        sc.nextLine();
        System.out.println("Fa-Sol-La-Si");
        System.out.println(nombre + " Usa su pico de " + pico + " cm "+ " ,y usa sus patas de " + pata + " cm");
    }

    public void tocarGuitorgan() {
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println(nombre + " Esta tocando el guitorgan");
        System.out.println("Cuack cuack!");

    }
}
