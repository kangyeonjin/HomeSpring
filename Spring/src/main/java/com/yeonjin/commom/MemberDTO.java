package com.yeonjin.commom;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {

    private int sequence;
    private String id;
    private String pwd;
    private String name;

}
