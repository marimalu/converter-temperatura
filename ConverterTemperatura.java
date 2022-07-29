package Pessoais.ConverterTemperatura;
import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculos cal = new Calculos();

        int opcao, escala;

        do {
            System.out.println("\nConversor de Temperatura");
            System.out.println("Digite a opção que deseja no menu abaixo:");
            System.out.println("1) Converter Temperatura\n2) Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("\nSelecione as escalas termométricas que deseja converter:");
                System.out.println("1) Celsius para Fahrenheit\n2) Celsius para Kelvin\n3) Fahrenheit para Celsius\n4) Fahrenheit para Kelvin\n5) Kelvin para Celsius\n6) Kelvin para Fahrenheit");
                escala = sc.nextInt();

                if (escala == 1) {
                    System.out.println("\nDigite a temperatura em Grau Celsius:");
                    cal.tempCelsius = sc.nextDouble();

                    System.out.println("\n" + cal.tempCelsius + "°C convertido(s) para Fahrenheit é: " + cal.celsiusToFahrenheit() + "°F");
                }

                else if (escala == 2) {
                    System.out.println("\nDigite a temperatura em Grau Celsius:");
                    cal.tempCelsius = sc.nextDouble();

                    System.out.println("\n" + cal.tempCelsius + "°C convertido(s) para Kelvin é: " + cal.celsiusToKelvin() + " K");
                }

                else if (escala == 3) {
                    System.out.println("\nDigite a temperatura em Grau Fahrenheit:");
                    cal.tempFahrenheit = sc.nextDouble();

                    System.out.println("\n" + cal.tempFahrenheit + "°F convertido(s) para Celsius é: " + cal.fahrenheitToCelsius() + "°C");
                }

                else if (escala == 4) {
                    System.out.println("\nDigite a temperatura em Grau Fahrenheit:");
                    cal.tempFahrenheit = sc.nextDouble();

                    System.out.println("\n" + cal.tempFahrenheit + "°F convertido(s) para Kelvin é: " + cal.fahrenheitToKelvin() + " K");
                }

                else if (escala == 5) {
                    System.out.println("\nDigite a temperatura em Kelvin:");
                    cal.tempKelvin = sc.nextDouble();

                    System.out.println("\n" + cal.tempKelvin + " K convertido(s) para Celsius é: " + cal.kelvinToCelsius() + "°C");
                }

                else if (escala == 6) {
                    System.out.println("\nDigite a temperatura em Kelvin:");
                    cal.tempKelvin = sc.nextDouble();

                    System.out.println("\n" + cal.tempKelvin + " K convertido(s) para Fahrenheit é: " + cal.kelvinToFahrenheit() + "°F");
                }

                else {
                    System.out.println("\nEntrada inválida. Por favor, digite apenas números entre 1 a 6.");
                }

            } 
            
            else if (opcao == 2) {
                System.out.println("\nSaindo...");
                System.exit(0);
            }

            else {
                System.out.println("\nEntrada inválida. Por favor, digite apenas 1 ou 2.");
            }

        } while (opcao != 2);

        sc.close();
    }
}