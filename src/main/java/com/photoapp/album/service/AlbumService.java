package com.photoapp.album.service;

import com.photoapp.album.data.AlbumEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    public List<AlbumEntity> getAlbums(String userId) {
        AlbumEntity album1 = AlbumEntity.builder()
            .id(1L)
            .userId(userId)
            .albumId("album1Id")
            .description("album 1 description")
            .name("album 1 name")
            .build();

        AlbumEntity album2 = AlbumEntity.builder()
            .id(2L)
            .userId(userId)
            .albumId("album2Id")
            .description("album 2 description")
            .name("album 2 name")
            .build();
        
        return List.of(album1, album2);
    }
    
}
