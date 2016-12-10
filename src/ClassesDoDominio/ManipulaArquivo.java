package ClassesDoDominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTextField;

public class ManipulaArquivo {
    
    /*public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
 
    public static void escritor(String path, JTextField campo) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println(campo.getText());
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }*/
    
    public void lerArquivo(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4) {
        File arquivo = new File("clientes.txt");
        
        try {
            
            FileWriter escreve = new FileWriter(arquivo,true);
            BufferedWriter escreveBuffer = new BufferedWriter(escreve);
      
            escreveBuffer.append(System.getProperty ("line.separator")+System.getProperty ("line.separator")+"Nome do cliente: "+campo1.getText()+System.getProperty ("line.separator")+"Endereço: "+campo2.getText());
            escreveBuffer.append(System.getProperty ("line.separator")+"E-mail: "+campo3.getText()+System.getProperty ("line.separator")+"Telefone: "+campo2.getText());
            escreveBuffer.close();
            escreve.close();
            
            /*FileReader ler = new FileReader(arquivo);
            BufferedReader lerBuffer = new BufferedReader(ler);
            
            String linha = lerBuffer.readLine();
            
            while(linha != null) {
                System.out.print(linha);
                linha = lerBuffer.readLine();
            }*/
        } catch (IOException ex) {
            
        }
    }
    
}
