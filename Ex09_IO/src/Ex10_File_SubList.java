/* joohyun@juhyoni-MacBookPro bin % java Ex10_File_SubList /Users/joohyun/java_test  
 * 
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
   
   // 사실 공유자원으로 쓸 건 아니라서 static 안 써도 되는데
   // 객체 생성 안 하려고 임의로 static 설정
   static int totalfiles = 0;
   static int totaldirs = 0;
   
   public static void main(String[] args) {

      if(args.length != 1) {
         System.out.println("사용법 : java [실행할 파일명][경로명]");
         System.out.println("예시 : java EX10_File_Sublist C:\\Temp");
         System.exit(0);
      }
      File f = new File(args[0]);
      if( !f.exists() || !f.isDirectory()) {
         System.out.println("유효하지 않은 경로");
         System.exit(0);
      }
      
      // 여기까지 내려오면 정상적인 경로고 폴더라는 것이 확인 되었음
      printFileList(f);
   
   }
   
   static void printFileList(File dir) {
      System.out.println("[Full path : ]" + dir.getAbsolutePath());
      
      List<Integer> subdir = new ArrayList<Integer>();
      File[] files = dir.listFiles();
      
      // [0] > a.txt
      // [1] > 1.jpg
      // [2] > 2012 폴더
      // [3] > 2022 폴더
      // 파일은 그냥 정보를 출력하면 되는데 폴더는 한 번 더 들어가야 한다
      
      for(int i = 0; i < files.length; i++) {
         String filename = files[i].getName();
         
         if(files[i].isDirectory()) {
            filename = "<DIR> <" + filename +">";
            
            //POINT
            subdir.add(i); //왜? 
            
            
         }else {
            filename = filename + " / " + files[i].length() + "BYTE";
         }
         System.out.println("   " + filename);
      }
      int dirnum = subdir.size();  //폴더 개수 
      int filenum = files.length - dirnum; //파일 개수 
      
      //함수 종료
      totaldirs += dirnum; //총 누적 (하위폴더)  
      totalfiles += filenum; 
      
      System.out.println("[Current dirNUm] : " + dirnum);
      System.out.println("[Current fileNUm] : " + filenum);
      System.out.println("********************************");
      
      //POINT (폴더 안에 폴더(하위 폴더)) 도 보고 싶어요
      for(int j = 0 ; j < subdir.size() ;j++) {
          int index = subdir.get(j);
          //index > 2
          //printFileList(C:\\Temp\\2021)
          
          //index > 3
          //printFileList(C:\\Temp\\2022)
          printFileList(files[index]);//POINT   재귀호출(자신을 호출)
      }
      
  }

}
