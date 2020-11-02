package com.gcalsolaro.grpc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcalsolaro.grpc.client.service.GRPCClientService;
import com.gcalsolaro.grpc.model.IstanzaResponse;

@RestController
@RequestMapping(value = "/grpc")
public class HomeController {

	@Autowired
	private GRPCClientService grpcClientService;

	@GetMapping("/get")
	public ResponseEntity<String> getIstanzaExample() {
		
		IstanzaResponse istanzaResponse = null;

		try {
			istanzaResponse = grpcClientService.recuperaIstanzaApi(1);
			if (istanzaResponse.getEsito()) {
				System.out.println(istanzaResponse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(istanzaResponse.toString(), HttpStatus.OK);
	}

}
