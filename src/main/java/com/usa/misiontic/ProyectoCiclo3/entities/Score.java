package com.usa.misiontic.ProyectoCiclo3.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "score")
public class Score implements Serializable {

    @Id
    private Integer score;

    @OneToOne
    @JoinColumn(name = "reservationId")
    @JsonIgnoreProperties("reservationId")
    private Reservation reservation;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

   
    
}
