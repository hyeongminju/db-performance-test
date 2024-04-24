package com.kkul.membership.model;


import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//h2
@Table
//mongo
//@Document(collection = "membership")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Membership {
    private String membershipId;
    //h2 or mysql
    private LocalDateTime createdAt;
    //mongo
    //private String createdAt;
    private String memberId;
}
