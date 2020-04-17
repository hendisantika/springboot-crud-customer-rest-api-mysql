package com.hendisantika.springbootcrudcustomerrestapimysql.controller;

import com.hendisantika.springbootcrudcustomerrestapimysql.repository.CustomerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
