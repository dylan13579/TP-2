/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author dylan
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Persona p = new Persona("Marco","Rodriguez",55,180);
        
        RelojFit r = new RelojFit(123,"Samsung");
        
        System.out.println("hora actual:");
        p.setUnReloj(r);
        p.decirHora(r);
        
        System.out.println("2 horas adelantada:");
        r.incrementarHora(2);
        p.decirHora(r);
        
        r.cuentaPasos(8, 12);
        System.out.println("pasos:"+r.getPasos());
        r.frecuenciaAleatoria();
        
    }
    
}
