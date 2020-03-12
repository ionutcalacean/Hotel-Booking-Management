package com.example.demo_initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/booking")
public class BookingController {
    private BookingRepository bookingRepository;


    @Autowired
    public BookingController(BookingRepository bookingRepository){
    this.bookingRepository=bookingRepository;
    }

    @RequestMapping(value="/getall",method= RequestMethod.GET)
    public List<Booking>getAll()
    {

        return bookingRepository.findAll();
    }

    /*@RequestMapping(value = "/getlowcost/{price}",method = RequestMethod.GET)
    public List<Booking> getLowCost(@PathVariable double price)
    {
        return bookings.stream().filter(x->x.getPrice() <= price).collect(Collectors.toList());
    }
    @RequestMapping(value = "/create",method=RequestMethod.POST)
    public List<Booking> create(@RequestBody Booking booking)
    {
        bookings.add(booking);

        return bookings;
    }*/

}