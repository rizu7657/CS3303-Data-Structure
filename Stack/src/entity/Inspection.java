package entity;

public class Inspection {
    private String name;
    private int inspectionNumber;

    public Inspection(String name, int inspectionNumber) {
        this.name = name;
        this.inspectionNumber = inspectionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInspectionNumber() {
        return inspectionNumber;
    }

    public void setInspectionNumber(int inspectionNumber) {
        this.inspectionNumber = inspectionNumber;
    }

    @Override
    public String toString() {
        return String.format("#%s %s", inspectionNumber, name);
    }
}
