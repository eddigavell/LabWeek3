package com.company;
import java.lang.*;

public class Patient {
    String name;
    String sickness;
    boolean isSick;

    Patient(String name) {
        this.name= name;
        this.sickness = "";
        this.isSick = false;
    }

    Patient(String name, String sickness) {
        this.name = name;

        if (sickness == null) {
            this.isSick = false;
        } else {
            this.sickness = sickness;
            this.isSick = true;
        }

    }

    boolean isSick() {
        return this.isSick;
    }

    String getSickness() {
        return this.sickness;
        }

    String getName() {
        return this.name;
    }

    void takeMedication(Medicine name) {
       if (this.sickness.equals(name.getTreatmentName())) {
           this.isSick = false;
       }
    }

}