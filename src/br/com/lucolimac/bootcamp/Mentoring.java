package br.com.lucolimac.bootcamp;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_DEFAULT + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Mentoring{title='%s', description='%s', date=%s}", getTitle(), getDescription(), getDate());
    }
}
