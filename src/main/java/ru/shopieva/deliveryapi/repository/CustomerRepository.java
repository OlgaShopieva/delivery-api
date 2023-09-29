package ru.shopieva.deliveryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shopieva.deliveryapi.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
