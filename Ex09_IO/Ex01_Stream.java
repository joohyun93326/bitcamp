import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex01_Stream {

    public static void main(String[] args) {
        //byte(-128~127) 정수를 저장하는 데이터 타입 
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null; //현재 메모리를 가지고 있지 않다 (초기화)
        
        //데이터를 read, write 한다. 대상 : 메모리
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc); //inSrc배열(메모리) 안에 read하려고 input 빨대 꽂음 
        output = new ByteArrayOutputStream(); //write 
        
        System.out.println("ourSrc before : " + Arrays.toString(outSrc));
        
        //공식같은 로직 **외우세요**
        int data = 0;
        while( (data = input.read()) != -1) { //더 이상 read할 데이터 없으면 -1 
            System.out.println("data : " + data); 
            //read함수는 내부적으로 next를 해서 바로 출력하면 1,3,5,7,9,-1 로 나옴 
            //변수에 저장 후 출력 !
            
            output.write(data);
            //write 대상이 data가 아니고 
            //ByteArrayOutputStream <- 자신의 통로가 data를 가지는 것
        }
       System.out.println(output.toByteArray()); //가지고 있는 곳의 주소 
       //[B@2db0f6b2
       
       outSrc = output.toByteArray();
       //ByteArrayOutputStream 이거로 가져온 주소를 outSrc가 가진다
       
       System.out.println("outSrc after: " + Arrays.toString(outSrc));
       //outSrc : [0, 1, 2, 3, 4, 5, 6, 7, 8]
        
        

    }

}
