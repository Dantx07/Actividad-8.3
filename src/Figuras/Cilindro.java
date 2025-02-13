package Figuras;

import java.time.LocalTime;

public class Cilindro extends Figuras {
    private double Radio;
    private double Altura;

    public Cilindro(double Radio, double Altura)    {
        this.Radio = Radio;
        this.Altura = Altura;
        this.setVolumen(Calcular_volumen());
        this.setSuperficie(Calcular_superficie());
    }

    public double Calcular_volumen()    {
        double Volumen = Math.PI * Altura * Math.pow(Radio, 2);
        return Volumen;
    }

    public double Calcular_superficie() {
        double Superficie = 2 * Math.PI * ((Radio * Altura) + (Math.pow(Radio, 2)));
        return Superficie;
    }
}