import java.io.IOException;
import java.util.Scanner;

public class Readings {
    public static void main(String[] args) {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        String optionText = "Ingresa el valor que desear convertir:";
        double convertedValue;
        double valueToConvert;
        String textMenu = """
                **********************************************
                Sea bienvenido/a al Conversor de Moneda =)
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                **********************************************
                """;

        while(option != 7){
            System.out.println(textMenu);
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        ApiService service = new ApiService("USD", "ARS", valueToConvert);
                        Coins result = service.getCoin();
                    System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + result + " [ARS]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        ApiService service = new ApiService("ARS", "USD", valueToConvert);
                        Coins result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [ARS] corresponde al valor final de =>>> " + result + " [USD]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        ApiService service = new ApiService("USD", "BRL", valueToConvert);
                        Coins result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + result + " [BRL]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();

                    try{
                        ApiService service = new ApiService("BRL", "USD", valueToConvert);
                        Coins result = service.getCoin();
                        System.out.println("El valor " + valueToConvert + " [BRL] corresponde al valor final de =>>> " + result + " [USD]");
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error al obtener información de la moneda: " + e.getMessage());
                    }

                    break;
                case 5:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();
                    convertedValue = valueToConvert * 15;
                    System.out.println("El valor " + valueToConvert + " [USD] corresponde al valor final de =>>> " + convertedValue + " [COP]");
                    break;
                case 6:
                    System.out.println(optionText);
                    valueToConvert = keyboard.nextDouble();
                    convertedValue = valueToConvert / 15;
                    System.out.println("El valor " + valueToConvert + " [COP] corresponde al valor final de =>>> " + convertedValue + " [USD]");
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

    }
}
