package com.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(name = "nom", nullable = true, unique = false, length = 50)
   private String nom;
   @Column(name = "adresse", nullable = true, unique = false, length = 100)
   private String adresse;
   @Column(name = "telephone", nullable = true, unique = false, length = 10)
   private String telephone;

   @OneToOne(mappedBy = "Hotel")
   private Directeur Directeur;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "Hotel_id")
   private Set<Chambre> Chambre;

   public Hotel() {
      super();
   }

   public Hotel(String nom, String adresse, String telephone) {
      this.nom = nom;
      this.adresse = adresse;
      this.telephone = telephone;
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

   public String getAdresse() {
      return this.adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
   }

   public String getTelephone() {
      return this.telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public Directeur getDirecteur() {
      return this.Directeur;
   }

   public void setDirecteur(Directeur Directeur) {
      this.Directeur = Directeur;
   }

   public Set<Chambre> getChambre() {
      return this.Chambre;
   }

   public void setChambre(Set<Chambre> Chambre) {
      this.Chambre = Chambre;
   }

}
