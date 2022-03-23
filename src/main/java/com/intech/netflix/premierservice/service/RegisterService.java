package com.intech.netflix.premierservice.service;

import okhttp3.*;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    public void mutliRegister(int i) throws Exception {
        for (int j = 0; j < i; j++) {
            request();
        }
    }

    //TODO : handle errors
    public void request() throws Exception {
        OkHttpClient client = new OkHttpClient();
        // TODO : generate random email
        String emailRandom = "randomEmail";

        // TODO : sanitize input
        String json = "{\"email\":\""+emailRandom+"\",\"password\":\"\",\"passwordRepeat\":\"\",\"securityAnswer\":\"\"}";
        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), json);

        Request request = new Request.Builder()
                .url("http://localhost:3000/api/Users/")
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

}
