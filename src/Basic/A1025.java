package Basic;

import java.util.Scanner;

 class student{
    public int stunum;
    public int score;
    public int final_rank;
    public int loc_num;
    public int loc_rank;
}

public class A1025 {
     public void stutostu(student stu1,student stu2){
         stu1.stunum=stu2.stunum;
         stu1.score=stu2.score;
         stu1.final_rank= stu2.final_rank;
         stu1.loc_num=stu2.loc_num;
         stu1.loc_rank=stu2.loc_rank;
     }
     public void cmp(student stu1,student stu2){
         if(stu1.score<stu2.score||(stu1.score==stu2.score)&&(stu2.stunum>stu1.stunum)){
             student tmp = new student();
             stutostu(tmp,stu1);
             stutostu(stu1,stu2);
             stutostu(stu2,tmp);
         }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            for (int i = 0; i <num ; i++) {
                int size=sc.nextInt();
                student stu[] = new student[size];
                for (int j = 0; j <size ; j++) {
                    stu[j].stunum=sc.nextInt();
                    stu[j].score=sc.nextInt();
                    stu[j].loc_num=j;
                }

            }
            for (int i = 0; i <num ; i++) {
                for (int j = 0; j < ; j++) {

                }
            }
        }
    }
}
