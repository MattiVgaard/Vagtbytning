package com.MattiVgaard.vagtbytning.ui.vagter;

public class Vagt {
    private String dato;
    private String timeStart;
    private String timeSlut;


    public Vagt(String dato, String timeStart, String timeSlut) {
        this.dato = dato;
        this.timeStart = timeStart;
        this.timeSlut = timeSlut;
    }

    public Vagt(String dato) {
        this.dato = dato;
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
}
