package com.example.demo.persistence.entity;

import com.example.demo.domain.Generation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    private String name;
    private String password;
    private Integer yearOfBirth;
    private Generation generation;
    private LocalDateTime creationTime;
}
