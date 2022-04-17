package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    /**
     * Order 저장
     */
    public void save(Order order) {
        em.persist(order);
    }

    /**
     * Order 조회(id)
     */
    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    /**
     * Order 목록
     */
    public List<Order> findAll() {
        return em.createQuery("select o from order o", Order.class).getResultList();
    }
}
