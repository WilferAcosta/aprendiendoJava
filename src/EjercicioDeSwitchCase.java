import java.util.Scanner;

public class EjercicioDeSwitchCase {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("digite el numero del mes ");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1 :
                nombreMes = "Enero";
                break;
            case 2 :
                nombreMes = "Febrero";
                break;
            case 3 :
                nombreMes = "Marzo";
                break;
            case 4 :
                nombreMes = "Abril";
                break;
            case 5 :
                nombreMes = "Mayo";
                break;
            case 6 :
                nombreMes = "Junio";
                break;
            case 7 :
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9 :
                nombreMes = "Septiembre";
                break;
            case 10 :
                nombreMes = "Octubre";
                break;
            case 11 :
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("el numero no concide con ningun mes");
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
