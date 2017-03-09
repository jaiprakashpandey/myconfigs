package com.example;

import com.example.modal.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.repo.ReservationRepo;

import java.util.stream.Stream;


@SpringBootApplication
public class ReservationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApplication.class, args);

    }

    @Autowired
    ReservationRepo repo;

    @Bean
    CommandLineRunner commandLineRunner(ReservationRepo repo) {
        return strings -> {
            Stream.of("jai", "Sindhu").forEach(res -> repo.save(new Reservation(res)));

            repo.findAll().forEach(reservation -> {
                System.out.print(reservation.getId() + reservation.getName());
            });

        };
    }

}
