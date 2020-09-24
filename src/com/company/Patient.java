package com.company;
/*
class Patient {
    private String name;
    private String sickness;
    private boolean isSick;

    Patient(String name, String sickness) {
        this.name = name;
        if (sickness == null || sickness.equals("")) {
            this.isSick = false;
            this.sickness = "";
        } else {
            this.sickness = sickness;
            this.isSick = true;
        }
    }

    Patient(String name) {
        this(name,"");
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
 */

class Patient {
    private String name;
    private String sickness;

    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    Patient(String name) {
        this(name, ""); //"" ersätta med null -> NullPointerException...
    }

    boolean isSick() {
        return this.sickness != null && !this.sickness.equals("");
    }

    String getSickness() {
        return this.sickness;
    }

    String getName() {
        return this.name;
    }

    void takeMedication(Medicine name) {
        if (this.sickness.equals(name.getTreatmentName())) {
            this.sickness = null;
        }
    }
}