import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero: si es falso;

        String variable = 7 == 7 ? "si es verdadero" :"si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0 ;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la nota de matematicas en escala de 1-5: ");
        matematicas = scanner.nextDouble();

        System.out.println("ingrese la nota de ciencias en escala de 1-5: ");
        ciencias = scanner.nextDouble();

        System.out.println("ingrese la nota de historia en escala de 1-5: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias +historia) /3;

        estado = promedio >= 3.0 ? "Aprovado" : "Rechazado";
        System.out.println("estado = " + estado +"y su promedio es: " + promedio);

        /*if (promedio >= 5.49){
            estado = "Aprovado";
        } else {
            estado = "Rechazado";
        }*/
    }
}
