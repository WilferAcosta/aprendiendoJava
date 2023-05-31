import javax.swing.*;


public class TareaNombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("digite el primer nombre completo");
        String nombre2 = JOptionPane.showInputDialog("digite el segundo nombre completo");
        String nombre3 = JOptionPane.showInputDialog("digite el tercer nombre completo ");

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1 ;
        System.out.println("max = " + max);
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : nombre3;

        System.out.println("la persona con nombre mas largo es "+ max);

    }
}
