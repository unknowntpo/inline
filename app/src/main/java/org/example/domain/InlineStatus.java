package org.example.domain;

public class InlineStatus {
    private Registration registration;
    private int position;

    public InlineStatus(Registration registration, int position) {
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
