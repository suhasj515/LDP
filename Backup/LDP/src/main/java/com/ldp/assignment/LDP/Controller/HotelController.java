package com.ldp.assignment.LDP.Controller;

import com.ldp.assignment.LDP.dao.HotelRepository;
import com.ldp.assignment.LDP.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping("/save")
    public String save()
    {
        Hotel hotel= new Hotel("apple",3000,"andaman");
        hotelRepository.save(hotel);
        return "bye";

    }

}
