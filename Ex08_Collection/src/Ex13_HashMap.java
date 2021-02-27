import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

   public static void main(String[] args) {
      
      // HashMap은 지역번호, 출석부, 우편번호, 회원가입 등에 쓸 수 있다
      HashMap loginmap = new HashMap<>();
      loginmap.put("kim", "kim1004");
      loginmap.put("scott", "tiger");
      loginmap.put("lee", "kim1004");
      
      // 가입은 끝났고, 위가 가입된 회원정보들이다
      // 로그인 시스템
      // 1. Id (o) pw(o) 경우 - 로그인
      // 2. Id (o) pw(x) 경우 - 비밀번호 재입력
      // 3. Id (x) pw(o) 경우 - pw를 판단할 필요도 없음
      // 4. Id (x) pw(x) 경우 - 3과 마찬가지
      
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         System.out.println("id, pw 입력해주세요");
         System.out.println("id : ");
         String id = sc.nextLine().trim().toLowerCase();
         //
         
         System.out.println("pw : ");
         String pw = sc.nextLine().trim();
         
         if(!loginmap.containsKey(id)) {
            // id가 안 맞는 경우
            System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요.");
         } else {
            if(loginmap.get(id).equals(pw)) {
               System.out.println("로그인되었습니다.");
               break;
            }else {
               System.out.println("비밀번호가 맞지 않습니다.");
            }
         }
         
      }
      

   }

}