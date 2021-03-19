import javax.swing.*;

public class reto2 {
    public static void main(String[] args) {
        int opcion=-1,numN,numM,a,b;
        Cajero billete = new Cajero();
        CombinacionMN nm = new CombinacionMN();
        Potencias br = new Potencias();
        TablasMN mult = new TablasMN();
        try{

            while(opcion !=0){
                String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Tablas de multiplicar" +
                        "\n2.- Calculo de los N cuadrados\n" +
                        "3.- Cubos de Nicómaco\n" +
                        "4.- Cajero automático\n" +
                        "5.- Combinaciones de N elementos tomados de M\n" +
                        "0.- Salir\n************************");
                opcion = Integer.parseInt(lectura);
                switch(opcion){
                    case 1:
                        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que número N desea calcular las tablas de multiplicar: "));
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que número M desea que se visualicen las tablas: "));
                        mult.tablasMultiplicar(a,b);
                        break;
                    case 2:
                        int x= Integer.parseInt(JOptionPane.showInputDialog("Digite el número a elevar al cuadrado:"));
                        br.calculoCuadrados(x);
                        break;
                    case 3:
                        x= Integer.parseInt(JOptionPane.showInputDialog("Digite el número a elevar al cubo:"));
                        br.cubosNicomaco(x);
                        break;
                    case 4:
                        int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dinero a retirar:"));
                        billete.calculoBilletes(ingreso);
                        break;
                    case 5:
                        numN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número N: "));
                        numM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número M: "));
                        nm.combinacion(numN,numM);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"Saliendo");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opción inválida");break;
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Saliendo");
        }
}
}
