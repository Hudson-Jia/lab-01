package ca.ualberta.cs.hjia6.petshop.model;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // Default constructor: sets date to current time
    public Mood() {
        this.date = new Date();
    }

    // Constructor with a provided date
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Return a string representing the mood
    public abstract String getMoodString();
}