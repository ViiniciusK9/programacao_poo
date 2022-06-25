/*
Exercício - OOP2
● Para implementar jogos com cartas são necessárias classes que
representam uma carta individual e também um baralho. Implemente
essas classes, considerando que as Cartas são Ás, 2 a 10, valete,
dama e rei, e os naipes são copas, espadas, ouros e paus; e Baralho
é um conjunto de 52 cartas (13 cartas para cada naipe), em ordem ou
embaralhado.
    ○ Faça os devidos tratamentos de exceções para as classes Cartas e Baralho.
    ○ Implemente um método para embaralhar as cartas de um baralho.
● A entrega desta atividade será via Moodle.
    ○ Enviar um arquivo zip apenas os códigos Java desenvolvidos no exercício.
*/

package oop2;

public class OOP2 {
    public static void main(String[] args) {
        // Criando baralho 1 com tamanho padrão e embaralhando ele.
        try{
            Baralho b1 = new Baralho(52);
            
            try{
                // Para gerar um baralho padrão é necessario que o tamanho dele seja 52.
                b1.gerar_baralho_padrao();
            }
            catch (Exception error) {
                System.out.println(error);
                System.out.println("Erro ao gerar baralho padrão.");
            }

            b1.mostrar_baralho();
            b1.embaralhar();
            b1.mostrar_baralho();
        }
        catch (Exception error) {
            System.out.println(error);
        }
        
        
        // Criando baralho 2 com tamanho 4 e gerando um baralho customizado.
        try{
            Baralho b2 = new Baralho(4);
            
            try{
                b2.gerar_baralho_customizado();
            }
            catch (Exception error) {
                System.out.println(error);
            }

            b2.mostrar_baralho();
            b2.embaralhar();
            b2.mostrar_baralho();
        }
        catch (Exception error) {
            System.out.println(error);
        }  
    }    
}
