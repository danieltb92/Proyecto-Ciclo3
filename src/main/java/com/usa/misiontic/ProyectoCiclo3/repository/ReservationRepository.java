package com.usa.misiontic.ProyectoCiclo3.repository;

//import com.usa.misiontic.ProyectoCiclo3.entities.Client;
import com.usa.misiontic.ProyectoCiclo3.entities.Reservation;
//import com.usa.misiontic.ProyectoCiclo3.entities.custome.TopClients;
import com.usa.misiontic.ProyectoCiclo3.repository.crudRepository.ReservationCrudRepository;
//import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }
    public Reservation save(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
    public void delete(Reservation reservation){
        reservationCrudRepository.delete(reservation);
    }
    
    //Reto 5
    
    /*public List<Reservation> getReservationByStatus(String sts){
        return reservationCrudRepository.findAllByStatus(sts);
    }
    
    public List<Reservation> getDatesReport(Date A,Date B){
        return reservationCrudRepository.findAllByStartDateAfterAndStartDateBefore(A,B);
    }
   
    public List<TopClients> getTopClients(){
        List<TopClients> res= new ArrayList<>();
        List<Object[]> report = reservationCrudRepository.countTotalReservationByClient();
        for(int i=0;i<report.size();i++){
            res.add(new TopClients((Long)report.get(i)[1],(Client) report.get(i)[0]));
        }
        return res;
    }*/

}
