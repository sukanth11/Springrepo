package com.voya.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performance {
	@Autowired
	@Qualifier("violin")
	private IInstrument instrument;

	/**
	 * @param instrument the instrument to set
	 */
	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}
	
	void playMusic(String choice, String song) {
		if(choice.equals("v"))
			instrument.play(song);
		if(choice.equals("k"))
			instrument.play(song);
		if(choice.equals("g"))
			instrument.play(song);
			
	}
	

}
