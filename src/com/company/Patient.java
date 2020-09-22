package com.company;

class Patient {
    private String name;
    private String sickness;
    private boolean isSick;

    Patient(String name) {
        this.name = name;
        this.sickness = "";
        this.isSick = false;
    }

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