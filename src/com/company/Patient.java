package com.company;

class Patient {
    private String name;
    private String sickness;


    Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    Patient(String name) {
        this(name,null);
    }

    String getSickness() {
        return this.sickness;
    }

    String getName() {
        return this.name;
    }

    boolean isSick() {
        return this.sickness != null;
    }

    void takeMedication(Medicine name) {
        if (isSick() && this.sickness.equals(name.getTreatmentName())) {
            this.sickness = null;
        }
    }
}