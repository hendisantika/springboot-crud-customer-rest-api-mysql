package com.hendisantika.springbootcrudcustomerrestapimysql.repository;

import com.hendisantika.springbootcrudcustomerrestapimysql.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-crud-customer-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/04/20
 * Time: 13.48
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
