package co.com.softka.softkau.nomemientasapp.domain.round.values.identities;

import co.com.sofka.domain.generic.Identity;

public class StageId extends Identity {
    private StageId(Integer uid) {
        super(uid.toString());
    }

    public StageId() {
    }

    public static StageId of(Integer uid) {
        return new StageId(uid);
    }
}
