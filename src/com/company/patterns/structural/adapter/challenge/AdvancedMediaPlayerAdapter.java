package com.company.patterns.structural.adapter.challenge;

//Adapter
public class AdvancedMediaPlayerAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String audioType, String fileName) {

		advancedMediaPlayer.loadFileName(audioType);
		advancedMediaPlayer.listen();
	}
}
