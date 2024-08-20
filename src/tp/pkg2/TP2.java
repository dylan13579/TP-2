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
        
        Reloj r = new Reloj(123,"Samsung");
        
        p.setUnReloj(r);
        
        p.decirHora(r);
        
        r.incrementarHora(2);
        
        p.decirHora(r);
        
        
    }
    
}
