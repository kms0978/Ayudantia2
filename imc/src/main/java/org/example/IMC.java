package org.example;

import java.util.Scanner;

public class IMC {
    // Atributos
    private String nombre;
    private double peso; // En Kilogramos
    private double altura; // En metros


    public IMC(String nombre,String p) {
        this.nombre = nombre;
        this.rut = rut;
    }
    public static void main(String[] args) {
        System.out.println("Inicializando");
        Propietario p1 = new Propietario(" "," ");
        p1.agregarDatos();
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("RUT: " + p1.getRut());
    }

    public String ingresar(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public void agregarDatos(){
        do {
            System.out.print("Nombre: ");
            nombre = ingresar();
            mayusIngresado(nombre);
        }while(!validarNombre(nombre));
    }

    public String mayusIngresado(String word){
        word = nombre.toUpperCase();
        return word;
    }

    public Boolean validarNombre(String nombre){
        return !nombre.isEmpty();
    }

    public String getNombre(){
        return nombre;
    }
}
