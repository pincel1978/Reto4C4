package com.cuatroa.retodos;

import com.cuatroa.retodos.model.Clone;
import com.cuatroa.retodos.model.Order;
import com.cuatroa.retodos.model.User;
import com.cuatroa.retodos.repository.OrderRepository;
import com.cuatroa.retodos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.cuatroa.retodos.repository.crud.CloneCrudRepository;
import com.cuatroa.retodos.repository.crud.OrderCrudRepository;
import com.cuatroa.retodos.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class RetodosApplication implements CommandLineRunner {

    @Autowired
    private CloneCrudRepository cloneCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RetodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        cloneCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();

//        cloneCrudRepository.saveAll(List.of(
//                new Clone(1,"ACER","CORE I5","WINDOWS 10","ALTO RENDIMIENTO","8GB","3T",true,2550000,5,"http://www.micacharro.com/img/clon1.png"),
//                new Clone(2,"ACER","CORE I7","WINDOWS 10","ALTO RENDIMIENTO","16GB","5T",true,3550000,5,"http://www.micacharro.com/img/clon2.png")
//        ));
//
//        userCrudRepository.saveAll(List.of(
//                new User(1, "123123", "ALAN BRITO", ft.parse("1986-11-15"),"11","CR 34-45", "311222222", "abrito@gmail.com", "Demo123.", "ZONA 2", "ADM"),
//                new User(2, "61123211", "NAPOLEON BONAPARTE", ft.parse("1966-11-15"),"11","CR 34-45", "3168965645", "nbonaparte@gmail.com", "Demo123.", "ZONA 2", "COORD"),
//                new User(3, "46669989", "BLODY MARRY", ft.parse("1996-11-15"),"11","CR 34-45", "3174565625", "stellez@gmail.com", "Demo123.", "ZONA 2", "ASE"),
//                new User(4, "52369563", "JUANA DE ARCO", ft.parse("1987-05-15"),"05","CR 34-45", "3265632", "jdarco@gmail.com", "Demo123.", "ZONA 2", "ASE"),
//                new User(5, "123456789", "ALCIRA LA ALPACA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "aalpaca@gmail.com", "Demo123.", "ZONA 1", "COORD"),
//                new User(6, "213456789", "PEDRO CAPAROSA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "pcaparosa@gmail.com", "Demo123.", "ZONA 1", "ASE"),
//                new User(7, "312456789", "LUIS IXV UN SOL", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "reysol@gmail.com", "Demo123.", "ZONA 1", "ASE")
//        ));
//
//        //Instanciar las ordenes
//        Order orderOne = new Order();
//        orderOne.setId(1);
//        Order orderTwo = new Order();
//        orderTwo.setId(2);
//        
//        //Recuperar vendedores
//        Optional<User> salesManOne = userCrudRepository.findById(3);
//        Optional<User> salesManTwo = userCrudRepository.findById(6);
//
//        //Mapa de productos asociados a una orden
//        Map<Integer, Clone> cloneOrderOne = new HashMap<Integer, Clone>();
//        Map<Integer, Clone> gadgetOrderTwo = new HashMap<Integer, Clone>();
//
//        //Mapa de cantidades de producto asociados a una orden
//        Map<Integer, Integer> quantitiesOrderOne = new HashMap<Integer, Integer>();
//        Map<Integer, Integer> quantitiesOrderTwo = new HashMap<Integer, Integer>();
//        
//        //lista de producto de la orden 1
//        cloneOrderOne.put(1, cloneCrudRepository.findById(1).get());
//        cloneOrderOne.put(2, cloneCrudRepository.findById(2).get());
//
//        //Cantidades de producto de la orden 1      
//        quantitiesOrderOne.put(1, 1);
//        quantitiesOrderOne.put(2, 1);
//
//        //lista de producto de la orden 2
//        gadgetOrderTwo.put(1, cloneCrudRepository.findById(1).get());
//        gadgetOrderTwo.put(2, cloneCrudRepository.findById(2).get());
//
//        //Cantidades de producto de la orden 2
//        quantitiesOrderTwo.put(1, 1);
//        quantitiesOrderTwo.put(2, 1);
//             
//        //Configuraciòn datos orden 1
//        orderOne.setRegisterDay(ft.parse("2021-09-15"));
//        orderOne.setStatus(Order.PENDING);
//        orderOne.setSalesMan(salesManOne.get());
//        orderOne.setProducts(cloneOrderOne);
//        orderOne.setQuantities(quantitiesOrderOne);
//        
//        //Configuraciòn datos orden 2
//        orderTwo.setRegisterDay(ft.parse("2021-09-15"));
//        orderTwo.setStatus(Order.PENDING);
//        orderTwo.setSalesMan(salesManTwo.get());
//        orderTwo.setProducts(gadgetOrderTwo);
//        orderTwo.setQuantities(quantitiesOrderTwo);
//
//
//        //registra las ordenes en la base de datos
//        //imprime el los datos de las ordenes
//        orderCrudRepository.saveAll(List.of(orderOne, orderTwo));
//        orderCrudRepository.findAll().forEach(System.out::println);     
    }
}
