package com.sparta.entity;

import jakarta.persistence.*;

//기본적인 애너테이션들

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
@Table(name = "memo") // 데이터베이스에 매핑할 테이블의 이름을 지정
public class Memo {
    //테이블의 기본 키 지정 (영속성 컨텍스트에서 이 엔티티를 구분할 때 사용 식별자 역할) 꼭 지정해야함 필수
    @Id
    private Long id;

    // nullable: null 허용 여부 (디폴트값은 true)
    // unique: 중복 허용 여부 (false 일때 중복 허용) 디폴트는 false
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정 (디폴트는 255)
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}