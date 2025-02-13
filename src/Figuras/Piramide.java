package Figuras;

public class Piramide extends Figuras {
    private double Base;
    private double Altura;
    private double Apotema;

    public Piramide(double Base, double Altura, double Apotema)    {
        this.Base = Base;
        this.Altura = Altura;
        this.Apotema = Apotema;
        this.setVolumen(Calcular_volumen());
        this.setSuperficie(Calcular_superficie());
    }

    public double Calcular_volumen()    {
        double Volumen = (Base * Base * Altura)/3;
        return Volumen;
    }

    public double Calcular_superficie() {
        double Superficie = (Base * Base) + (2 * Base * Apotema);
        return Superficie;
    }
}