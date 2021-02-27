import java.io.FileReader;
import java.io.FileWriter;

/*
 * 기존 스트림은 byte만 처리했다면, 지금은 문자 기반의 데이터 처리를 해보자 
 * String은 내부적으로 char[] 로 관리함
 * 
 * 한들 1자, 영문자 1자 >> 2byte 
 * Reader, Writer (Stream이 안 붙어있으면 문자 처리 하는 것)
 * 
 * 대상 : File 
 * 
 */
public class Ex05_Reader_Writer {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            fr = new FileReader("Ex01_Stream.java"); //파일을 read 
            fw = new FileWriter("copy_Stream.txt"); //파일을 생성, 그 파일에 write 
            
            int data = 0;
            while((data = fr.read()) != -1) {

                //System.out.println((char)data);
                
                //배포 파일 (압축: 엔터, 공백, 스페이스가 없는 파일) 
                //우리도 압축해보자 
                if(data != '\n' && data != '\r' && data != '\t' && data != ' ') {
                    //엔터, 공백, 탭, 스페이스가 있으면 파일 만들지 말아라 
                    //그게 아니면 만들어라 
                    fw.write(data);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            try {
                fw.close();
                fr.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }finally {
                
            }
           
        }

    }

}
