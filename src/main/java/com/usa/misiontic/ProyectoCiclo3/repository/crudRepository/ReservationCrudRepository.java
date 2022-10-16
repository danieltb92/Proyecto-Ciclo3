package com.usa.misiontic.ProyectoCiclo3.repository.crudRepository;

import com.usa.misiontic.ProyectoCiclo3.entities.Reservation;
//import java.util.Date;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.Query;




public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
    
    //Reto 5
    
    /*@Query(SELECT c.client, COUNT(c.client) FROM Reservation AS c group by c.client order by COUNT(c.client)DESC)
    public List<Object[]> countTotalReservationByClient();
    
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date A, Date B);
    
    public List<Reservation> findAllByStatus(String status);*/
}
