import java.util.Scanner;

public class Readings {
    public static void main(String[] args) {
        boolean condition = true;
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

        while(condition){
            System.out.println(textMenu);
            Scanner keyboard = new Scanner(System.in);
            int optionSelected = keyboard.nextInt();
            if(optionSelected == 7){
                System.out.println("Fin del programa.");
                condition = false;
            }
            System.out.println("Opción seleccionada: " + optionSelected);
        }

    }
}
