package exercicios;

public class Porta {
    private boolean aberta; 
    private String cor; 
    private int dimensaoX;
    private int dimensaoY; 
    private int dimensaoZ;
    
    public Porta(boolean aberta, String cor, int dimensaoX, int dimensaoY, int dimensaoZ){
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }
    
    public boolean isAberta(){
        return aberta;
    }
    
    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public int getDimensaoX(){
        return dimensaoX;
    }
    
    public void setDimensaoX(int dimensaoX){
        this.dimensaoX = dimensaoX;
    }
    
    public int getDimensaoY(){
        return dimensaoY;
    }
    
    public void setDimensaoY(int dimensaoY){
        this.dimensaoY = dimensaoY;
    }
    
    
    public int getDimensaoZ(){
        return dimensaoZ;
    }
    
    public void setDimensaoZ(int dimensaoZ){
        this.dimensaoZ = dimensaoZ;
    }
    
    // abre, fecha, pinta, estaAberta
    
    public void abre(){
        if(isAberta() == true){
            System.out.println("Porta ja esta aberta!");
        }else {
            this.aberta = true;
        }
    }
    
    public void fecha(){
        if(isAberta() == false){
            System.out.println("Porta ja esta fechada");
        }else {
            this.aberta = false;
        }
    }
    
    public void pinta(String cor){
        setCor(cor);
    }
    
    public boolean estaAberta(){
        return isAberta();
    }
}
