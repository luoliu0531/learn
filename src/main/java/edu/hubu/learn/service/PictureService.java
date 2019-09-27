package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.PictureDao;
import edu.hubu.learn.entity.Picture;

@Service
public class PictureService {

    @Autowired
    private PictureDao pictureDao;

    public Picture getUser(Long id) {
        return PictureDao.findById(id).get();
    }
}