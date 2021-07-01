package com.gcalsolaro.grpc.client.service;

import org.springframework.stereotype.Service;

import com.gcalsolaro.grpc.artifact.service.InstanceRequest;
import com.gcalsolaro.grpc.artifact.service.InstanceResponse;
import com.gcalsolaro.grpc.artifact.service.InstanceServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class GRPCClientService {

	/**
	 * 
	 * @param idBozza
	 * @return
	 */
	public InstanceResponse findInstance(Integer idInstance) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

		InstanceServiceGrpc.InstanceServiceBlockingStub stub = InstanceServiceGrpc.newBlockingStub(channel);

		InstanceResponse response = 
				stub.findInstanceApi(InstanceRequest.newBuilder().setIdInstance(idInstance).build());
		channel.shutdown();

		return response;
	}

}
