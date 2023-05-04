package com.example.spring_rest_service.service;

import com.example.spring_rest_service.model.Response;

public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");
        return response;
    }
}
