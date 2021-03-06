package com.example.demo_initializer.Repositories;

import com.example.demo_initializer.components.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    List<Hotel> findByHotelNameAndAndCity(String hotelname , String city);
    List<Hotel> findByCity(String city);
    List<Hotel> findByHotelName(String name);

}
