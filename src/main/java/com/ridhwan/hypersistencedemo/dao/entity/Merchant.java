package com.ridhwan.hypersistencedemo.dao.entity;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "merchant")
@Setter
@Getter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Type(JsonType.class)
    @Column(name = "credentials", columnDefinition = "jsonb")
    private Credentials credentials;
}
