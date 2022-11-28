package com.photoapp.album.api.controller;

import com.photoapp.album.api.model.AlbumResponse;
import com.photoapp.album.mapper.AlbumMapper;
import com.photoapp.album.service.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/{id}/albums")
@RequiredArgsConstructor
@Slf4j
public class AlbumController {

    private final AlbumService albumService;
    private final AlbumMapper albumMapper;

    @GetMapping
    public List<AlbumResponse> userAlbums(@PathVariable String id) {
        log.info("Calling get user albums");
        var albumEntities = albumService.getAlbums(id);
        var albumResponses = albumMapper.albumEntityToAlbumResponse(albumEntities);

        return albumResponses;
    }

}
