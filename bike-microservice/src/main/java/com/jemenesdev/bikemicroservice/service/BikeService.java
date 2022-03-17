package com.jemenesdev.bikemicroservice.service;

import com.jemenesdev.bikemicroservice.entity.Bike;
import com.jemenesdev.bikemicroservice.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {
    @Autowired
    BikeRepository bikeRepository;

    public List<Bike> getAll() {
        return bikeRepository.findAll();
    }

    public Bike getBikeById(int id) {
        return bikeRepository.findById(id).orElse(null);
    }

    public Bike save(Bike bike) {
        return bikeRepository.save(bike);
    }

    public List<Bike> byUserId(int userId) {
        return bikeRepository.findByUserId(userId);
    }
}
