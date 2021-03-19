import javax.swing.*;

public class Potencias {

        int  potencia=0;
        public void  calculoCuadrados(int x){
            int cont=0;
            for(int i=0;cont<x;i++) {
                if (i % 2 != 0) { //se valida si el número es par o impar con el modulo
                    potencia = potencia + i; //se almacena el número
                    cont = cont +1; //se aumenta el contador
                }
            }
            JOptionPane.showMessageDialog(null,x+" al cuadrado es igual a "+potencia);
            System.out.println(x+" al cuadrado es igual a "+potencia);
            potencia = 0;

        }

        public void cubosNicomaco(int x){
            int cont = 0;
            for(int i=x*(x-1);cont <x;i++) {
                if (i % 2 != 0 && i >= x )  {
                    potencia = potencia + i;
                    cont = cont + 1;
                }
            }
            JOptionPane.showMessageDialog(null,x+" al cubo es igual a "+potencia);
            System.out.println(x+" al cubo es igual a "+potencia);
            potencia = 0;
        }
}
