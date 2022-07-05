package aula15;

public abstract class Forma {
    private double medida[];
    
    public Forma(int numMedidas){
        medida = new double[numMedidas];
    }
    
    public double getMedida(int posMedida){
        if(posMedida < 0 && posMedida >= medida.length){
            throw new RuntimeException("Número de medida invalido!");
        }
        
        return medida[posMedida];
    }
    
    public int getNumMedidas(){
        return medida.length;
    }
    
    public void setMedida(int posMedida, double valor){
        if(posMedida < 0 && posMedida >= medida.length){
            throw new RuntimeException("Número de medida invalido!");
        }
        
        if(valor < 0){
            throw new RuntimeException("Valor da medida #" + posMedida + " invalido!");
        }
        
        medida[posMedida] = valor;
    }

    public abstract double area();
}

