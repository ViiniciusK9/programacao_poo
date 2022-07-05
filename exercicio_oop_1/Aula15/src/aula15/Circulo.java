package aula15;

public class Circulo extends Forma{
    public Circulo(double raio){
        super(1);
        setRaio(raio);
    }
    
    @Override
    public double area(){
        return Math.PI * Math.pow(getMedida(0), 2);
    }
    
    public void setRaio(double raio){
        setMedida(0, raio);
    }
}
