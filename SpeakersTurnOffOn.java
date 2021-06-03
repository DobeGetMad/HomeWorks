package homeWorks;

public abstract class SpeakersTurnOffOn {
	public static void turnAllSpeakers(Speakers[] speaks) {
		for (Speakers speakers : speaks) {
			speakers.playMusic();
		}
	}
}

