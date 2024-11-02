package Input_Output_Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fileInput = null;
		BufferedInputStream bufferInput = null;
		
		try {
			fileInput = new FileInputStream("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\09-Sep-2024.txt");
			bufferInput = new BufferedInputStream(fileInput);
			byte[] contents=new byte[1024];
			int bytesRead=0;
			String strFileContents;
			while((bytesRead=bufferInput.read(contents))!=1) {
				strFileContents=new String(contents,0,bytesRead);
				System.out.println("The Content of the file read using"+" BufferedInputStream is: "+strFileContents);
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				bufferInput.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
