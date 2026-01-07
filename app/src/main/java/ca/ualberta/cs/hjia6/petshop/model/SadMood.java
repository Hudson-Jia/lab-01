package ca.ualberta.cs.hjia6.petshop.model;

import java.util.Date;

public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMoodString() {
        return "Sad";
    }
}