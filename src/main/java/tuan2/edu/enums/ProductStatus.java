package tuan2.edu.enums;

public enum ProductStatus {
    ACTIVE(1, "Đang kinh doanh"),
    PAUSED(0, "Tạm ngưng"),
    INACTIVE(-1, "Không kinh doanh nữa");

    private final int code;
    private final String description;

    ProductStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
