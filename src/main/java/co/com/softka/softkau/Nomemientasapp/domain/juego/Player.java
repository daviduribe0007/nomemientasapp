package co.com.softka.softkau.Nomemientasapp.domain.juego;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.softkau.Nomemientasapp.domain.juego.values.valuesObjects.Capital;
import co.com.softka.softkau.Nomemientasapp.domain.juego.values.PlayerId;
import co.com.softka.softkau.Nomemientasapp.domain.juego.values.valuesObjects.Name;

public class Player extends Entity<PlayerId> {

    private final Name name;
    private Capital capital;



    public Player(PlayerId entityId, Name name, Capital capital) {
        super(entityId);
        this.name = name;
        this.capital = capital;
    }

    public Player(PlayerId entityId, Name name) {
        super(entityId);
        this.name = name;
        this.capital = new Capital(0.0);
    }

    public void aumentCapital(Double valor) {
        this.capital = this.capital.aumentCapital(valor);
    }

    public void subtractCapital(Double valor) {
        try {
            this.capital = this.capital.subtractCapital(valor);
        } catch (Exception e) {
            throw new IllegalArgumentException(e + " --- Error on subtractCapital ---");
        }
    }

    public Capital capital() {
        return capital;
    }

    public Name name() {
        return name;
    }

}
