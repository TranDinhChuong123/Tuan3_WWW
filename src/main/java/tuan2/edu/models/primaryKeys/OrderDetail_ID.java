package tuan2.edu.models.primaryKeys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import tuan2.edu.models.Order;
import tuan2.edu.models.Product;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class OrderDetail_ID implements Serializable  {

    public OrderDetail_ID(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    private Order order;
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetail_ID)) return false;
        OrderDetail_ID that = (OrderDetail_ID) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }

    public OrderDetail_ID() {
    }
}
