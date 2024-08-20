/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author aguse
 */
public class Reloj {
     private String dia;
    private String hora;
    private long numSerie;
    private String modelo;

    public Reloj(long numSerie, String modelo) {
        this.dia = LocalDate.now().toString();
        this.hora = LocalTime.now().toString();
        this.numSerie = numSerie;
        this.modelo = modelo;
    }

    public Reloj() {
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
    
    public long getNumSerie() {
        return numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void incrementarHora(int horas) {
        LocalTime horaActual = LocalTime.parse(this.hora);
        LocalTime nuevaHora = horaActual.plusHours(horas);
        this.hora = nuevaHora.toString();
    }
    
    public void incrementarDia(int dias) {
        LocalDate diaActual = LocalDate.parse(this.dia);
        LocalDate nuevoDia = diaActual.plusDays(dias);
        this.dia = nuevoDia.toString();
    }
    
    public void limpiarPantalla(){
        System.out.println("La pantalla fue limpiada con exito!");
    }
    
}
