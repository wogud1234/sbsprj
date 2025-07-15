package com.sbs.qnaService.boundedContext.question.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity // 엔티티로서의 역할을 부여
// 아래 클래스와 1:1 매칭되는 테이블이 DB에 없다면, 자동으로 생성됨
public class Question {
    @Id     // Primary Key로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment 설정
    private Integer id;

    @Column(length = 200)       // Varchar(200)로 설정
    private String subject;

    @Column(columnDefinition = "TEXT")  //
    private String content;

    private LocalDateTime createDate;
}
