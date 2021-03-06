package br.com.cristiano.wakanda.model.cities;

import java.util.Arrays;

import br.com.cristiano.wakanda.model.characters.Arcadius;
import br.com.cristiano.wakanda.model.characters.ArianaMcKenzie;

public class MenaNgai extends BaseCity {
	private static final long serialVersionUID = 8404621584730655273L;

	public MenaNgai() {
		super("Mena Ngai", "Great Mound", Arrays.asList(new Arcadius(), new ArianaMcKenzie()),
				Arrays.asList(new Necropolis()));
	}
}
