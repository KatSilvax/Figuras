package aplicacao;
import figura.*;

public class main {
    public static void main (String[] args) {

        System.out.println("Criando figuras:");



        Retangulo r = new Retangulo ("Retangulo", "Azul", 100, 80);    // Cria um objeto da classe Retangulo

        Triangulo t = new Triangulo ("Triagulo", "verde", 100,80 );    // Cria um objeto da classe Triangulo
        
         Quadrado q = new Quadrado ("Quadrado", "Preto", 100);           // Cria um objeto da classe Quadrado
                                                                 

        

        
        System.out.println(r);
        System.out.println(t);
        System.out.println(q);




        
   
    }
    
}
