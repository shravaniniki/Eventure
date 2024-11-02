package Input_Output_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\\\Users\\\\SR166\\\\Desktop\\\\JavaTraining\\\\Workout_Problems\\09-Sep-2024.txt");
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(file);
			 byte b=-1;
			 while((b=(byte) fis.read())!=-1){
				 System.out.print((char) b);
			 }
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//we have to close the file so we use .close()
				fis.close();//this close will throw an exception that's y try catch block in finally
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
