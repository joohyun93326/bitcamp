import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_Stream_imageCopy {
    public static void main(String[] args) {
        String orfile = "/Users/joohyun/javatest/images.png";
        String tarfile ="copy.png";
        //default 경로 : 프로젝트 폴더 (/Users/joohyun/eclipse-workspace/Ex09_IO/copy.png)
        
        FileInputStream fs = null;
        FileOutputStream fo = null;
        
        try {
              fs = new FileInputStream(orfile);
              fo = new FileOutputStream(tarfile,false);
              //파일이 없으면 생성 , write
              //default가 false라서 굳이 쓰진 않아도 된다 
              
              int data=0;
              while((data = fs.read()) != -1) {
                  fo.write(data); //copy.jpg 에서 byte  write
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                  fs.close();
                  fo.close();
            } catch (Exception e2) {
                
            }
        }

    }

}
