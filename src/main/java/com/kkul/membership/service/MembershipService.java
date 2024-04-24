package com.kkul.membership.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.kkul.membership.model.Membership;
import com.kkul.membership.repository.MembershipRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class MembershipService {
    private final MembershipRepository memberRepository;

    public Flux<Membership> getAllMembership() {
        //data 들어오는지 확인 출력문
//        Flux<Membership> result = memberRepository.findAll();
//        result.subscribe( i-> { System.out.println(i); });
//        return result;
        return memberRepository.findAll();
    }
}
