package com.kkul.membership.controller;

import com.kkul.membership.service.MembershipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MembershipController {
    private final MembershipService memberService;

    @GetMapping("/v1/membership")
    public ResponseEntity<Object> publishMembership() {
        return ResponseEntity.ok().body(memberService.getAllMembership());
    }
}
