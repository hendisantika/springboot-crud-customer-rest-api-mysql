package com.hendisantika.springbootcrudcustomerrestapimysql.controller;

import com.hendisantika.springbootcrudcustomerrestapimysql.entity.Customer;
import com.hendisantika.springbootcrudcustomerrestapimysql.repository.CustomerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-crud-customer-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/04/20
 * Time: 13.50
 */
@Log4j2
@RestController
@RequestMapping("api/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping
    public Page<Customer> getAllData(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

}
