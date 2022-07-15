package exercicios;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console
public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt"; //nome do arquivo a ser impresso

        try {
            imprimirArquivo(nomeDoArquivo);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo!" + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte!" + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivo(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do { //comando pra imprimir o .txt no console
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
