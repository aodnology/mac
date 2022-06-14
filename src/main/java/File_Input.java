import java.io.FileInputStream;

public class File_Input {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("");

        int ch;

        while ((ch=fis.read()) != -1)
            // 파일에서 문자 하나를 read()로 읽어온다. 파일의 끝일 경우 -1을 반환한다.
            System.out.println((char) ch);

        fis.close(); // 파일의 모든 내용을 처리후 파일 종료.
    }
}
