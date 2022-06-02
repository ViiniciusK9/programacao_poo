package carro;

public class Carro {
    public static void main(String[] args) {
        Radio r1 = new Radio(true, "FM", 103.2f, 100);
        Radio r2 = new Radio();
        
        r1.status("r1");
        r2.status("r2");
        
        r1.trocarEstacao();
        r1.baixarVolume();
        r1.baixarVolume();

        r2.ligarRadio();
        r2.colocarEstacaoAM();
        r2.aumentarVolume();
        r2.aumentarVolume();
        r2.mudarFrequencia(93.5f);
        
        r1.status("r1");
        r2.status("r2");
        
    }
    
}
