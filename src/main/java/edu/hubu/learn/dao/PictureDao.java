package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Picture;

public interface PictureDao extends JpaRepository<Picture, Long> {

}