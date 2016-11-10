import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {
	public void leitura(String caminho) throws IOException {
        Path path = Paths.get(caminho);
         try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
           String linha = null;
           while ((linha = br.readLine()) != null){
              System.out.println(linha); 
           }//fecha while
         }//fecha try
      }//fecha leitura()
}//fecha classe
