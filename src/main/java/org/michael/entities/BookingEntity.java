package org.michael.entities;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private LocalDate dayOfBooking;
    private LocalDate strDate;
    private LocalDate endDate;
    private Boolean confirmedOrNot;



    @ManyToOne
    @JoinColumn(name="barber_id")
    private BarberEntity barber;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;


    public BookingEntity() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getDayOfBooking() {
        return dayOfBooking;
    }

    public void setDayOfBooking(LocalDate dayOfBooking) {
        this.dayOfBooking = dayOfBooking;
    }

    public LocalDate getStrDate() {
        return strDate;
    }

    public void setStrDate(LocalDate strDate) {
        this.strDate = strDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getConfirmedOrNot() {
        return confirmedOrNot;
    }

    public void setConfirmedOrNot(Boolean confirmedOrNot) {
        this.confirmedOrNot = confirmedOrNot;
    }

    public BarberEntity getBarber() {
        return barber;
    }

    public void setBarber(BarberEntity barber) {
        this.barber = barber;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
