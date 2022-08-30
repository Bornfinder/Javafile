import java.util.Random;
import java.util.Scanner;

public class gameUsingRandom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("enter the value\nStone =1 , Paper =2 ,Scissor =3");
        int c=random.nextInt(1,4);
        //System.out.println("From computer "+c);
        int h= sc.nextInt();
        if (c==h){
            System.out.println("draw");
        }else if (c==1 && h==2 || c==2 && h==3 || c==3 && h==1){
            System.out.println("human win");
        }else  {
            System.out.println("computer win");
        }


    }
}
