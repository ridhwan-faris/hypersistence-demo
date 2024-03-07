package com.ridhwan.hypersistencedemo.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Credentials {

    private String client;
    private String secret;
    @JsonProperty("description")
    private String description;
}
