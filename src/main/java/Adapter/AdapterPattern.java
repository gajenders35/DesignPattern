package Adapter;

interface MediaPlayer{
	
	public void playSong(String audioType, String fileName);
}

interface AdvanceMediaPlayer{
	
	public void playVlc(String fileName);
	
	public void playMP4(String fileName);
}


class VLCPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC");
		
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Do nothing");
		
	}
	
}



class mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("do nothing");
		
	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("play mp4");
		
	}
		
}


class MediaAdapter implements MediaPlayer{
	
	AdvanceMediaPlayer advanceMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer=new VLCPlayer();
		}
		else if(audioType.equals("mp4")) {
			advanceMediaPlayer=new mp4Player();
		}
		
	}

	@Override
	public void playSong(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMP4(fileName);
		}
		
	}
}

class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	@Override
	public void playSong(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("playing mp3");
		}
		
		else if(audioType.equalsIgnoreCase("mp3") || audioType.equalsIgnoreCase("vlc")) {
			
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.playSong(audioType, fileName);
		}
		
	}
	
}

public class AdapterPattern {
	
	public static void main(String[] args) {
		
	
		AudioPlayer a=new AudioPlayer();
		a.playSong("mp3", "sidhu muse aala");
		a.playSong("vlc", "sidhu muse aala");

	}

}
