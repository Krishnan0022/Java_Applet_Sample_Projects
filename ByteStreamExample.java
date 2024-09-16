import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamExample{
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("C:\\Users\\Krishnan\\OneDrive\\Desktop\\java lab\\CSC_JAVA\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Krishnan\\OneDrive\\Desktop\\java lab\\CSC_JAVA\\output.txt");
            int byteData;
            while((byteData=fis.read())!=-1){
                fos.write(byteData);
			System.out.println("File copied sucessfully");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}