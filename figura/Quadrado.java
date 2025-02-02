package figura;

public class Quadrado extends Figura{          // Classe Quadrado que herda da classe Figura



    private double lado;

    public Quadrado(String tipo, String cor, double lado){                          // Construtor da classe Quadrado
         super(tipo, cor);                                               // Chama o construtor da superclasse      
        this.lado = lado;                                               // Atribui o valor do lado                               

    }

    public double getLado (){                                             // Método que retorna o valor do lado
        return lado;
    }

    public void setLado(){
        this.lado = lado;
    }

    @Override                                                               // Sobrescreve o método calcArea da superclasses
    public double calcArea(){                                               // Método que calcula a área do quadrado
        return lado * lado;
    }

    
}
