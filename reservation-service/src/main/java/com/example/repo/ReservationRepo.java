package com.example.repo;

import com.example.modal.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Created by Jai on 3/9/2017.
 */
@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation, Long>{

    @RestResource(path="byn")
    Collection<Reservation> findByName(@Param("rm") String rm );
}
