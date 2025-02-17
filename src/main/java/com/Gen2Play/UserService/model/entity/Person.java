package com.Gen2Play.UserService.model.entity;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import com.Gen2Play.UserService.model.entity.enumeration.PlanEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID personId;
    private String nickName;
    private String fullName;
    private String bio;
    private String avatar;
    private LocalDateTime dateOfBirth;
    private String address;
    private PlanEnum plan;
    private UUID accountId;

    @OneToMany (mappedBy = "person")
    private Set<Social> socials;
}
