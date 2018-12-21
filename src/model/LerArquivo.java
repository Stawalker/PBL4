
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.util.Cidade;

/**
 *
 * @author Daniel
 */
public class LerArquivo {
    
    FileReader ler;
    
    BufferedReader buf;
    String cidade1, cidade2,pontoX1, pontoX2,pontoY1,pontoY2, rota;
    
    

    
    public LerArquivo() {
        try {
            this.ler = new FileReader("C:\\Users\\Daniel\\Documents\\Nova Pasta\\RotaCar\\src\\Mapa Bahia.txt");
            this.buf = new BufferedReader(ler);
           
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void leitura(){
        String cont = " ";
         String  text = " ";
        try {
            buf.readLine(); // Faz o pulo para a segunda Linha
           // while(text!=null){
               /* Começa ler da segunda Linha*/
                text = buf.readLine(); 
                
                String []array = text.split(";");
                cidade1=array[0];
                cidade2 = array[1];
                rota=array[2];               
              
                //ponto1=array[3];
                String [] pontosCartesianos1 = array[3].split(",");
                //ponto2 = array[4];
                String [] pontosCartesianos2= array[4].split(",");
               //cont = text;
               pontoX1=pontosCartesianos1[0];
               pontoY1=pontosCartesianos1[1];
               
               
                pontoX2=pontosCartesianos2[0];
                pontoY2=pontosCartesianos2[1];
                
                int cX1 = Integer.parseInt(pontoX1);
                  int cY1 = Integer.parseInt(pontoY1);
                  int cX2 = Integer.parseInt(pontoX2);
                    int cY2 = Integer.parseInt(pontoY2);
                    
                /*    
                System.out.println(cidade1+" "+cX1 + " "+ cY1);
                System.out.println(cidade2+" "+cX2+" "+ cY2);
                System.out.println("Rota" +" "+ rota);
                */
               Cidade cid1 = new Cidade(cX1,cY1,cidade1);
               Cidade cid2 = new Cidade(cX2,cY2,cidade2);
               System.out.println(cid1.getNome());
               System.out.println(cid2.getNome());
               
           // }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            
    }
    

    
}
