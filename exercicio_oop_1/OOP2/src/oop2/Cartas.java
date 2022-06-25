package oop2;

public class Cartas {
    private int numero;
    private String naipe;

    public Cartas(){}
    
    public Cartas(int numero, String naipe) throws Exception {
        setNumero(numero);
        setNaipe(naipe);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        // validação e tratamento de exceções
        if(numero >= 1 && numero <= 13){
            this.numero = numero;
        }else {
            throw new Exception("Numero da carta é invalido!");
        }
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) throws Exception {
        // validação e tratamento de exceções
        if("ouros".equals(naipe) || "copas".equals(naipe) || "paus".equals(naipe) || "espadas".equals(naipe)){
            this.naipe = naipe;
        }else {
            throw new Exception("Naipe da carta é invalido!");
        }  
    }
}
