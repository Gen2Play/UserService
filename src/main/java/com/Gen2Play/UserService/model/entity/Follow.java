package com.Gen2Play.UserService.model.entity;

import com.Gen2Play.UserService.model.entity.enumeration.FollowEnum;

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
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private FollowEnum type;

    @ManyToOne
    @JoinColumn(name = "follower_id", nullable = false)
    private Person follower;

    @ManyToOne
    @JoinColumn(name = "following_id", nullable = false)
    private Person following;
}
