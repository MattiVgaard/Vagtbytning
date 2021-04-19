package com.MattiVgaard.vagtbytning.ui.byttebørs;

public class Bytte {
    private String name;
    private String dato;
    private String timeStart;
    private String timeSlut;


    public Bytte(String name, String dato, String timeStart, String timeSlut) {
        this.name = name;
        this.dato = dato;
        this.timeStart = timeStart;
        this.timeSlut = timeSlut;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeSlut() {
        return timeSlut;
    }

    public void setTimeSlut(String timeSlut) {
        this.timeSlut = timeSlut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
