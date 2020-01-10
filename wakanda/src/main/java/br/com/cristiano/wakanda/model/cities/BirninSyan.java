package br.com.cristiano.wakanda.model.cities;

import br.com.cristiano.wakanda.model.characters.AlyoshaKravinoff;
import br.com.cristiano.wakanda.model.characters.AmericanPanther;

import java.util.Arrays;

public class BirninSyan extends BaseCity {
    private static final long serialVersionUID = 1545065650875304831L;

    public BirninSyan() {
        super("Birnin S'yan", "City", Arrays.asList(new AlyoshaKravinoff(), new AmericanPanther()),
                Arrays.asList(new BirninBashenga()));
    }

}
