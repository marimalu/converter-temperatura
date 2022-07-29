package Pessoais.ConverterTemperatura;

public class Calculos {
    protected double tempCelsius;
    protected double tempKelvin;
    protected double tempFahrenheit;

    //Funções de conversão
    //Celsius
    public double celsiusToKelvin(){
        return (tempCelsius + 273.15);
    }
    public double celsiusToFahrenheit() {
        return (tempCelsius * 1.8) + 32;
    }

    //Fahrenheit
    public double fahrenheitToKelvin(){
        return (tempFahrenheit - 32) * 5/9 + 273.15;
    }
    public double fahrenheitToCelsius() {
        return (tempFahrenheit - 32) / 1.8;
    }

    //Kelvin
    public double kelvinToFahrenheit() {
        return (tempKelvin - 273.15) * 9/5 + 32;
    }
    public double kelvinToCelsius() {
        return (tempKelvin - 273.15);
    }

}