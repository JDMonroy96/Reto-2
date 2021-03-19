import javax.swing.*;

public class CombinacionMN {
    public static long calcularFactorial(int n){
        long factorial = 1;
        for(int cont=2;cont<=n;cont++){
            factorial*=cont;
        }
        return factorial;
    }
    public void combinacion(int n,int m) {
        int resta;
        long combinatoria;
        try {
            resta = n - m;
            if (n >= 0 && m >= 0 && n > m) {
                combinatoria = calcularFactorial(n) / (calcularFactorial(m) * (calcularFactorial(resta)));
                JOptionPane.showMessageDialog(null, "La combinación de N elementos tomados de M es: " + combinatoria);
            } else {
                JOptionPane.showMessageDialog(null, "No es posible realizar la operación, intentelo de nuevo");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Se han introducido caracteres no numéricos");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Se está intentando una división por 0");
        }
    }
    }
