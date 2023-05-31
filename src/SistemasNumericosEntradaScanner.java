import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{//manejo de errores
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);//si sale bien continua con la app
        }catch(InputMismatchException e){// eror letras digitadas ejecura el error
            System.out.println("Error debe ingresar un numero entero");
            main(args);//re ejecuta
            System.exit(0);//si sale bien continua y sale
        }//aca termina el manejo del error

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal +" = "+Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de  = " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal+ " = "+ Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n"+ resultadoHex;
        System.out.println(mensaje);
    }
}
