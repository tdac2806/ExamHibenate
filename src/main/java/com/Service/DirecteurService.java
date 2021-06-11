package com.Service;

import java.util.List;

import com.Model.Directeur;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class DirecteurService {

   public boolean create(Directeur Directeur, Session session) {
      session.save(Directeur);
      return true;
   }

   public boolean delete(int id, Session session) {
      Directeur d = session.get(Directeur.class, id);
      if (d != null)
         session.delete(d);
      return true;
   }

   public boolean update(int id, String nom, String prenom, Session session) {
      Directeur d = session.get(Directeur.class, id);
      if (d != null) {
         d.setNom(nom);
         d.setPrenom(prenom);
         session.update(d);
      }
      return true;
   }

   public Directeur findById(int id, Session session) {
      Directeur d = session.get(Directeur.class, id);
      session.get(Directeur.class, id);
      return d;
   }

   public List<Directeur> findAll(Session session) {
      Query q = session.createQuery("From Directeur");
      List<Directeur> listes = q.list();
      return listes;
   }
}
