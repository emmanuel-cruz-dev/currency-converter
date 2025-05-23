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
            if(option == 7){
                System.out.println("Fin del programa.");
            }
            System.out.println("Opción seleccionada: " + option);
        }

    }
}
