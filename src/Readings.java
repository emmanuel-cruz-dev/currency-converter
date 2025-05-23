import java.util.Scanner;

public class Readings {
    public static void main(String[] args) {
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
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
                    System.out.println("Opción 1 seleccionada.");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada.");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada.");
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada.");
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada.");
                    break;
                case 6:
                    System.out.println("Opción 6 seleccionada.");
                    break;
                case 7:
                    System.out.println("Opción 7 seleccionada. Fin del programa.");
                    break;
            }
        }

    }
}
