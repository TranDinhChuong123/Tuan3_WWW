package tuan2.edu.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tuan2.edu.enums.ProductStatus;
@Entity
@Table(name = "product")
public class Product {
//    product (product_id, name, description, unit, manufacturer_name, status)
    @Id
    private int product_id;
    @Column(columnDefinition = "nvarchar(50)")
    private String name;
    @Column(columnDefinition = "nvarchar(50)")
    private String description;
    @Column(columnDefinition = "nvarchar(50)")
    private String unit;
    @Column(columnDefinition = "nvarchar(50)")
    private String manufacturer_name;
    private ProductStatus status;

    public Product(int product_id, String name, String description, String unit, String manufacturer_name, ProductStatus status) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturer_name = manufacturer_name;
        this.status = status;
    }

    public Product() {

    }


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

}
