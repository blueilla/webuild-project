package com.webuild.webuild.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "phone_number")
@Getter
@Setter
@NoArgsConstructor
public class PhoneNumber {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String phoneNumber;
  @ManyToOne
  @JoinColumn(name = "company_id", nullable = false)
  private Company company;

  public PhoneNumber(String phoneNumber, Company company) {
    this.phoneNumber = phoneNumber;
    this.company = company;
  }

}

