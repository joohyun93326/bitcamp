package day0121;
//별찍기 2번

import java.util.Scanner;
public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 2번*****");
        System.out.println("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        // i for문은 총 몇줄이 출력될지를 결정하게 된다.
        for(int i = 1; i <= userNumber; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = new String();
            
            // j for 문은 해당 줄의 어떤 내용이 출력될지를 결정하게 된다.
            for(int j = i; j <= userNumber; j++) {
            stars += "*";
            }

            System.out.println(stars);
        }
 
     scanner.close();
    }
     
}
