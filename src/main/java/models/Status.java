package models;

public enum Status {
    DANG_KINH_DOANH(1),
    TAM_NGUNG(0),
    KHONG_KINH_DOANH(-1);

    private final int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
