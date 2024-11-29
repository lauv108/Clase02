import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola MI LAU!");

        System.out.println("ERES EL AMOR DE MI VIDA, I LOVE YOU!!!");

        System.out.printf("Aqui va una cadena: %s%n", "LAU"); 
        System.out.printf("Aqui va un entero: %d%n",17 );
        System.out.printf("Mi nombre es %s y tengo %d a:nos %n", "LAU", 17);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese un nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
}