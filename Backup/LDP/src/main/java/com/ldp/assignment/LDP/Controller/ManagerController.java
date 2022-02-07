package com.ldp.assignment.LDP.Controller;

import com.ldp.assignment.LDP.dao.HotelRepository;
import com.ldp.assignment.LDP.dao.ManagerRepository;
import com.ldp.assignment.LDP.entity.Customer;
import com.ldp.assignment.LDP.entity.Hotel;
import com.ldp.assignment.LDP.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerRepository managerRepository;

    @Autowired
    HotelRepository hotelRepository;

    Manager manager;

    @GetMapping("/create")
    public String create(){
        manager=new Manager("lalith","du","du@gmail.com",null);
        managerRepository.save(manager);
    return "bye";
    }

    @GetMapping("/bad")
    public String createbad(){
        Manager temp= managerRepository.getById(13);
        temp.setHotel(hotelRepository.getById(1));
        managerRepository.save(temp);
        return "bye";
    }

    @GetMapping("/good")
    public String creategood(){
        Manager temp= managerRepository.getById(13);
        temp.setHotel(hotelRepository.getById(3));
        managerRepository.save(temp);
        return "bye";
    }

    @GetMapping("/{id}")
    public String viewManger(@PathVariable int id, Model model){
        Manager manager=managerRepository.getById(id);
        Hotel hotel=manager.getHotel();
        List<Customer> customerList= hotel.getCustomersList();

        model.addAttribute("manager",manager);
        model.addAttribute("hotel",hotel);
        model.addAttribute("customerList",customerList);


        return "manager_page";
    }

}
