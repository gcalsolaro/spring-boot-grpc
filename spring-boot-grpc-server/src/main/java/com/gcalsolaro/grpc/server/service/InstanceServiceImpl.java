package com.gcalsolaro.grpc.server.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.modelmapper.protobuf.ProtobufModule;
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

			ModelMapper mapper = new ModelMapper().registerModule(new ProtobufModule());
			mapper.getConfiguration().setDestinationNameTokenizer(NameTokenizers.UNDERSCORE);

			com.gcalsolaro.grpc.artifact.model.User userGrpc = mapper.map(userJpa, com.gcalsolaro.grpc.artifact.model.User.Builder.class).build();
			com.gcalsolaro.grpc.artifact.model.Instance instanceGrpc = mapper.map(instanceJpa, com.gcalsolaro.grpc.artifact.model.Instance.Builder.class)
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
