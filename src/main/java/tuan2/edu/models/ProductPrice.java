package tuan2.edu.models;

import jakarta.persistence.*;
import org.joda.time.DateTime;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @Column(name = "price_date_time" ,columnDefinition = "DATETIME")
    private DateTime price_date_time;
    private double   price;
    @Column(columnDefinition = "nvarchar(50)")
    private String note;

    public ProductPrice() {
    }
    //    product_price (product_id, price_date_time, price, note)
}
