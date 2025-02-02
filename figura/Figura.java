package figura;
public class Figura {

    private String tipo;

    private String cor;

    public Figura(String tipo, String cor){
        this.cor = cor;
        this.tipo = tipo;

    }

    public String getTipo (){
        return tipo;
    }
    
    public void  setTipo(){
         this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(){
        this.cor = cor;
    }

    public double calcArea(){
        return 0;
    }

    public String toString(){
        return "Tipo: " + tipo + " - cor: " + cor + " - área: " + calcArea();
        
    }


}

