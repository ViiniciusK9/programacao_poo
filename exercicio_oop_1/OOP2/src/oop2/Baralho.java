package oop2;

import java.util.Scanner;

public class Baralho {
    private final String naipes[] = new String[] {"ouros", "paus", "espadas", "copas"};
    private int tamanhoDoBaralho;
    private Cartas vetorCartas[];
    
    public Baralho(int tamanhoDoBaralho) throws Exception {
        this.vetorCartas = new Cartas[tamanhoDoBaralho];
        setTamanhoDoBaralho(tamanhoDoBaralho);
    }

    public int getTamanhoDoBaralho() {
        return tamanhoDoBaralho;
    }

    private void setTamanhoDoBaralho(int tamanhoDoBaralho) throws Exception {
        if(tamanhoDoBaralho >= 0){
            this.tamanhoDoBaralho = tamanhoDoBaralho;
        } else {
            throw new Exception("Tamanho do baralho precisa ser maior do que ZERO!");
        }
        
    }

    public Cartas[] getVetorCartas() {
        return vetorCartas;
    }

    private void setVetorCartas(Cartas[] vetorCartas) {
        this.vetorCartas = vetorCartas;
    }
    
    private int getNumeroAleatorio(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    private void trocaVetor(int index1, int index2){
        Cartas aux = vetorCartas[index1];
        vetorCartas[index1] = vetorCartas[index2];
        vetorCartas[index2] = aux;
    }
    
    public void gerar_baralho_padrao() throws Exception {
        if(tamanhoDoBaralho != 52){
            throw new Exception("Erro de tamanho do baralho, para criar uma baralho padrão é necessario ter 52 cartas.");
        }
        
        for (int i = 0; i < naipes.length; i++){
            for (int j = 1; j < 14; j++){
                try{
                    Cartas carta = new Cartas(j, naipes[i]);
                    vetorCartas[i*13+j-1] = carta;
                }
                catch (Exception error){
                    System.out.println(error);
                    throw new Exception("Erro ao criar cartas, quando tentou gerar o baralho com cartas padão.");
                }
            }
        }
    }
    
    public void gerar_baralho_customizado() throws Exception {
        for (int i = 0; i < tamanhoDoBaralho; i++){
            try{
                Scanner sc = new Scanner(System.in);
                
                System.out.printf("Digite o numero da carta: ");
                int numero = sc.nextInt();
                System.out.printf("Digite o naipe da carta: ");
                String naipe = sc.next();
                
                Cartas carta = new Cartas((int) numero, naipe);
                vetorCartas[i] = carta;
            }
            catch (Exception error){
                System.out.println(error);
                throw new Exception("Erro ao criar cartas, quando tentou gerar o baralho com cartas customizadas.");
            }
            
        }
    }
    
    public void mostrar_baralho(){
        System.out.println("Baralho possui " + tamanhoDoBaralho + " cartas.");
        System.out.println("------------------------");
        for (int i = 0; i < tamanhoDoBaralho; i++){
            System.out.println("Numero: " + vetorCartas[i].getNumero() + " Naipe: " + vetorCartas[i].getNaipe());
        }
        System.out.println("------------------------");
    }
    
    public void embaralhar(){
        int quantidadeDeTrocas = tamanhoDoBaralho * 8;
        for (int i = 0; i < quantidadeDeTrocas; i++){
            trocaVetor(getNumeroAleatorio(0, tamanhoDoBaralho), getNumeroAleatorio(0, tamanhoDoBaralho));
        }
    }
    
}
