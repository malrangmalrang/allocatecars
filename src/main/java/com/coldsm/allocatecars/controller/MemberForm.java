package com.coldsm.allocatecars.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "이름은 필수입니다.")
    private String name;

    @NotEmpty(message = "차를 가지고 있는지 선택해주세요.")
    private String haveCar;

}
