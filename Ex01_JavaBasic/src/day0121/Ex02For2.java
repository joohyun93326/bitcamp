package day0121;

import java.util.Scanner;
public class Ex02For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1. 1부터 10까지 출력되는 for문을 작성하시오.
        System.out.println("=====1번=====");
        int start = 1;
        int end = 10;
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
        //2. 8부터 3까지 출력되는 for문을 작성하시오.
        System.out.println("=====2번=====");
        start = 8;
        end = 3;
        for(int i = start; i >= end; i--) {
            System.out.println(i);
        }
        
        //3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서 그 숫자들을 차례대로 출력하시오.
        System.out.println("=====3번=====");
        System.out.print("시작 숫자를 입력하세요: ");
        start = scanner.nextInt();
        System.out.print("끝 숫자를 입력하세요: ");
        end = scanner.nextInt();
        if(start <= end) {
            for(int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }else {
            for(int i = start; i >= end; i--) {
                System.out.println(i);
            }
        }
        
        //4. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수 까지의 홀수들로만 출력하시오.
        System.out.println("=====4번=====");
        start = 1;
        System.out.print("숫자를 입력하세요.: ");
        end = scanner.nextInt();
        
        for(int i = start; i <= end; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
        
        //5. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수 까지의 합을 구하시오.
        System.out.println("=====5번=====");
        start = 1;
        System.out.print("숫자를 입력하세요.: ");
        end = scanner.nextInt();
        //합이 저장될 곳을 for문 실행 전에 미리 만들어둔다.
        int sum = 0;
        
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합: %d\n", end, sum);
        
        //6. 사용자로부터 숫자를 하나 입력받아서 1부터 그 수까지의 곱을 구하시오.
        System.out.println("=====6번=====");
        start = 1;
        System.out.print("숫자를 입력하세요.: ");
        end = scanner.nextInt();
        //곱이 저장될 곳을 for문 실행 전에 미리 만들어준다. 곱이니까 1로 초기화
        int factorial = 1;
        
        if(end >= 13) {
            System.out.println("오버플로우 발생!!");
        }else {
            for(int i = start; i <= end; i++) {
                factorial *= i;
        }
        System.out.printf("1부터 %d까지의 곱: %d\n", end, factorial);
        }
        scanner.close();
    }

}
