/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
     Academia a = new Academia();
     boolean salir = false;
     do{
         System.out.println("1. Añadir un nuevo curso al final de la lista");
         System.out.println("2. Insertar un nuevo curso en cualquier posición");
         System.out.println("3. Borrar un curso");
         System.out.println("4. Modificar horas de un curso");
         System.out.println("5. Moostrar todos los cursos");
         System.out.println("6. Salir");
         int op = Teclado.entero("Pulse opcion: ");
         
         switch(op){
             case 1  -> {
                 System.out.println("Crea un curso: ");
                 Curso c = new Curso();
                 a.insertarCursoFinal(c);
             }
             case 2 -> {
                 System.out.println("Crea un curso");
                 Curso c = new Curso();
                 int temp = Teclado .entero("Posicion del curso");
                 a.insertarCursoIndex(c, temp);
             }
             case 3 ->{
                 a.borrarCurso(Teclado.string("Inserta el codigo del curso a borrar: "));
             }
             case 4 -> a.modificarHoras(Teclado.string("Inserta el codigo del curso a modificar: "), Teclado.entero("Inserta las nuevas horas del curso"));
             case 5 -> System.out.println(a.toString());
             case 6 -> salir = true;
             default -> System.out.println("Opcion no valida");
             
          
         }
         
     }while(!salir);
     
     
        
    }           
}
