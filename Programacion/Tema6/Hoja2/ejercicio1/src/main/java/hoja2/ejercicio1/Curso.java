/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Curso {

    private String codigo;
    private String desc;
    private int nHoras;

    public Curso(String codigo, String desc, int n) {
        this.codigo = codigo;
        this.desc = desc;
        nHoras = n;

    }

    public Curso() {
        codigo = Teclado.string("Inserte el codigo:");
        
        do {
            desc = Teclado.string("Inserte una descripcion: ");
           if(desc.matches(".*\\d.*")){
               System.out.println("El texto no debe contener numeros");
           }
        } while (desc.matches(".*\\d.*"));
        nHoras = Teclado.enteroPos("Inserte el numero de horas: ");

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

}
