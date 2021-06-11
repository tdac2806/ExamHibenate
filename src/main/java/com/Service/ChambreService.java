package com.Service;

import java.util.List;

import com.Model.Chambre;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class ChambreService {

   public boolean create(Chambre Chambre, Session session) {
      session.save(Chambre);
      return true;
   }

   public boolean delete(int num_chambre, Session session) {
      Chambre h = session.get(Chambre.class, num_chambre);
      if (c != null)
         session.delete(c);
      return true;
   }

   public boolean update(int num_chambre, int superficie, String type, int etage, Session session) {
      Chambre c = session.get(Chambre.class, num_chambre);
      if (c != null) {
         c.setSuperficie(superficie);
         c.setType(type);
         c.setEtage(etage);
         session.update(c);
      }
      return true;
   }

   public Chambre findBynum_chambre(int num_chambre, Session session) {
      Chambre c = session.get(Chambre.class, num_chambre);
      session.get(Chambre.class, num_chambre);
      return c;
   }

   public List<Chambre> findAll(Session session) {
      Query q = session.createQuery("From Chambre");
      List<Chambre> listes = q.list();
      return listes;
   }
}
