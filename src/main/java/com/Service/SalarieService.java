package com.Service;

import java.util.List;

import com.Model.Salarie;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class SalarieService {

   public boolean create(Salarie Salarie, Session session) {
      session.save(Salarie);
      return true;
   }

   public boolean delete(int id, Session session) {
      Salarie s = session.get(Salarie.class, id);
      if (s != null)
         session.delete(s);
      return true;
   }

   public boolean update(int id, String nom, String prenom, int salaire, String experience, Session session) {
      Salarie s = session.get(Salarie.class, id);
      if (s != null) {
         s.setNom(nom);
         s.setPrenom(prenom);
         s.setSalaire(salaire);
         s.setExperience(experience);
         session.update(s);
      }
      return true;
   }

   public Salarie findById(int id, Session session) {
      Salarie s = session.get(Salarie.class, id);
      session.get(Salarie.class, id);
      return s;
   }

   public List<Salarie> findAll(Session session) {
      Query q = session.createQuery("From Salarie");
      List<Salarie> listes = q.list();
      return listes;
   }
}
