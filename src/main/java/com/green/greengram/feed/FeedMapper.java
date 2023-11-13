package com.green.greengram.feed;

import com.green.greengram.feed.model.FeedInsProcDto;
import com.green.greengram.feed.model.FeedPicsInsProcDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {
    int insFeed(FeedInsProcDto dto);

    //t_feed_pics
    int insFeedPic(FeedPicsInsProcDto dto);
}