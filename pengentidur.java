package YaAllah;

import java.util.Scanner;

public class pengentidur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int hasil = 0;

        System.out.print("N = ");
        N = input.nextInt();
        
        for(int a =1; a<=N; a++){
            hasil += a; 
        }

        System.out.println("= "+hasil);
    }
}
