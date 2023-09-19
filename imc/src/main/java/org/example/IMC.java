package org.example;

import java.util.Scanner;

public class IMC {
    // Atributos
    private String nombre;
    private double peso; // En Kilogramos
    private double estatura; // En metros


    public IMC(String nombre,double peso,double estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }
    public static void main(String[] args) {
        System.out.println("Inicializando");
        IMC kid_1 = new IMC(" ",1.0,1.0 );
        IMC kid_2 = new IMC(" ",1.0,1.0 );
        IMC kid_3 = new IMC(" ",1.0,1.0 );
        kid_1.agregarDatos();
        kid_2.agregarDatos();
        kid_3.agregarDatos();
        System.out.println("Nombre: " + kid_1.getNombre());
        System.out.println("Peso: " + kid_1.getPeso());
        System.out.println("Estatura: " + kid_1.getEstatura());


    }

    // Métodos --------------------------------------------------------------------


    public void agregarDatos(){
        do {
            System.out.print("Nombre: ");
            nombre = ingresar();
            mayusIngresado(nombre);
        }while(!validarNombre(nombre));

        do {
            System.out.print("Peso: ");
            peso = ingresarNum();
        }while(!validarPeso(peso));

        do {
            System.out.print("Estatura: ");
            estatura = ingresarNum();
        }while(!validarEstatura(estatura));
    }

    public String mayusIngresado(String word){
        word = nombre.toUpperCase();
        return word;
    }

    public double calcularIMC(){
        double imc = peso/Math.pow(estatura,2);

        return;
    }

    // Validaciones ------------------------------------------------------
    public Boolean validarNombre(String nombre){
        return !nombre.isEmpty();
    }
    public double validarPeso(double valor){
        return valor;
    }
    public double validarEstatura(double estatura){
        return estatura;
    }

    // Métodos para ingresar Datos --------------------------------------------
    public String ingresar(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    public double ingresarNum(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    // Métodos get ------------------------------------------------------------
    public String getNombre(){
        return nombre;
    }
    public double getPeso(){
        return peso;
    }
    public double getEstatura(){
        return estatura;
    }

}
