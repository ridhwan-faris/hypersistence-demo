package com.ridhwan.hypersistencedemo.service;

import com.ridhwan.hypersistencedemo.common.model.web.request.MerchantRequest;
import com.ridhwan.hypersistencedemo.common.model.web.response.MerchantResponse;
import org.springframework.transaction.annotation.Transactional;

public interface MerchantService {
    @Transactional
    MerchantResponse addMerchant(MerchantRequest request);
}
