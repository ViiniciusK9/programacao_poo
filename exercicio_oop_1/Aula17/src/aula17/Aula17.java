package aula17;

public class Aula17 {

    static double efetuarCalculo(Calculavel calc, double a, double b){
        return calc.calcular(a, b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculavelImpl c = new CalculavelImpl();
        double res = efetuarCalculo(c, 5, 7);
        double r = efetuarCalculo((a, b) -> a + b, 5, 7);
        double r1 = efetuarCalculo(Math::pow, 2, 3);
        
        System.out.println(r1);
    } 
    
}
