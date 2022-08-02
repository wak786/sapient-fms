package com.example.fms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<Traveller> travellers;
    @ManyToOne(cascade = CascadeType.ALL)
    private Flight flightId;

    public Reservation(List<Traveller> travellers, Flight flightId) {
        this.travellers = travellers;
        this.flightId = flightId;
    }

    public Reservation() {

    }
}
