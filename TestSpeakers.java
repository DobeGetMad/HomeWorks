package homeWorks;

public class TestSpeakers {

	public static void main(String[] args) {
		Speakers[] sbar = new Speakers[9];
		sbar[0] = new BigSpeakers();
		sbar[1] = new BigSpeakers();
		sbar[2] = new BigSpeakers();
		sbar[3] = new MediumSpeakers();
		sbar[4] = new MediumSpeakers();
		sbar[5] = new MediumSpeakers();
		sbar[6] = new SmallSpeakers();
		sbar[7] = new SmallSpeakers();
		sbar[8] = new SmallSpeakers();

  SpeakersTurnOffOn.turnAllSpeakers(sbar);
	}

}
