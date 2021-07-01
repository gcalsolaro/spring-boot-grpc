package com.gcalsolaro.grpc.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gcalsolaro.grpc.server.domain.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
	
}
