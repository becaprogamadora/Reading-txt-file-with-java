package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LerAquivoTxt {
       
    public static void main(String[] args) throws FileNotFoundException{
       
        try (FileInputStream entradaAquivos = new FileInputStream(
            new File("C:\\Users\\Aroldo Magalhães\\Pictures\\teste java\\teste1\\src\\arquivos.txt"))) {
            Scanner lerArquivos = new Scanner(entradaAquivos,"UTF-8");

            while (lerArquivos.hasNext()) {
                String linha = lerArquivos.nextLine();

                if(linha != null && !linha.isEmpty()){
                    System.out.println(linha);
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
          
            e.printStackTrace();
        }
        

    }
}
