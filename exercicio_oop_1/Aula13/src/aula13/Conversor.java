package aula13;

public class Conversor {
    protected double kProp, kLin;
    
    public Conversor(double kProp, double kLin){
        this.kProp = kProp;
        this.kLin = kLin;
    }

    public double getkProp() {
        return kProp;
    }

    public double getkLin() {
        return kLin;
    }
    
    public double converter(double valor){
        return valor * kProp + kLin;
    }
    
    @Override
    public String toString(){
        return "Conversor[kProp= " + kProp + " , kLin= " + kLin + "]";
    }
    
}
