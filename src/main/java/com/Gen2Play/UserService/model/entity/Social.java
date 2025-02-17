package com.Gen2Play.UserService.model.entity;

import com.Gen2Play.UserService.model.entity.enumeration.SocialEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Social {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private SocialEnum type;
    private String socialUrl;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
}
