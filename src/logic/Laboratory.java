package logic;

import java.util.ArrayList;

public class Laboratory {

    //variables
    public ArrayList<PC> PCList;
    private int id;
    private float totalConsumption;

    //constructor
    public Laboratory(int id) {
        this.setPCList(new ArrayList<>());
        this.setId(id);
    }

    //getters and setters 
    public ArrayList<PC> getPCList() {
        return PCList;
    }

    public void setPCList(ArrayList<PC> PCList) {
        this.PCList = PCList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalConsumption() {
        return totalConsumption;
    }

    public void setTotalConsumption(float totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

    //methods
    public void add(PC p, int i) throws Exception {
        if (has(p)) {
            throw new Exception("The PC is already in this laboratory");
        } else if (PCList.size() == 16) {
            throw new Exception("The maximum number of PCs has been reached");
        } else {
            PCList.add(i, p);
        }
    }

    public void remove(PC p) throws Exception {
        if (!has(p)) {
            throw new Exception("The PC is not in this laboratory");
        } else {
            PCList.remove(p);
        }
    }

    public boolean has(PC p) {

        for (int i = 0; i < PCList.size(); i++) {
            if (p.getId() == PCList.get(i).getId()) {
                return true;
            }
        }
        return false;

    }

    public float totalConsumptionLab() throws Exception {
        if (PCList == null) {
            throw new Exception("List of PCs is not initialized");
        } else {
            this.setTotalConsumption(0);
            for (int i = 0; i < PCList.size(); i++) {
                this.setTotalConsumption(this.getTotalConsumption() + PCList.get(i).calculateConsumption(PCList.get(i).getVoltage(),
                        PCList.get(i).getCurrent(), PCList.get(i).getTime()));
            }
            return this.getTotalConsumption();
        }
    }

    public void turnOff(ArrayList<PC> listaPc) throws Exception {
        for (int i = 0; i < listaPc.size(); i++) {
            PC p = listaPc.get(i);
            try {
                p.turnOff();
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
    }
}
