import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try{//manejo de errores
            numeroDecimal = Integer.parseInt(numeroStr);//si sale bien continua con la app
        }catch(NumberFormatException e){// eror letras digitadas ejecura el error
            JOptionPane.showMessageDialog(null,"Error debe ingresar un numero entero");
            main(args);//re ejecuta
            System.exit(0);//si sale bien continua y sale
        }//aca termina el manejo del error

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal +" = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "numero octal de  = " + numeroBinario + " = "+ Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHex = "numero hexadecimal de = " + numeroOctal+ " = "+ Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n"+ resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
