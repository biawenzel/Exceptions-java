package exercicios;

import javax.swing.*;

//fazer a divisão de 2 numeros inteiros
public class UncheckedExceptions {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: "+ resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Entrada inválida, informe um numero inteiro! "+ e.getMessage());
            //e.printStackTrace();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Impossível dividir um numero por 0. ");
        }
        finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) { return a/b; }
}
