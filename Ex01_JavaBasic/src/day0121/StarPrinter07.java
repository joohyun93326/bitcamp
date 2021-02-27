package day0121;
//별찍기 7번
//유저가 5를 입력해도 9줄이 나와야 함
//방법1. i for문 2개 위 아래 하나씩
//방법2. i for문이 커지고 if-else 구조
import java.util.Scanner;
public class StarPrinter07 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("*****별찍기 7번*****");
      System.out.println("출력할 줄 수를 입력하세요: ");
      int userNumber = scanner.nextInt();
      
      //윗부분을 담당하는 i for 문
      for(int i = 1; i <= userNumber -1; i++) {
          String stars = new String();
          
          for(int j = 1; j <= i; j++) {
              stars += "*";
          }
          
          System.out.println(stars);
      }
          
      //아랫부분을 담당하는 i for 문
      for(int i = 1; i <= userNumber; i++) {
          String stars = new String();
          
          for(int j = i; j <= userNumber; j++) {
              stars += "*";
          }
          System.out.println(stars);
      }
      
      
      scanner.close();
     }
      
 }