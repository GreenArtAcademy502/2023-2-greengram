package com.green.greengram.feed.model;

import lombok.Data;

import java.util.List;

@Data
public class FeedInsDto {
    private int iuser; //3
    private String contents; //나이스
    private String location; //서울
    private List<String> pics;
}
