package com.kkul.membership.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.kkul.membership.model.Membership;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
//mongo
//public interface MembershipRepository extends ReactiveMongoRepository<Membership, String> {
//h2 or mysql
public interface MembershipRepository extends ReactiveCrudRepository<Membership, String> {
}
