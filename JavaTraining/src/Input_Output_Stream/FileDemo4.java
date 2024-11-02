package Input_Output_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="All that glitters is not Gold";
		
		//below file is not present initally so we are using fileoutput stream to create one
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\SR166\\Desktop\\JavaTraining\\Workout_Problems\\gold.txt")){
			fos.write(content.getBytes());
			System.out.println("text written to file");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
