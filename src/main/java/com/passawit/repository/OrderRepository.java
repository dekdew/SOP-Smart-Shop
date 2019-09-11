package com.passawit.repository;

import com.passawit.models.BrownieOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<BrownieOrder, Long> {

}