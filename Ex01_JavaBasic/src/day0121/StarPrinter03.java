package day0121;
//별찍기 3번

import java.util.Scanner;
public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****별찍기 3번*****");
        System.out.println("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();
        
        // i for문은 총 몇줄이 출력될지를 결정하게 된다.
        for(int i = 1; i <= userNumber; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = new String();
            
            // j for 문은 해당 줄의 어떤 내용이 출력될지를 결정하게 된다.
            
            /* if-else 사용법
             * for(int j = 5; j > 0 ; j--) {
                if(i<j) {
                    stars += " ";
                }else {
                    stars += "*";
                }
            }
            */
            
            //공백을 담당하는 j for문
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            
            //별을 담당하는 j for문
            for(int j = 1; j<= i; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
        scanner.close();
       }
        
   }