package com.company.patterns.structural.adapter.challenge;

public class AdapterPatternDemo {

	public static void main(String[] args) {



		MediaPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "try la la");
		AdvancedMediaPlayer mp4 = new Mp4Player();
		AdvancedMediaPlayer vlc = new VlcPlayer();

		MediaPlayer advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4);
		advancedMediaPlayerAdapter.play("mp4", "alone.mp4");

		MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlc);
		advancedMediaPlayerAdapter2.play("vlc", "tralala");


	}
}
