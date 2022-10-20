import java.util.Scanner;
public class tamBolen {
    public static void main(String[] args) {
        int k ;
        int uceVeDorde = 0, kacSayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        k = input.nextInt();
        for (int i = 1 ; i<=k ; i++){
            if ((i % 3 == 0)&&(i % 4 == 0))
            {
                uceVeDorde += i;
                kacSayi++;
            }
        }
       double ortalama = uceVeDorde / kacSayi;
        System.out.println(uceVeDorde);
        System.out.println(kacSayi);
        System.out.print(ortalama);
    }
}
