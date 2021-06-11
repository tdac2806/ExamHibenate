package com.Service;

import java.util.List;

import com.Model.Hotel;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class HotelService {


   public boolean create(Hotel Hotel, Session session) {
      session.saveOrUpdate(Hotel);
      return true;
   }

   public boolean delete(int id, Session session) {
      Hotel h = session.get(Hotel.class, id);
      if (h != null)
         session.delete(h);
      return true;
   }

   public boolean update(int id, String nom, String adresse, String Telephone, Session session) {
      Hotel h = session.get(Hotel.class, id);
      if (h != null) {
         h.setNom(nom);
         h.setAdresse(adresse);
         h.setTelephone(Telephone);
         session.update(h);
      }
      return true;
   }

   public Hotel findById(int id, Session session) {
      Hotel h = session.get(Hotel.class, id);
      session.get(Hotel.class, id);
      return h;
   }

   public List<Hotel> findAll(Session session) {
      Query q = session.createQuery("From Hotel");
      List<Hotel> listes = q.list();
      return listes;
   }
}
