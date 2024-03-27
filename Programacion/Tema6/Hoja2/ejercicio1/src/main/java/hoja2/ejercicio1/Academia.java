/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.LinkedList;

/**
 *
 * @author Francisco Sitjar
 */
public class Academia {
    LinkedList<Curso> cursos = new LinkedList<Curso>();
    
    public Academia(){
        
    }
    
    public void insertarCursoFinal(Curso c){
        cursos.addLast(c);
    }
    
    public void insertarCursoIndex(Curso c, int n){
        cursos.add(n, c);
    }
    
    public void borrarCurso(String cod){
        cursos.removeIf(c -> c.getCodigo().equals(cod));
    }
    
    public void modificarHoras(String cod, int n){
        cursos.forEach(c -> {
            if(c.getCodigo().equals(cod)){
                c.setnHoras(n);
            }
        });      
        
        
    }
    
    @Override
    public String toString(){
        String texto = "";
        for(Curso c : cursos){
            texto += "\nCodigo: " + c.getCodigo() + "\nDesc: " + c.getDesc() + "\nHoras: " + c.getnHoras();
        }
        return texto;
        
    } 
    
}
