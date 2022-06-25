package carro;

public class Carro {
    public static void main(String[] args) {
        Radio r1 = new Radio(true, "FM", 103.2f, 100);
        Radio r2 = new Radio();
        
        
        System.out.println(r1.toString("r1"));
        System.out.println(r2.toString("r2"));
        
        // utilizando metodos do radio-1
        r1.trocarEstacao();
        r1.baixarVolume();
        r1.baixarVolume();
        r1.mudarFrequencia(111.5f);

        // utilizando metodos do radio-2 com ele desligado
        r2.colocarEstacaoAM();
        r2.aumentarVolume();
        r2.aumentarVolume();
        r2.mudarFrequencia(93.5f);

        System.out.println(r1.toString("r1"));
        System.out.println(r2.toString("r2"));

        // utilizando metodos do radio-2 
        r2.ligarRadio();
        r2.colocarEstacaoAM();
        r2.aumentarVolume();
        r2.aumentarVolume();
        r2.mudarFrequencia(93.5f);
        
        System.out.println(r1.toString("r1"));
        System.out.println(r2.toString("r2"));
        
    }
    
}
