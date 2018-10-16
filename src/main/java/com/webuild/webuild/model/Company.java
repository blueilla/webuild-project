package com.webuild.webuild.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "company")
@Getter
@Setter
@NoArgsConstructor
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String companyName;
  private String email;
  private String companyType;
  private boolean isTrusted;
  @OneToMany(mappedBy = "company")
  private List<PhoneNumber> phoneNumber;
  @ManyToMany(mappedBy = "companies")
  private Set<User> users = new HashSet<>();

  public Company(String companyName, String email, String companyType, boolean isTrusted, List<PhoneNumber> phoneNumber, Set<User> users) {
    this.companyName = companyName;
    this.email = email;
    this.companyType = companyType;
    this.isTrusted = isTrusted;
    this.phoneNumber = phoneNumber;
    this.users = users;
  }

}


