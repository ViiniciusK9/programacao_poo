package aula13;

/**
 *
 * @author vinic
 */
public abstract class Forma {
    private double medida[];
    
    public Forma(int numMedidas){
        medida = new double[numMedidas];
    }

    public double getMedida(int i) {
        if(i < 0 || i >= medida.length){
            throw new RuntimeException("Numero da medida inválido!");
        }
        
        return medida[i];
    }

    public int getNumMedidas(){
        return medida.length;
    }
    
    public void setMedida(int i, double m) {
        if(i < 0 || i >= medida.length){
            throw new RuntimeException("Numero da medida inválido!");
        }
        
        if(m <= 0){
            throw new RuntimeException("Medida " + i + "inválida.");
        }
        
        this.medida[i] = m;
    }
    
    public abstract double area();
}
