import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the source file path...");
        String sourceFilePath = input.nextLine();
        System.out.println();
        
        System.out.println("Please type the destination path...");
        String destDirPath = input.nextLine();
        System.out.println();
        input.close();
        
        File sourceFile = new File(sourceFilePath);
        String fileName = sourceFile.getName();
        String destFilePath = destDirPath + "/" + fileName;
        
        try (FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
                FileOutputStream fileOutputStream = new FileOutputStream(destFilePath)) {
            
            byte [] buffer = new byte[1024];
            int bytesRead;
            
            System.out.println("Copying file...\n");
            
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}