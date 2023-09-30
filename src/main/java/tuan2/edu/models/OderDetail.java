package tuan2.edu.models;


import jakarta.persistence.*;
import tuan2.edu.models.primaryKeys.OrderDetail_ID;

@Entity
@Table(name ="oder_detail")
@IdClass(OrderDetail_ID.class)
public class OderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
    private double price;
    @Column(columnDefinition = "nvarchar(50)")
    private String note;

    public OderDetail() {
    }
    //    -  order_detail (order_id, product_id, quantity, price, note)
}
