package com.awscourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Machine {
    private String ip;
    private String name;
    private String os;
    private String architecture;
    private String osVersion;
}
