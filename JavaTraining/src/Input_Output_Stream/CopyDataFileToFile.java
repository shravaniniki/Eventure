package Input_Output_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyDataFileToFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		        try {  
		            FileInputStream sourceFile = new FileInputStream("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\09-Sep-2024.txt");  
		            FileOutputStream targetFile = new FileOutputStream("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\gold.txt");  
		            byte[] buffer = new byte[1024];  
		            int bytesRead;  
		            while ((bytesRead = sourceFile.read(buffer)) != -1) {  
		                targetFile.write(buffer, 0, bytesRead);  
		            }  
		            sourceFile.close();  
		            targetFile.close();  
		            System.out.println(targetFile);
		        } catch (IOException e) {  
		            e.printStackTrace();  
		        }  
		    
	}

}
