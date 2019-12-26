package org.michael.repositories;

import org.michael.entities.BookingEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookingEntity,Integer> {
}
