package vn.edu.iuh.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    IN_ACTIVE(2),
    TERMINATED(-1);

    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
