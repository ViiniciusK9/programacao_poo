/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author vinic
 */
public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    
    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3){
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    
    public void pinta(String cor){
        this.cor = cor;
    }
    
    public int quantasPortasEstaoAbertas(){
        int quant = 0;
        
        if(porta1.isAberta() == true){
            quant++;
        }
        
        if(porta2.isAberta() == true){
            quant++;
        }
        
        if(porta3.isAberta() == true){
            quant++;
        }
        
        return quant;
    }
    
}
