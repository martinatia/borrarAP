/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasosparaaplicarpoo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martin Atia
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Vehiculo auto;
    
    public Persona(){
        this.dni=0;
        this.nombre="";
        this.apellido="";
        this.auto= new Vehiculo();
    }
    
    
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Vehiculo getAuto() {
        return auto;
    }
    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }
    
    
    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, ingrese los datos del dueño");
        System.out.print("DNI:");
        setDni(entrada.nextInt());
        System.out.print("Nombre:");
        setNombre(entrada.next());
        System.out.print("Apellido:");
        setApellido(entrada.next());
        setAuto(new Vehiculo());
        getAuto().leerDatos();                
    }
    public void mostrarImpuestoVehiculo(){
        float impuestoDelVehiculo = getAuto().calcularImpuesto();
        System.out.println("El impuesto anual del vehiculo es: "+ impuestoDelVehiculo);
    }
     public void mostrarDatos(){
        System.out.println("");
        System.out.println("Los datos del dueño son:");
        System.out.println("DNI:" + getDni() + "\t - Nombre: "+getNombre() + "\t - Apellido: "+ getApellido());
        getAuto().mostrarDatos();  
        mostrarImpuestoVehiculo();

    }   
}
