package com.bilgeadam.springbarabbitmqproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String firstName;
    private String lastName;
    private String email;
    private Date birthOfDate;
}
