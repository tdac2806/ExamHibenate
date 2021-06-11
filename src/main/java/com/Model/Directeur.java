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
@Table(name = "Directeur")
public class Directeur {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private int id;
   @Column(name = "nom", nullable = true, unique = false, length = 50)
   private String nom;
   @Column(name = "prenom", nullable = true, unique = false, length = 50)
   private String prenom;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name = "Directeur_id")
   private Set<Salarie> Salarie;

   @OneToOne
	@JoinColumn(name="Hotel_id")
	private Hotel Hotel;
   
   public Directeur() {
      super();
   }

   public Directeur(String nom, String prenom) {
      this.nom = nom;
      this.prenom = prenom;
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

   public Set<Salarie> getSalarie() {
      return this.Salarie;
   }

   public void setSalarie(Set<Salarie> salarie) {
      this.Salarie = salarie;
   }

   public Hotel getHotel() {
      return this.Hotel;
   }

   public void setHotel(Hotel Hotel) {
      this.Hotel = Hotel;
   }

}
