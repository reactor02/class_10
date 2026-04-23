package kr.or.human3;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode

@Data

public class MemberDTO {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String email;
    private int age;
    
    
}