import java.util.Scanner;

public class TareaMostrarNumeroMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("este programa va a tomar dos numero para comparar si es mayor o menor");
        System.out.println("digite el primer numero para comparar");
        int num1 = scanner.nextInt();
        System.out.println("digite el segundo numero para comparar");
        int num2 = scanner.nextInt();

         String resultado = num1 < num2 ? "el numero es dos es mayor y es: "+num2+" y el numero uno es el menor es: "+num1:"el numero uno es mayor es: "+num1+" el numero menor es:"+num2;

        System.out.println("el resultado es: "+ resultado);
    }
}
