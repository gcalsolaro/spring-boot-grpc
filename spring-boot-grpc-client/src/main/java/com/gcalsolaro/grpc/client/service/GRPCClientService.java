package com.gcalsolaro.grpc.client.service;

import org.springframework.stereotype.Service;

import com.gcalsolaro.grpc.artifact.service.IstanzaRequest;
import com.gcalsolaro.grpc.artifact.service.IstanzaResponse;
import com.gcalsolaro.grpc.artifact.service.IstanzaServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class GRPCClientService {

	/**
	 * 
	 * @param idBozza
	 * @return
	 */
	public IstanzaResponse recuperaIstanzaApi(Integer idIstanza) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		IstanzaServiceGrpc.IstanzaServiceBlockingStub stub = IstanzaServiceGrpc.newBlockingStub(channel);

		IstanzaResponse response = stub
				.recuperaIstanzaApi(IstanzaRequest.newBuilder().setIdIstanza(idIstanza).build());
		channel.shutdown();

		return response;
	}

}
