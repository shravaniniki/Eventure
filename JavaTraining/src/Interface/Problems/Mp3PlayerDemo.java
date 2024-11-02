package Interface.Problems;

interface AudioPlayer {
    void play();
}

interface VideoPlayer {
    void play();
}

class MP3Player implements AudioPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing MP3file...");
		
	}
}

class MP4Player implements VideoPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing MP4file...");
		
	}

}

public class Mp3PlayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3Player mp3=new MP3Player();
		mp3.play();
		
		MP4Player mp4=new MP4Player();
		mp4.play();
	}

}
