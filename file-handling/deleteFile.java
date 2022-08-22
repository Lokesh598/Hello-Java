
import java.io.File;

class deleteFile{
  public static void main(String[] args) {

    File file = new File("file.txt");

    boolean value = file.delete();
    if(value) {
      System.out.println("The File is deleted.");
    }
    else {
      System.out.println("The File is not deleted.");
    }
  }
}
