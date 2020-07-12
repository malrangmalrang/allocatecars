package com.coldsm.allocatecars.domain;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String haveCar; //Y, N, H

//    @OneToMany(mappedBy = "member", cascade = ALL)
//    private MemberAllocateCar memberAllocateCar;

    protected Member() {}

    public Member(@NotEmpty String name, @NotEmpty String haveCar) {
        this.name = name;
        this.haveCar = haveCar;
    }
}
