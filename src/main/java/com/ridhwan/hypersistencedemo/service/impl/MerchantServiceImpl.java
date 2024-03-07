package com.ridhwan.hypersistencedemo.service.impl;

import com.ridhwan.hypersistencedemo.common.model.web.request.MerchantRequest;
import com.ridhwan.hypersistencedemo.common.model.web.response.MerchantResponse;
import com.ridhwan.hypersistencedemo.dao.entity.Credentials;
import com.ridhwan.hypersistencedemo.dao.entity.Merchant;
import com.ridhwan.hypersistencedemo.dao.repository.MerchantRepository;
import com.ridhwan.hypersistencedemo.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MerchantServiceImpl implements MerchantService {

    private final MerchantRepository merchantRepository;

    @Transactional
    @Override
    public MerchantResponse addMerchant(MerchantRequest request){
        Credentials credentials = Credentials.builder()
                .client(request.getCredentials().getClient())
                .secret(request.getCredentials().getSecret())
                .description(request.getCredentials().getMerchantDescription()).build();

        Merchant merchant = Merchant.builder()
                .name(request.getMerchantName())
                .address(request.getMerchantAddress())
                .credentials(credentials).build();

        merchant = merchantRepository.save(merchant);

        return MerchantResponse.builder().merchantId(merchant.getId()).build();
    }
}
