package com.Springboot.HibernateInheritanceJoinTable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
