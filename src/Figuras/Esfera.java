package Figuras;

public class Esfera extends Figuras {
    private double Radio;

    public Esfera(double Radio)    {
        this.Radio = Radio;
        this.setVolumen(Calcular_volumen());
        this.setSuperficie(Calcular_superficie());
    }

    public double Calcular_volumen()    {
        double Volumen = ((double) 4/3) * (Math.PI * Math.pow(Radio, 3));
        return Volumen;
    }

    public double Calcular_superficie() {
        double Superficie = 4 * Math.PI * Math.pow(Radio, 2);
        return Superficie;
    }
}