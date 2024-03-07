package com.ridhwan.hypersistencedemo.controller;

import com.ridhwan.hypersistencedemo.common.ApiPath;
import com.ridhwan.hypersistencedemo.common.model.web.request.MerchantRequest;
import com.ridhwan.hypersistencedemo.common.model.web.response.MerchantResponse;
import com.ridhwan.hypersistencedemo.service.MerchantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPath.V1 + ApiPath.MERCHANT)
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    @PostMapping
    public ResponseEntity<MerchantResponse> addMerchant(@RequestBody MerchantRequest request){
        MerchantResponse merchantResponse = merchantService.addMerchant(request);
        return ResponseEntity.ok(merchantResponse);
    }

}
