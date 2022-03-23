package com.intech.netflix.premierservice;

import com.intech.netflix.premierservice.service.RegisterService;
import okhttp3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@SpringBootApplication
public class PremierserviceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PremierserviceApplication.class, args);
	}


}
