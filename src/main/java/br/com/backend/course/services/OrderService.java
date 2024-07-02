package br.com.backend.course.services;

import br.com.backend.course.entites.Order;
import br.com.backend.course.repositores.OrderRepository;
import br.com.backend.course.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return  repository.findAll();
    }
    public Order findById(Integer id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}