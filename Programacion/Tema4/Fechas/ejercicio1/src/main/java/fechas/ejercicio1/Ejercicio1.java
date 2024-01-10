/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fechas.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Letra letra[] = new Letra[3];
        
        for(int i = 0; i < letra.length; i++){
            System.out.println("------- Letra Nº : " + (i+1) + " -------" );
            letra[i] = new Letra();
        }
        
        for(int i = 0; i < letra.length; i++){
            if(!letra[i].vencida()){
                letra[i].mostrar();
            }
            if(letra[i].devuelveMes().equals("enero")){
                letra[i].demoran(15);
            }
        }
        for(int i = 0; i < letra.length; i++){
            letra[i].getTitular();
            letra[i].diasFaltan();
        }
       
    }
}
