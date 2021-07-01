package com.gcalsolaro.grpc.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcalsolaro.grpc.artifact.service.InstanceRequest;
import com.gcalsolaro.grpc.artifact.service.InstanceResponse;
import com.gcalsolaro.grpc.artifact.service.InstanceServiceGrpc.InstanceServiceImplBase;
import com.gcalsolaro.grpc.server.domain.entity.Instance;
import com.gcalsolaro.grpc.server.domain.entity.User;
import com.gcalsolaro.grpc.server.repository.InstanceRepository;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class InstanceServiceImpl extends InstanceServiceImplBase {

	@Autowired
	private InstanceRepository instanceRepository;
	
	@Override
	public void findInstanceApi(InstanceRequest request, StreamObserver<InstanceResponse> responseObserver) {
		
		Optional<Instance> optInstance = instanceRepository.findById(request.getIdInstance());
		if (optInstance.isPresent()) {
			Instance instanceJpa = optInstance.get();
			User userJpa = instanceJpa.getUser();
			
			com.gcalsolaro.grpc.artifact.model.User userGrpc = com.gcalsolaro.grpc.artifact.model.User.newBuilder()
					.setIdUser(userJpa.getIdUser())
					.setName(userJpa.getName())
					.setSurname(userJpa.getSurname())
					.setFiscalCode(userJpa.getFiscalCode())
					.setEmail(userJpa.getEmail())
					.build();
			
			com.gcalsolaro.grpc.artifact.model.Instance instanceGrpc = com.gcalsolaro.grpc.artifact.model.Instance.newBuilder()
					.setIdInstance(instanceJpa.getIdInstance())
					.setCInstance(instanceJpa.getcInstance())
					.setInfo(instanceJpa.getInfo())
					.setUser(userGrpc)
					.build();
			
			InstanceResponse response = InstanceResponse.newBuilder()
					.setSuccess(true)
					.setInstance(instanceGrpc)
					.build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}
}
