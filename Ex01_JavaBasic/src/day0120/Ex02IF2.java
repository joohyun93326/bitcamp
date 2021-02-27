package day0120;
//1. 사용자로부터 숫자를 입력받아서 홀수이면 "홀수입니다."라고 출력되게 만드세요.
//2. 사용자로부터 나이를 입력받아서 성년이면 "성년입니다."라고 출력되게 만드세요.
//3. 사용자로부터 아이디와 비밀번호를 입력받아서 아이디가 "admin"이고 비밀번호가 "12345"이면 "로그인 성공"이 출력되게 만드세요.
import java.util.Scanner;

public class Ex02IF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("숫자 입력.");
        int num1 = scanner.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else System.out.println("홀수입니다.");
        
        
        System.out.println("나이 입력.");
        int num2 = scanner.nextInt();
        
        if (num2 > 19) {
            System.out.println("성년입니다.");            
        }
        else System.out.println("미성년입니다.");
        
        
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
        else System.out.println("로그인 실패");
        
        scanner.close();
    }
}
