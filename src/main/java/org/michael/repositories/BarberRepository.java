package org.michael.repositories;

import org.michael.entities.BarberEntity;
import org.springframework.data.repository.CrudRepository;

public interface BarberRepository extends CrudRepository<BarberEntity,Integer> {
}
