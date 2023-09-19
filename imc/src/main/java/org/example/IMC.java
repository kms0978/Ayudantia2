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
        IMC kid1 = new IMC(" ",1.0,1.0 );
        IMC kid2 = new IMC("",1.0,1.0);
        IMC kid3 = new IMC("",1.0,1.0);



        System.out.println("Nombre: " + kid1.getNombre());
        System.out.println("Peso: " + kid1.getPeso());
        System.out.println("Estatura: " + kid1.getEstatura());
        System.out.println("El infante pertenece a la categoria: " + kid1.categoria());
    }

    // Métodos --------------------------------------------------------------------

    public void agregarNombre() {
        do {
            System.out.print("Nombre: ");
            nombre = ingresar();
            mayusIngresado(nombre);
        }while(!validarNombre(nombre));
    }
    public void agregarPeso() {
        System.out.print("Peso: ");
        peso = ingresarNum();
    }
    public void agregarEstatura(){
        System.out.print("Estatura: ");
        estatura = ingresarNum();
    }

    public String mayusIngresado(String word){
        word = nombre.toUpperCase();
        return word;
    }

    public double calcularIMC(double a,double b){
        double imc = a/Math.pow(b,2);
        double imcAprox = (double) ((int) (imc * 100.0)) / 100.0;
        return imcAprox;
    }

    public String categoria() {
        double imcCalculado = calcularIMC(peso,estatura);
        String nivel = "";
        if (imcCalculado < 18.5) {
            nivel = "Bajo Peso";
        } else if ((imcCalculado >= 18.5) && (imcCalculado < 25.0)) {
            nivel = "Normal";
        } else if ((imcCalculado >= 25) && (imcCalculado < 30.0)) {
            nivel = "Sobrepeso";
        } else if (imcCalculado >= 30.0) {
            nivel = "Obesidad";
        }
        return nivel;
    }

    public double promedioPeso(){
        double promPeso = 0.0;
        return promPeso;
    }
    public double promedioEstatura(){
        double promEstatura = 0.0;
        return promEstatura;
    }

    // Validaciones ------------------------------------------------------
    public Boolean validarNombre(String nombre){
        return !nombre.isEmpty();
    }
    public double validarPeso(double valor){
        return valor;
    }
    public double validarEstatura(double valor){
        return valor;
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
