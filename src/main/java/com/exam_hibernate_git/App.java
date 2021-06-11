package com.exam_hibernate_git;

import java.util.HashSet;

import java.util.Set;

import com.Model.Salarie;
import com.Model.Directeur;
import com.Model.Hotel;
import com.Model.Chambre;
import com.Service.DirecteurService;
import com.Service.HotelService;

import org.hibernate.Session;

public class App {
   public static void main(String[] args) {
      DirecteurService ds = new DirecteurService();
      HotelService hs = new HotelService();

      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();

            Salarie s1 = new Salarie("Da Costa", "Tristan",1250, "Bac+5");
            Salarie s2 = new Salarie("Da Costa2", "Tristan2",2800, "Bac+5 avec 10ans d'experience");
            Salarie s3 = new Salarie("Da Costa3", "Tristan3",3250, "Bac+7 avec 5ans d'experience");
            Directeur d1 = new Directeur("Directeur Nom", "Directeur Prenom");
            Hotel h1 = new Hotel("Hotel1","1 rue de Lyon","0601020304");
            Chambre c1 = new Chambre(20,"Chambre pour 2 avec lit double",0);
            Chambre c2 = new Chambre(12,"Chambre pour 1 avec lit simple",2);
            Chambre c3 = new Chambre(25,"Chambre pour 4 avec 2 lit doubles",2);

            Set<Salarie> ListS = new HashSet<Salarie>();
            ListS.add(s1);
            ListS.add(s2);
            ListS.add(s3);
            d1.setSalarie(ListS);
            d1.setHotel(h1);
            ds.create(d1, session);

            Set<Chambre> ListC = new HashSet<Chambre>();
            ListC.add(c1);
            ListC.add(c2);
            ListC.add(c3);
            h1.setChambre(ListC);
            hs.create(h1, session);

      session.getTransaction().commit();
      HibernateUtil.shutdown();

   }
}
