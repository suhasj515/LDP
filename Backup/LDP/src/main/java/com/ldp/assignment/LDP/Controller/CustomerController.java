package com.ldp.assignment.LDP.Controller;

import com.ldp.assignment.LDP.dao.CustomerRepository;
import com.ldp.assignment.LDP.dao.HotelRepository;
import com.ldp.assignment.LDP.entity.Customer;
import com.ldp.assignment.LDP.entity.Hotel;
import com.ldp.assignment.LDP.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("/{id}")
    public String viewManger(@PathVariable int id, Model model){

        Customer customer=customerRepository.getById(id);
        Hotel hotel=customer.getHotels();
        List<Hotel>  avilableHotelList=hotelRepository.findAll();
        avilableHotelList.remove(hotel);

        model.addAttribute("customer",customer);
        model.addAttribute("hotel",hotel);
        model.addAttribute("avilableHotelList",avilableHotelList);

        return "customer_page";
    }

    @GetMapping("/cancel_booking")
    public String cancelBooking(@RequestParam("customerId") int id)
    {
        System.out.println(id);
        return "redirect:"+"http://localhost:8082/customer/"+id;
    }
}
