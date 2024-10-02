package com.arife.exception_handling.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
    private  long id;
    private  String firstName;
    private  String lastName;
    private  int grade;
    private boolean isSuccessful;
}
