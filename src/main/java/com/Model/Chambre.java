package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Chambre")
public class Chambre {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "num_chambre", nullable = false)
   private int num_chambre;
   @Column(name = "superficie", nullable = true, unique = false)
   private int superficie;
   @Column(name = "type", nullable = true, unique = false, length = 50)
   private String type;
   @Column(name = "etage", nullable = true, unique = false)
   private int etage;

   @ManyToOne
   private Hotel hotel;

   public Chambre() {
      super();
   }

   public Chambre(int superficie, String type, int etage) {
      this.superficie = superficie;
      this.type = type;
      this.etage = etage;
   }

   public int getNum_chambre() {
      return this.num_chambre;
   }

   public void setNum_chambre(int num_chambre) {
      this.num_chambre = num_chambre;
   }

   public int getSuperficie() {
      return this.superficie;
   }

   public void setSuperficie(int superficie) {
      this.superficie = superficie;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public int getEtage() {
      return this.etage;
   }

   public void setEtage(int etage) {
      this.etage = etage;
   }

   public Hotel getHotel() {
      return this.hotel;
   }

   public void setHotel(Hotel hotel) {
      this.hotel = hotel;
   }

}
