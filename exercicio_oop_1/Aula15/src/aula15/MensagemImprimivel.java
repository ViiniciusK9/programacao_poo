/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author vinic
 */
public class MensagemImprimivel extends Mensagem implements Imprimivel{
    public MensagemImprimivel(String conteudo){
        super(conteudo);
    }
    
    @Override
    public void Imprimir(){
        ImprimirNoConsole();
    }
    
    @Override
    public void ImprimirNoConsole(){
        System.out.println(Imprimivel.INICIO);
        System.out.println(getConteudo());
        System.out.println(Imprimivel.FIM);
    }
}
