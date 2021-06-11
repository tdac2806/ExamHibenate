package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Salarie")
public class Salarie {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(name = "nom", nullable = true, unique = false, length = 50)
   private String nom;
   @Column(name = "prenom", nullable = true, unique = false, length = 50)
   private String prenom;
   @Column(name = "salaire", nullable = true, unique = false)
   private int salaire;
   @Column(name = "Experience", nullable = true, unique = false, length = 100)
   private String Experience;

   @ManyToOne
   private Directeur directeur;

   public Salarie() {
      super();
   }

   public Salarie(String nom, String prenom, int salaire, String Experience) {
      this.nom = nom;
      this.prenom = prenom;
      this.salaire = salaire;
      this.Experience = Experience;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNom() {
      return this.nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getPrenom() {
      return this.prenom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public int getSalaire() {
      return this.salaire;
   }

   public void setSalaire(int salaire) {
      this.salaire = salaire;
   }

   public String getExperience() {
      return this.Experience;
   }

   public void setExperience(String Experience) {
      this.Experience = Experience;
   }

   public Directeur getDirecteur() {
      return this.directeur;
   }

   public void setDirecteur(Directeur directeur) {
      this.directeur = directeur;
   }

}
