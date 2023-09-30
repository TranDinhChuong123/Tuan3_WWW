package tuan2.edu.repositories;

import jakarta.persistence.EntityTransaction;
import org.joda.time.DateTime;
import tuan2.edu.models.Order;

import java.util.List;

public class OrderRepository extends GenericCRUD<Order> {
    public OrderRepository() {
    }

    //    Thống kê order theo ngày
    public List<Order> findOfOrderDate(DateTime dateTime) {
        EntityTransaction tr = em.getTransaction();
        try {
            tr.begin();
            String sql ="SELECT * FROM orders\n" +
                    "WHERE order_date = '"+dateTime+"'";
            List<Order> orderList = em.createNativeQuery(sql, Order.class).getResultList();
            tr.commit();
            return orderList;
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return null;
    }
    //    Thống kê order theo khoảng thời gian
    public List<Order> findOfOrderDatePerido(DateTime dateStart, DateTime dateEnd) {
        EntityTransaction tr = em.getTransaction();
        try {
            tr.begin();
            String sql ="SELECT * FROM orders\n" +
                    "WHERE order_date >= '"+dateStart+"' AND order_date <= '"+dateEnd+"'";
            List<Order> orderList = em.createNativeQuery(sql, Order.class).getResultList();
            tr.commit();
            return orderList;
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return null;
    }
}
