package tuan2.edu.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
//    product_image (product_id, image_id, path, alternative)
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    private int image_id;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String path;
    @Column(columnDefinition = "nvarchar(50)",nullable = false)
    private String alternative;

    public ProductImage() {
    }
}
