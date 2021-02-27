import java.io.File;

/* 
 * JAVA에서는 파일과 폴더를 하나의 클래스로 본다. 함께 다룬다.
 *  >> a.txt 생성, 삭제, 정보 read 
 *  >> Temp 폴더 생성, 삭제, 정보 read 
 * 
 * 절대경로 : 드라이브 중심
 * 상대경로 : 현재 파일 중심 
 * 
 */
public class Ex07_File {

    public static void main(String[] args) {
        String path = "/Users/joohyun/javatest/file.txt";
        File f = new File(path);
        //File 클래스를 사용하면 file에 대한 다양한 정보를 얻을 수 있다 (파일명, 만든 시간 등등)
        System.out.println("파일명 : " +f.getName()); //전체 경로에서 파일 이름만 출력
        System.out.println("전체경로 : " +f.getPath()); //전체 경로 출력
        System.out.println("절대경로 : " +f.getAbsolutePath()); //전체 경로 출력 (file.txt만 써도 가능)
        System.out.println("너 폴더니? : " +f.isDirectory()); //폴더인지 확인 
        System.out.println("너 파일이니?: " +f.isFile());  //파일인지 확인 
        System.out.println("부모경로 : " +f.getParent()); //상위 폴더 경로 
        System.out.println("파일or폴더 실제 존재 여부 : " +f.exists()); //실제로 존재하니?
        //여기까지 가장 많이 쓰이는 함수이다.
        
        //f.createNewFile() 파일 생성 
        //f.delete() 삭제 
        //f.canRead() 읽어도 되니?  

    }

}
