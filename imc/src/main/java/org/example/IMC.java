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
        kid_1.agregarNombre();
        System.out.println("Nombre: " + kid_1.getNombre());

        //System.out.println("Peso: " + kid_1.getPeso());
        //System.out.println("Estatura: " + kid_1.getEstatura());
    }

    // Métodos --------------------------------------------------------------------
    public void agregarNombre() {
        do {
            System.out.print("Nombre: ");
            nombre = ingresar();
            mayusIngresado(nombre);
        } while (!validarNombre(nombre));
    }
    public void agregarPeso() {
        do {
            System.out.print("Peso: ");
            peso = ingresarNum();
        } while (!validarPeso(peso));
    }
    public void agregarEstatura{
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
        double imcAprox = (double) ((int) (imc * 100.0)) / 100.0;
        return imcAprox;
    }

    public String categoria() {
        double imcCalculado = calcularIMC();
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
        try{

        }catch (){

        }
        return valor;
    }
    public double validarEstatura(double valor){

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
