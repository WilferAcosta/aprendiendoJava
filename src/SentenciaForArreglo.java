import javax.swing.*;
//iterando arreglo con for y palabras reservadas break y continue
public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"wilfer","orlando","acosta","rodriguez","pepe","mylady"};
        int count = nombres.length;
        for(int i =0;i<count;i ++){
            if (nombres[i].equalsIgnoreCase("wilfer") ||
                    nombres[i].equalsIgnoreCase("Orlando")) {
                continue;
            }
            System.out.println(i+"-"+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre , ejemplo \"orlando\"o\"wilfer\":");
        System.out.println("buscar = " + buscar);
//para buscar un nombre de un arreglo y mostrar si se encontro o no
        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println(i+".-" +nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema");
        }
    }

}
