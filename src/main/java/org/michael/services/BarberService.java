package org.michael.services;

import org.michael.entities.BarberEntity;
import org.michael.entities.UserEntity;
import org.michael.repositories.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BarberService {

    @Autowired
    private BarberRepository barberRepository;

    public List<BarberEntity> getAll(){
        ArrayList<BarberEntity> barbers = new ArrayList<>();
        barberRepository.findAll().forEach(b->barbers.add(b));
        return barbers;
    }

    public BarberEntity getById(int userId){
        return barberRepository.findById(userId).get();
    }

    public void addBarber(BarberEntity newBarber){
        barberRepository.save(newBarber);
    }

    public void removeBarber(int barberId){
        barberRepository.deleteById(barberId);
    }

    public void removeBarber(BarberEntity barber){
        barberRepository.delete(barber);
    }

    public BarberEntity editBarber(BarberEntity editBarber,int barberId){
        editBarber.setBarberId(barberId);
        barberRepository.save(editBarber);
        return editBarber;
    }



}
