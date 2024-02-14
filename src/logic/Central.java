package logic;

import java.util.ArrayList;

public class Central {

    //variables
    private ArrayList<Laboratory> LaboratoriesList;

    //constructor
    public Central() {
        LaboratoriesList = new ArrayList<>();
    }

    //getters and setters
    public ArrayList<Laboratory> getLaboratoriesList() {
        return LaboratoriesList;
    }

    public void setLaboratoriesList(ArrayList<Laboratory> a) {
        this.LaboratoriesList = a;
    }

    //methods
    public float totalConsumptionCentral(ArrayList<Laboratory> listaLab) throws Exception {
        if (listaLab == null) {
            throw new Exception("List of laboratories is not initialized");
        } else {
            float totalConsumption = 0;
            for (int i = 0; i < listaLab.size(); i++) {
                totalConsumption = totalConsumption + listaLab.get(i).totalConsumptionLab();
            }
            return totalConsumption;
        }
    }

    public void add(Laboratory lab, int i) throws Exception {
        if (has(lab)) {
            throw new Exception("The laboratory is already in this central");
        } else if (LaboratoriesList.size() == 12) {
            throw new Exception("The maximum number of laboratories has been reached");
        } else {
            LaboratoriesList.add(i, lab);
        }
    }

    public void remove(Laboratory lab) throws Exception {
        if (!has(lab)) {
            throw new Exception("The laboratory is not in this central");
        } else {
            LaboratoriesList.remove(lab);
        }
    }

    public boolean has(Laboratory lab) {

        for (int i = 0; i < LaboratoriesList.size(); i++) {
            if (lab.getId() == LaboratoriesList.get(i).getId()) {
                return true;
            }
        }
        return false;

    }
}
