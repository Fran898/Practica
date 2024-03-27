/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio4;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Titulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        
        
        List<Partido>  partidos = new ArrayList();
        Partido p1 = new Partido("Barça", "Madrid", 3, 1);
        Partido p2 = new Partido("Madrid", "Barça", 1, 3);
        Partido p3 = new Partido("AA","BB", 1,1);
        
        partidos.add(p1);
        partidos.add(p2);
        partidos.add(p3);
        System.out.println("Partidos totales: " + partidos.size());
        
        partidos.forEach(p ->System.out.println("{Partido: \n"  + p.toString() + "}"));
        
        
        
        partidos.removeIf(n -> n.getGolesLocal() == n.getGolesVisitante());
        
        partidos.forEach(p ->System.out.println("{Partido: \n"  + p.toString() + "}"));
        
    }
}
