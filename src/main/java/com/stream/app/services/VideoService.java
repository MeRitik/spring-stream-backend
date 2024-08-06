package com.stream.app.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.stream.app.entities.Video;

public interface VideoService {

    // save video
    Video save(Video video, MultipartFile file);

    // get video by id
    Video get(String video);

    // get video by title
    Video getByTitle(String title);

    List<Video> getAll();
}
