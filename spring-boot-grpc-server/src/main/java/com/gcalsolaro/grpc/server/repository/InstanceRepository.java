package com.gcalsolaro.grpc.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gcalsolaro.grpc.server.domain.entity.Instance;

public interface InstanceRepository extends PagingAndSortingRepository<Instance, Integer> {

}
