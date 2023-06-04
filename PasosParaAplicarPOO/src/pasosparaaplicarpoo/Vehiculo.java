/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasosparaaplicarpoo;

import java.util.Scanner;

/**
 *
 * @author Martin Atia
 */
public class Vehiculo {
    private int patente;
    private String marca;
    private String modelo;
    private String color;
    private float valor;
    
    
    public Vehiculo(){
        this.patente=0;
        this.marca="";
        this.modelo="";
        this.color="";
        this.valor=0;
    }

    public Vehiculo(int patente, String marca, String modelo, String color, float valor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.valor = valor;
    }
    
    
    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos del vehiculo");
        System.out.print("Patente:");
        setPatente(entrada.nextInt());
        System.out.print("Marca:");
        setMarca(entrada.next());
        System.out.print("Modelo:");
        setModelo(entrada.next());
        System.out.print("Color:");
        setColor(entrada.next());
        System.out.print("Valor:");
        setValor(entrada.nextFloat());
    }
    public void mostrarDatos(){
        System.out.println("Los datos del vehiculo son:");
        System.out.println("Patente: " + getPatente() + " \t - Marca: "+ getMarca() + "\t - Modelo: "+getModelo() + "\t - Color: "+ getColor() + "\t - Valor: "+ getValor());
                
    }
    public float calcularImpuesto(){
        return getValor()/100 * 3;
    }
    public int getPatente() {
        return patente;
    }
    public void setPatente(int patente) {
        this.patente = patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
