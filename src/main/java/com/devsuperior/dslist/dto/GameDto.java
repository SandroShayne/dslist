package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameDto {


        private Long id;
        private String title;
        private Integer year;
        private String genre;
        private String platforms;
        private Double score;
        private String imgUrl;
        private String shortDescription;
        private String longDescription;

        public GameDto(){
        }

    public GameDto(Game Entity) {
        this.id = Entity.getId();
        this.title = Entity.getTitle();
        this.year = Entity.getYear();
        this.genre = Entity.getGenre();
        this.platforms = Entity.getPlatforms();
        this.score = Entity.getScore();
        this.imgUrl = Entity.getImgUrl();
        this.shortDescription = Entity.getShortDescription();
        this.longDescription = Entity.getLongDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
