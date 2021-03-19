import javax.swing.*;

public class Cajero {
    public void calculoBilletes(int valor){
        try{
            while(valor>=2000){
                int dos_lucas,cinco_lucas,diez_lucas,veinte_lucas,cincuenta_lucas,cien_lucas;
                //calculo de la cantidad de billetes de 100
                cien_lucas=valor/100000 ; //aquí se guarda el contador de los billetes
                valor =valor-(cien_lucas*100000); // valor restante a calcular
                //calculo de la cantidad de billetes de 50
                cincuenta_lucas = valor/50000;
                valor = valor-(cincuenta_lucas*50000);
                //calculo de la cantidad de billetes de 20
                veinte_lucas= valor/20000;
                valor = valor-(veinte_lucas*20000);
                //calculo de la cantidad de billetes de 10
                diez_lucas = valor/10000;
                valor = valor-(diez_lucas*10000);
                //calculo de la cantidad de billetes de 5
                cinco_lucas = valor/5000;
                valor = valor-(cinco_lucas*5000);
                //calculo de la cantidad de billetes de 2
                dos_lucas = valor/2000;
                valor = valor-(dos_lucas*2000);
                //condicionales que muestran en pantalla la cantidad de billetes al usuario
                if(cien_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+cien_lucas+" billete(s) de cien mil pesos.");
                    System.out.println("Se deben entregar "+cien_lucas+" billete(s) de cien mil pesos.");
                }if(cincuenta_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+cincuenta_lucas+" billete(s) de cincuenta mil pesos.");
                    System.out.println("Se deben entregar "+cincuenta_lucas+" billete(s) de cincuenta mil pesos.");
                }if(veinte_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+veinte_lucas+" billete(s) de veinte mil pesos.");
                    System.out.println("Se deben entregar "+veinte_lucas+" billete(s) de veinte mil pesos.");
                }if(diez_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+diez_lucas+" billete(s) de diez mil pesos.");
                    System.out.println("Se deben entregar "+diez_lucas+" billete(s) de diez mil pesos.");
                }if(cinco_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+cinco_lucas+" billete(s) de cinco mil pesos.");
                    System.out.println("Se deben entregar "+cinco_lucas+" billete(s) de cinco mil pesos.");
                }if(dos_lucas>0){
                    JOptionPane.showMessageDialog(null,"Se deben entregar "+dos_lucas+" billete(s) de dos mil pesos.");
                    System.out.println("Se deben entregar "+dos_lucas+" billete(s) de dos mil pesos.");
                }
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Se han introducido caracteres no numéricos");
        }
    }
}
