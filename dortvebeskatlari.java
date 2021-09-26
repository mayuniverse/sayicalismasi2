import java.util.Scanner;

public class ikininkatlari {
    public static void main(String[] args) {
        //import sınıfını tanımlayalım
        Scanner inp = new Scanner(System.in);

        // input
        int i;

        // input al hesapla
        System.out.println("Sayı giriniz");
        i = inp.nextInt();

        // hesaplamaları yap
        for(int k=1; k<=i; k=k*20){
            System.out.println(k);
            
        }
        }
    }
    

