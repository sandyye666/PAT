package Basic;

import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String s= sc.nextLine();
            String[] stringarray= s.split(" ");
            for (int i = stringarray.length-1; i >=0 ; i--) {
                if(i!=0){
                    System.out.print(stringarray[i]+" ");
                }
                else{
                    System.out.print(stringarray[i]);
                }
            }

        }
    }
}
