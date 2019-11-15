package com.company.patterns.structural.adapter.challenge;

//Target
public interface MediaPlayer {

	void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {

	private final String audioType;

	public AudioPlayer() {
		this.audioType = "mp3";
	}

	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println(" Playing " + audioType + " file. Name: " + fileName + "." + audioType);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}

	}
}
