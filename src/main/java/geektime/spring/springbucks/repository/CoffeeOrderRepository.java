package geektime.spring.springbucks.repository;

import geektime.spring.springbucks.model.CoffeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeOrderRepository extends BaseRepository<CoffeeOrder, Long> {
    List<CoffeeOrder> findByCustomerOrderById(String customer);
    List<CoffeeOrder> findByItems_Name(String name);
}