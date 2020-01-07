package org.michael.services;

import org.michael.entities.BookingEntity;
import org.michael.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingEntity> getAll(){
        ArrayList<BookingEntity> bookings = new ArrayList<>();
        bookingRepository.findAll().forEach(b->bookings.add(b));
        return bookings;
    }
    public BookingEntity getById(int bookingId) {
        return bookingRepository.findById(bookingId).get();
    }

    public void addBooking(BookingEntity booking){
        bookingRepository.save(booking);
    }
    public void removeBooking(int bookingId){
        bookingRepository.deleteById(bookingId);
    }

    public void removeBooking(BookingEntity booking){
        bookingRepository.delete(booking);
    }

    public BookingEntity editBooking(BookingEntity editBooking,int bookingId){
        editBooking.setBookingId(bookingId);
        bookingRepository.save(editBooking);
        return editBooking;
    }

}
