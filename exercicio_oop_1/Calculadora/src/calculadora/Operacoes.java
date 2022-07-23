package calculadora;

/**
 *
 * @author vinicius koncicoski
 * @github ViiniciusK9
 */
public class Operacoes {
    public static int subtracao(int num1, int num2) throws Exception {
        try {
            return num1 - num2;
        } catch (Exception e) {
            throw new Exception("Erro ao efetuar subtracao: " + e.getMessage());
        }
    }
    
    public static int adicao(int num1, int num2) throws Exception {
        try {
            return num1 + num2;
        } catch (Exception e) {
            throw new Exception("Erro ao efetuar adicao: " + e.getMessage());
        }
    }
    
    public static int multiplicacao(int num1, int num2) throws Exception {
        try {
            return num1 * num2;
        } catch (Exception e) {
            throw new Exception("Erro ao efetuar multiplicacao: " + e.getMessage());
        }
    }
    
    public static int divisao(int num1, int num2) throws Exception {
        if(num2 == 0){
            throw new Exception("Erro ao efetuar divisao por zero");
        } else {
            try {
                return num1 / num2;
            } catch (Exception e) {
                throw new Exception("Erro ao efetuar divisao: " + e.getMessage());
            }
        }
    }
}
