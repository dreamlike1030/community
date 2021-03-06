package com.lcs.community.dao;

import com.lcs.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {

    //offset每页起始行行号，limit每页最多多少行数据
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //@Param注解用于给参数取别名，如果只有一个参数，并且在<if>里使用必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
