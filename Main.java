import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // int vet[][] = new int[12][12];
        int i, j, c=0;
        double num, soma = 0;
        String carac;
        carac = sc.next();

        for(i = 0; i < 12; i++){
            for(j = 0; j < 12; j++){
                num = sc.nextDouble();
                if(j > i){
                    c++;
                    soma += num;
                }
            }
        }
        
        if(carac.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else {
            soma /= c;
            System.out.printf("%.1f\n", soma);
        }
    }
}
