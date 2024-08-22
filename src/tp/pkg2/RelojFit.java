/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg2;

/**
 *
 * @author dylan
 */
public class RelojFit extends Reloj{
    private int pasos;

    public RelojFit(long numSerie, String modelo) {
        super(numSerie, modelo);
        this.pasos = 0;
    }

    public int getPasos() {
        return pasos;
    }
    
    public void cuentaPasos(int x, int y){
        this.pasos = pasos + Math.abs(x - y);
    }
    
    public void frecuenciaAleatoria(){
        int aleatorio = (int)(Math.random() * 50) + 1;
        System.out.println("Frecuencia:"+aleatorio);
    }
    
}
