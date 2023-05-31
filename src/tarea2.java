import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el Primer nombre ");
        String nombre1 = scanner.nextLine();
        System.out.println("Digite el Segundo nombre ");
        String nombre2 = scanner.nextLine();
        System.out.println("Digite el Tercer nombre ");
        String nombre3 = scanner.nextLine();

        String nombre1A = nombre1.toUpperCase().charAt(1)+"."+nombre1.substring(nombre1.length()-2);
        String nombre2A = nombre2.toUpperCase().charAt(1)+"."+nombre2.substring(nombre2.length()-2);
        String nombre3A = nombre3.toUpperCase().charAt(1)+"."+nombre3.substring(nombre3.length()-2);

        String resultado = nombre1A+"_"+nombre2A+"_"+nombre3A;
        System.out.println(resultado);

    }
}
