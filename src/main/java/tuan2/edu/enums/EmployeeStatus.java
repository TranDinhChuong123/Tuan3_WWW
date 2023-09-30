package tuan2.edu.enums;

public enum EmployeeStatus {
    WORKING(1, "Đang làm việc"),
    ON_LEAVE(0, "Tạm nghỉ"),
    RESIGNED(-1, "Nghỉ việc");

    private final int code;
    private final String description;

    EmployeeStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
//
//    EmployeeStatus(int code) {
//        this.code = code;
//    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
