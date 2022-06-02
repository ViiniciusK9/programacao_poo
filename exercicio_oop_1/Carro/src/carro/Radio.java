package carro;

public class Radio {
    private boolean ligado;
    private String estacao;
    private float frequencia;
    private int volume;
    
    public Radio(){
        this.ligado = false;
        this.volume = 0;
        this.estacao = "";
        this.frequencia = 0f;
    }
    
    public Radio(boolean ligado, String estacao, float frequencia, int volume){
        setLigado(ligado);
        setEstacao(estacao);
        setFrequencia(frequencia);
        setVolume(volume);
    }
    
    public boolean isLigado(){
        return ligado;
    }
    
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    public String getEstacao(){
        return estacao;
    }
    
    private void setEstacao(String estacao){
        if(estacao.equals("AM") || estacao.equals("FM")){
            this.estacao = estacao;
        } else {
            System.out.println("Estacao invalida!");
        }
    }
    
    public int getVolume(){
        return volume;
    }
    
    private void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        } else {
            System.out.println("Volume invalido!");
        }
    }
    
    public float getFrequencia(){
        return frequencia;
    }
    
    private void setFrequencia(float frequencia){
        this.frequencia = frequencia;
    }
    
    public void aumentarVolume(){
        if(isLigado()){
            if(volume + 10 <= 100){
                volume += 10;
            } else {
                System.out.println("Volume ja esta no maximo!");
            }
        } else {
            System.out.println("Radio desligado!");
        }
    }
    
    public void baixarVolume(){
        if(volume - 10 >= 0){
            volume -= 10;
        } else {
            System.out.println("Volume ja esta no minimo!");
        }
    }
    
    public void trocarEstacao(){
        if(isLigado()){
            if(estacao.equals("")){
                setEstacao("FM");
            } else if (estacao.equals("FM")){
                setEstacao("AM");
            } else {
                setEstacao("FM");
            }
        } else {
            System.out.println("Radio desligado!");
        }
    }
    
    public void colocarEstacaoFM(){
        if(isLigado()){
            setEstacao("FM");
        } else {
            System.out.println("Radio desligado!");
        }
    }
    
    public void colocarEstacaoAM(){
        if(isLigado()){
            setEstacao("AM");
        } else {
            System.out.println("Radio desligado!");
        }  
    }
    
    public void ligarRadio(){
        if(isLigado() == true){
            System.out.println("Radio ja esta ligado.");
        } else {
            setLigado(true);
        }
    }
    
    public void desligarRadio(){
        if(isLigado() == false){
            System.out.println("Radio ja esta desligado.");
        } else {
            setLigado(false);
        }
    }
    
    public void mudarFrequencia(float frequencia){
        if(isLigado()){
            if(frequencia >= 0 && frequencia <= 200){
                setFrequencia(frequencia);
            } else {
                System.out.println("Frequencia invalida!");
            }
        } else {
            System.out.println("Radio desligado!");
        } 
    }
    
    public String toString(String nome){
        return ("Nome: " + nome) + ('\n') +
        ("Ligado: " + this.ligado) + ('\n') +
        ("Estacao: " + this.estacao) + ('\n') +
        ("Frequencia: " + this.frequencia) + ('\n') +
        ("Volume: " + this.volume) + ('\n');
        
    }
}
