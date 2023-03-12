package Module3Assignment;

import Module3Assignment.FMRadioStationException;

public class FMRadioStation{
	private String callSign;
	private float freq;

	public FMRadioStation(String callSign, float freq) throws FMRadioStationException{
		super();
		this.callSign = callSign;
		this.freq = freq;
		}

	@Override
	public String toString() {
		return "[CallSign: " + callSign + ", Frequency: " + freq +"]";
	}
}
