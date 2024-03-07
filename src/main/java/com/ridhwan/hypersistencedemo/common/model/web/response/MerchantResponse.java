package com.ridhwan.hypersistencedemo.common.model.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class MerchantResponse {

    @JsonProperty(value = "merchant_id")
    private Long merchantId;
}
