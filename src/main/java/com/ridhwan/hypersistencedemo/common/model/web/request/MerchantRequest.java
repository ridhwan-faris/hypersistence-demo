package com.ridhwan.hypersistencedemo.common.model.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MerchantRequest {

    @JsonProperty(value = "merchant_name")
    private String merchantName;

    @JsonProperty(value = "merchant_address")
    private String merchantAddress;

    @JsonProperty(value = "credentials")
    private CredentialsRequest credentials;
}
