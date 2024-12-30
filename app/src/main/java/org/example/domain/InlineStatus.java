package org.example.domain;

public class InlineStatus {
    private Reservation reservation;
    private int position;

    public InlineStatus(Reservation reservation, int position) {
    }

    public Reservation getRegistration() {
        return reservation;
    }

    public void setRegistration(Reservation reservation) {
        this.reservation = reservation;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
