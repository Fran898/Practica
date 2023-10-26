/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Persona {
    //Declaracion de atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    
    public Persona(String nombre, String apellido1, String apellido2, String dni){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        
    }
    
    
    
    public String clave(){
        String clave = nombre.substring(0, 1).concat(apellido1.substring(0,3).concat(apellido2.substring(apellido2.length()-1)));
        return clave;
        
    }
    
    public boolean dniValido(){
        String dniVal = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = Integer.parseInt(dni.substring(0,8))%23;
                
        return dni.length() == 9 &&  dniVal.charAt((int)num) == dni.charAt(8); 
    }
    
  
    
}
