package com.cdac.orm1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
   name = "address"
)
public class Address {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   @Column(
      name = "address_id"
   )
   private Long id;
   @Column(
      name = "street_name"
   )
   private String street;
   @Column(
      name = "city_name"
   )
   private String city;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getStreet() {
      return this.street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public String getCity() {
      return this.city;
   }

   public void setCity(String city) {
      this.city = city;
   }
}
