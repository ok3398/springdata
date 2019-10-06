package com.test.springdatademo;

import javax.persistence.*;
import java.util.Date;

//@Entity(name="Account") //Account 라는 도메인에 매핑된 엔티티이다.(테이블 개념)
//@Table //아무 설정하지 않으면 엔티티 이름

@Entity
public class Account {
    //Account 라는 도메인 클래스 생성

    //주 키에 매핑
    //@GeneratedValue 자동으로 생성
    @Id @GeneratedValue
    private Long id;

    @Column // 생략 가능
    private String username;

    //@Column(nullable = false, unique = true)
    private String password;

    @Temporal(TemporalType.TIMESTAMP) //TIME//
    private Date created = new Date();

    private String yes;

    @Transient //컬럼 매핑 안함
    private String no;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column=@Column(name="home_street")),
            @AttributeOverride(name="city", column = @Column(name="home_city")),
            @AttributeOverride(name="state", column = @Column(name="home_state")),
            @AttributeOverride(name="zipCode", column = @Column(name="home_zipCode"))
    })
    private Address homeAddress;


    @Embedded
    private Address officeAddress;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
