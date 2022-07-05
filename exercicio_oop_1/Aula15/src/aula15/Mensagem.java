/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author vinic
 */
public abstract class Mensagem {
    private String conteudo;
    
    public Mensagem(String conteudo){
        setConteudo(conteudo);
    }
    
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    
    public String getConteudo(){
        return this.conteudo;
    }
}
