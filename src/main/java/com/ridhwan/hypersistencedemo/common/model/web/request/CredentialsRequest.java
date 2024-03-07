package com.ridhwan.hypersistencedemo.common.model.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CredentialsRequest {

    @JsonProperty(value = "client")
    private String client;

    @JsonProperty(value = "secret")
    private String secret;

    @JsonProperty(value = "description")
    private String merchantDescription;
}
