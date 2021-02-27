import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 * File 처리 (Disk) : 한 byte 단위로 read, write 하는 게 원칙 
 * 모아서 read, write 하려면 한 번에 가능 하다 .. 이걸 Buffer 라고 한다 
 * 
 * Buffer 장점 
 * 1. I/O 성능(횟수) 
 * 2. Line 단위 (엔터) 
 * 
 * BufferdInputStream : 주 클래스에 의존하는 보조 스트림이다 >> 의무적으로 사용한다 (성능이 좋으니까 !)
 * 
 */
public class Ex04_Stream_Buffer {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        try {
            fos = new FileOutputStream("data.txt");
            //data.txt 없으면 파일 생성까지 하자 (write)
            bos = new BufferedOutputStream(fos);
            
            for(int i = 0; i < 10; i++) {
                bos.write('A');
            }
            //bos.flush();
            
            //JAVA Buffer 크기 : 8kbyte : 8192byte 
            //1. buffer 안에 내용이 채워지면 스스로 출발 : flush 
            //2. buffer 강제로 비우기 (명시적으로 flush 호출) : flush() 
            //3. bod.close(); 자원 해제 >> 자동으로 flush() 호출함 
            
        }catch (Exception e) {
            
        }finally {
            try {
                bos.close(); //close()는 flush를 동반한다 
                fos.close(); 
            } catch (Exception e2) {
                // TODO: handle exception
            }
        }
        

    }

}
