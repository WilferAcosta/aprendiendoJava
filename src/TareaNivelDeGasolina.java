import java.util.Scanner;

public class TareaNivelDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite los litros de gasolina");
        int litros = scanner.nextInt();

        if ( litros == 70){
            System.out.println("el taque esta lleno");
        }else if (litros >= 60 && litros < 70){
            System.out.println(" el taque esta casi lleno");
        }else if (litros >=40 && litros < 60){
            System.out.println("el tanque esta 3/4");
        }else if (litros >=35 && litros < 40){
            System.out.println("el taque esta a la mitad");
        }else if (litros >= 20 && litros < 35){
            System.out.println("el taque esta suficiente");
        }else if (litros >=1 && litros < 20){
            System.out.println("tanque insuficiente");
        }else {
            System.out.println("a sobrepasado el nivel del tanque");
        }
    }
}

