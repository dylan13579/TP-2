/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg2;

/**
 *
 * @author aguse
 */
public class Persona {
  private String nombre;
  private String apellido;
  private int edad;
  private double altura;
  private Reloj unReloj;

    public Persona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Reloj getUnReloj() {
        return unReloj;
    }

    public void setUnReloj(Reloj unReloj) {
        this.unReloj = unReloj;
    }
    
    public void decirHora(Reloj r){
        if (r != null){
            System.out.println("La hora es: "+r.getHora());

        }else
            System.out.println("No puedes ver la hora porque no tienes un reloj");
     }
}
