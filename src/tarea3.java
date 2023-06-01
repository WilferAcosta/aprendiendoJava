import java.util.Scanner;

public class mayorque{

    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        System.out.println("ingrese una cantidad de numeros para saber cual es el mayor");
        int n = scanner.nextLine();
        int mayor =0;
        for(int i = 0; i<n.length;i++){
                if(n[i]> mayor){
                    mayor=n;
                }
        }
    }   
}