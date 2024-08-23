/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2;
import java.util.Scanner;
import java.util.InputMismatchException;
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
        
        Scanner scanner = new Scanner(System.in);
        try {
            
        System.out.print("¿Cuantas horas quisiera adelantar? ");
        
        int horasAdelantar = scanner.nextInt();
        
        System.out.println("Cantidad de horas adelantadas:");
        r.incrementarHora(horasAdelantar);
        p.decirHora(r);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero correcto!.");
            scanner.next(); 
        }
        try {
        System.out.print("¿Para calcular los pasos ingrese X e Y ? ");
        System.out.println("X:");
        int x = scanner.nextInt();
        System.out.println("Y:");
        int y = scanner.nextInt();
        
        
        r.cuentaPasos(x, y);
        System.out.println("pasos:"+r.getPasos());
        } catch (InputMismatchException e) {
        System.out.println("Ingrese un numero correcto!.");
        scanner.next();
        }  
         
        r.frecuenciaAleatoria();
        
    }
    
}
