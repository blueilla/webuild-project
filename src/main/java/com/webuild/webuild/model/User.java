package com.webuild.webuild.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String email;
  private String firstName;
  private String lastName;
  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
          name = "user_company",
          joinColumns = { @JoinColumn(name = "user_id") },
          inverseJoinColumns = { @JoinColumn(name = "company_id") }
  )
  private Set<Company> companies = new HashSet<>();

  public User(String email, String firstName, String lastName, Set<Company> companies) {
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.companies = companies;
  }

}

