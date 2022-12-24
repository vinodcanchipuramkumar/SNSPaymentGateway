package com.nextgen.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentGatewayApiService {
	private static final Logger logger = LogManager.getLogger(PaymentGatewayApiService.class);

	@PostMapping(value = "/new", consumes = { MediaType.ALL_VALUE })
	public void newPayment(@RequestBody String in) {
		logger.info("received a new payment request: {}", in);
	}
}
