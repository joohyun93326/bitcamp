package day0120;

import java.util.Scanner;

public class Ex04IfElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("숫자 입력.");
        int num1 = scanner.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
        
        
        System.out.println("나이 입력.");
        int num2 = scanner.nextInt();
        
        if (num2 > 19) {
            System.out.println("성년입니다.");            
        }
        else {
            System.out.println("미성년입니다.");
        }
        
        
        System.out.print("ID : ");
        scanner.nextLine();
        String id = scanner.nextLine();
        
        System.out.print("PW : ");
        String pw = scanner.nextLine();
        
        //equals 쓰는 이유
        //비교연산자의 경우 실제 값이 아닌 주소값을 비교하기 때문에!!!
        if (id.equals("admin") && pw.equals("12345")) {
            System.out.println("로그인 성공");   
        }
        else {
            System.out.println("로그인 실패");
        }
        
        scanner.close();
    }
}
