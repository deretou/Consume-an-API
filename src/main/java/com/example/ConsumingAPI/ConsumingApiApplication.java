package com.example.ConsumingAPI;

import com.example.ConsumingAPI.entity.Market;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class ConsumingApiApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingApiApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = builder.build();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restTemplate.setMessageConverters(messageConverters);

		return restTemplate;
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			try {

				ResponseEntity<Market[]> response =
						restTemplate.getForEntity(
								"https://api.coinlore.com/api/exchanges/",
								Market[].class);
				Market[] markets = response.getBody();

				for(Market exchange: markets) {
					log.info(exchange.toString());
				}


			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error:-" + e.getMessage());
			}



		};
	}

}
