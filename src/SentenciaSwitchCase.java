public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num =1;
        switch (num){

            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el nuermo es one");
                break;
            case 3:
                System.out.println("el numero es tres");
                break;
            case 4:
                System.out.println("el numero es cuatro");
                break;
            default:
                System.out.println("numero o caracter desconocido");

        }
        String nombre = "wilfer";
        switch (nombre){
            case "admi":
                System.out.println("hola admi , bienvenido");
                break;
            case "wilfer":
                System.out.println("hola wilfer");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("usuario desconocido");

        }
    }
}
