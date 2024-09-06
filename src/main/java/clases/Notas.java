/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Notas {

    private Double[] notas;
    private Double promedio = 0.0;
    private int superior;
    private int inferior;

    public Notas(Double[] notas) {
        this.notas = notas;
    }

    public void calcularPromedio() {
        Double temp = 0.0d;
        for (Double nota : notas) {
            temp += nota;
        }
        promedio = temp / notas.length;
    }

    public void notaSuperior() {
        superior = 0;
        for (Double nota : notas) {
            if (nota > promedio) {
                superior++;
            }
        }
    }

    public void notaInferior() {
        inferior = 0;
        for (Double nota : notas) {
            if (nota < promedio) {
                inferior++;
            }
        }
    }

    public Double getPromedio() {
        return promedio;
    }

    public int getSuperior() {
        return superior;
    }

    public int getInferior() {
        return inferior;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
   
}
