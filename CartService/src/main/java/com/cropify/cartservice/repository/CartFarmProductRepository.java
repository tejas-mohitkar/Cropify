package com.cropify.cartservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cropify.cartservice.model.Cart;

public interface CartFarmProductRepository extends JpaRepository<Cart, Long>{

    @Query(value =  "select * from cart_farm_product where customer_id = :customerId", nativeQuery = true)
    List<Cart> findCartProductByCustomerId(@Param("customerId") Long customerId);

    @Query("SELECT cfp, fp FROM CartFarmProduct cfp JOIN cfp.farmProdId fp WHERE cfp.customerId.id = :customerId")
    List<Object[]> findByCustomerId(@Param("customerId") Long customerId);

}
