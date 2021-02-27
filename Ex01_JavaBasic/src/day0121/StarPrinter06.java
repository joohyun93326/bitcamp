package day0121;
//별찍기 6번

import java.util.Scanner;
public class StarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 6번*****");
        System.out.println("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        // i for문은 총 몇줄이 출력될지를 결정하게 된다.
        //***5번과 동일하지만 역순으로 출력하기위해 i를 5로 초기화하여 시작함***
        for(int i = userNumber; i >= 1; i--) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = new String();
            
            // j for 문은 해당 줄의 어떤 내용이 출력될지를 결정하게 된다.
            //공백을 담당하는 j for문
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            
            //별을 담당하는 j for문
            //별의 개수가 1, 3, 5, 7, 9 로 증가됨
            for(int j = 1; j<= 2 * i - 1; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
        scanner.close();
       }
        
   }