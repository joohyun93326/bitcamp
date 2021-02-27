import java.io.FileInputStream;
import java.io.FileOutputStream;

/*

!!읽고 쓰는 대상이 File일 때!!
 - 여기서 말하는 file은 물리적인 파일을 말함 txt같은 거
 
*FileInputStream
*FileOutputStream

 */
public class Ex02_Point_FileStream {

   public static void main(String[] args) {

      // 이건 방금 만든 C드라이브의 a파일에 빨대를 꽂을거다!!
      
      FileInputStream fs = null;
      FileOutputStream fos = null;
      FileOutputStream fos2 = null;
      String path = "C:\\Temp\\a.txt";
      
      try {
         fs = new FileInputStream(path);
         fos = new FileOutputStream("C:\\Temp\\new.txt",true);
         fos2 = new FileOutputStream("C:\\Temp\\new.java");
         // FileOutputStream 이 생성자는 오버로딩 되어 있어서
         // 몇가지 옵션이 있다.
         // 1. new FileOutputStream("C:\\Temp\\new.txt",false);
         //    >덮어쓰라는 의미. 이게 디폴트 상태다 false 없이 txt라고 끝나면
         //      뒤에 false가 붙어있는 것(overwrite)
         // 이어쓰고 싶다면(append) true로 명시해 바꿔주면 된다 실행횟수만큼 덧붙여짐
         
         
         
         
         int data = 0;
         
         // char는 정수다(아스키 테이블!!)
         // 아래 조건식이 fs에 담긴 정수값을 읽어내는 것
         while((data = fs.read()) != -1) {
            //System.out.println(data);
            // 위는 char를 정수로 변환해서 출력하는 것!
            
            // 만약 정수말고 문자열로 출력하고 싶다면 형변환 ㄱㄱ
            System.out.println("문자 "+ (char)data);
            
            // 이제 써보자
            fos.write(data);
            // 이건 new.txt 파일에 data값을 쓰겠다는 뜻
            // 근데 없는 파일이잖아?
            // write함수는 쓸 대상인 파일이 없으면 !!생성!!해서 써준다
            // 파일 생성하는 함수는 따로 있는데 write도 가능(중복기능)
            
            fos2.write(data);
         }
         
      }catch(Exception e){
         e.printStackTrace();
         // 다만 자바가 heap메모리에 올라간 데이터는 관리해주지만
         // wirte로 작성한 데이터는 그렇지 않다
      } finally {
         // 코드가 정상이든 비정상이든 return으로 함수를 강제 종료하든말든
         // 무조건 실행되는 강력한 블럭
         // 여기서 명시적으로 자원 해제(객체)를 해준다
         // 가비지 컬렉터가 원래 치워주지만 가비지 컬렉터가 관리하지 못하는 자원도 있다
         // 그건 네트워크 관련 자원, IO 등 메모리에 있는 자원이 아닌 것
         // 이런 건 개발자가 명시적으로 자원을 해제시켜줘야 한다
         // 엑셀파일 작업할 때 다른 사람이 파일을 열거나 작업중이면 나는 읽기전용으로만 이용할 수 있는것처럼
         
         // 자바는 생성자의 반대개념 소멸자를 가지고 있다
         // 생성자의 반대니까 객체가 사라질 때 호출되는 함수
         
         //fs.close();
         // 이렇게 쓰면 예외처리 하라고 안내가 뜬다
         
         try {
            fs.close();
            fos.close();
            fos2.close();
         } catch( Exception e) {
            
         }
      }
      

   }

}