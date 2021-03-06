package com.helloxin.zootopia.mouse.dao;

import com.helloxin.zootopia.mouse.model.MoviePO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by nandiexin on 2019/2/2.
 */
@Mapper
public interface MoviePOMapper {

    @Insert("insert into movie ( movie_name, director, duration, score, date_release, region, actors, category, source, douban_detail,date_create,date_update,is_delete)\n" +
            "values ( #{movie.movieName}, #{movie.director}, #{movie.duration}, #{movie.score}, #{movie.dateRelease}, #{movie.region}, #{movie.actors}, #{movie.category}, #{movie.source}, #{movie.doubanDetail}, #{movie.dateCreate}, #{movie.dateUpdate}, #{movie.isDelete})")
    @Options(useGeneratedKeys=true, keyProperty="movie.id", keyColumn="id")
    int insert(@Param("movie") MoviePO movie);
}
