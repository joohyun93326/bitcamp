import java.io.BufferedReader;
import java.io.FileReader;

/*
 * 출력 형식의 정의 
 * printf, String.fomat
 * 현업에서 사용하는 툴은 오즈, 크리스탈 레포트
 * 
 * 예쁘게 쓸 수 있는 것 : PrintWriter 
 */

public class Ex11_PrintWriter {
    
    public static void main(String[] args) {        
        try {
            /*
            PrintWriter pw = new PrintWriter("C:\\Temp\\homework.txt"); //생성
            pw.println("********************************************");
            pw.println("******************HOMEWORK******************");
            pw.println("********************************************");
            pw.printf("%3s : %5d  %5d  %5d  %5.1f","아무개",100,90,50,(float)((100+90+50)/3));
            pw.println();
            pw.close();
            */
            //line 단위
            //read 단위
            FileReader fr = new FileReader("C:\\Temp\\homework.txt");
            BufferedReader br = new BufferedReader(fr);
            String str="";
            while((str = br.readLine()) !=null) {
                System.out.println(str);
            }
            
            br.close();
            fr.close();
        }catch (Exception e) {
            // TODO: handle exception
        }

    }

}
