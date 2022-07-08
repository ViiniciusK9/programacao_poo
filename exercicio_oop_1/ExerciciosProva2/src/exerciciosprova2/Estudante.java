/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosprova2;
import java.util.function.DoubleSupplier;

/**
 *
 * @author vinic
 */


public class Estudante {
    private String nome;
    private double notas[] = new double[3];
    
    public Estudante(String nome) throws Exception {
        setNome(nome);
    }
    
    public void atribuirPontoExtra(int posNota) throws Exception {
        if(posNota < 0 || posNota >= 3){
            throw new RuntimeException("Posição invalida!");
        }
        
        if(notas[posNota] + 1 > 10){
            throw new RuntimeException("Não foi possivel atribuir ponto extra para essa nota.");
        }
        
        notas[posNota] += 1;
    }
    
    /*
    public double calcularMedia(){
        double media = 0;
        
        for (int i = 0; i < 3; i++){
            media += notas[i];
        }
        
        return (media / 3);
    }
    */
    
    /*
    // Usando expressão lambda e DoubleSupplier
    public double calcularMedia(){
        DoubleSupplier res = () -> {
            double soma = 0;
            for(int i = 0; i < 3; i++){
                soma += notas[i];
            }
            return soma / 3;
        };
        return res.getAsDouble();
    }
    */
    
    static double efetuarCalculo(Calculavel calc){
        return calc.calcular();
    }
    
    public double calcularMedia(){
        return efetuarCalculo(() -> {
            double soma = 0;
            for(double i : notas){
                soma += i;
            }
            return soma / 3;
        });
    }
    
    public String getNome() {
        return nome;
    }

    public 
        void setNome(String nome) throws Exception {
        if(nome.length() < 2){
            throw new RuntimeException("Nome invalido, nome precisa ter mais de 2 caracteres!");
        }
        
        this.nome = nome;
    }

    public double getNota(int posNota) throws Exception {
        if(posNota < 0 || posNota >= 3){
            throw new RuntimeException("Posição invalida!");
        }
        
        return notas[posNota];
    }

    public void setNota(int posNota, double nota) throws Exception {
        if(posNota < 0 || posNota >= 3){
            throw new RuntimeException("Posição invalida!");
        }
        
        if(nota < 0 || nota > 10){
            throw new RuntimeException("Nota invalida!");
        }
        
        notas[posNota] = nota;
    }
}


       
        
        
        
        
        
        
        
      