package Basic;

import java.util.Scanner;

public class B1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int size=sc.nextInt();
            int sum = a+b;
            int num[]= new int[31];
            int count =0;
            do
            {
                num[count++]=sum%size;
                sum=sum/size;

            }while(sum!=0);
            for (int i =count-1; i >=0 ; i--) {
                System.out.print(num[i]);
            }

        }
    }
}
