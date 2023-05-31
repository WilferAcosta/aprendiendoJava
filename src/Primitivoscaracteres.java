public class Primitivoscaracteres {
    public static void main(String[] args) {
        var caracter ='\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal== caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("(simbolo == caracter) = " + (simbolo == caracter));

        char ESPACIO = '\u0040';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLine = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte = "+ Character.BYTES);
        System.out.println("char corresponde en byte = "+ Character.SIZE);
        System.out.println("char corresponde en byte = "+ Character.MAX_VALUE);
        System.out.println("char corresponde en byte ="+ Character.MIN_VALUE);
    }
}
