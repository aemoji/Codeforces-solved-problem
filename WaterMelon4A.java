import java.util.Scanner;

public  class WaterMelon4A{

     public static void main(String[] args) {

      Scanner scanner=new Scanner(System.in);
      int w=scanner.nextInt();

      if(w % 2 == 0 && w > 2){
         System.out.println("Yes");
          }
          
     else if(w <= 2 || w%2 != 0){
        System.out.println("No");
         }

     }
}