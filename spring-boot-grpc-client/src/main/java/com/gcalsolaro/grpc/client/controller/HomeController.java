package com.gcalsolaro.grpc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcalsolaro.grpc.artifact.service.InstanceResponse;
import com.gcalsolaro.grpc.client.service.GRPCClientService;

@RestController
@RequestMapping(value = "/grpc")
public class HomeController {

	@Autowired
	private GRPCClientService grpcClientService;

	@GetMapping("/get")
	public ResponseEntity<String> getIstanzaExample() {
		
		InstanceResponse response = null;

		try {
			response = grpcClientService.findInstance(1);
			if (response.getSuccess()) {
				System.out.println(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(response.toString(), HttpStatus.OK);
	}

}
