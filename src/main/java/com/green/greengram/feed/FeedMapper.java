package com.green.greengram.feed;

import com.green.greengram.feed.model.FeedInsProcDto;
import com.green.greengram.feed.model.FeedPicsInsProcDto;
import com.green.greengram.feed.model.FeedSelDto;
import com.green.greengram.feed.model.FeedSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    int insFeed(FeedInsProcDto dto);
    List<FeedSelVo> selFeed(FeedSelDto dto);

    //t_feed_pics
    int insFeedPic(FeedPicsInsProcDto dto);
}
