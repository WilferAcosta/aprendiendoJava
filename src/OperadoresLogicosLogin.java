import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usuarios = new String[3];
        String[] passwords = new String[3];

        usuarios[0] = "wilfer";
        passwords[0] = "12345";

        usuarios[1] = "orlando";
        passwords[1] = "12345";

        usuarios[2] = "rodriguez";
        passwords[2] = "12345";*/
        //definir un arreglo de forma mas simple
        String[] usuarios = {"andres","wilfer","orlando"};
        String[] passwords = {"12345","12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrse su usuario");
        String u = scanner.next();

        System.out.println("Ingrese si password");
        String p = scanner.next();

        boolean esAutentucado = false;

        for(int i = 0; i < usuarios.length; i++){
            esAutentucado = ( usuarios[i].equals(u) && passwords[i].equals(p)) ? true : esAutentucado;
            /*if( usuarios[i].equals(u) && passwords[i].equals(p)) {
                esAutentucado = true;
                break;
                }*/

        }
        String mensaje = esAutentucado ? "Bienvenido usuario ".concat(u).concat("!"):"usuario o pasword incorrecta!\nlos sentimos, requere auteticacion";
        System.out.println("mensaje = " + mensaje);

        /*if(esAutentucado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("usuario o pasword incorrecta");
            System.out.println("los siento, requere auteticacion");
        }*/

    }

}
