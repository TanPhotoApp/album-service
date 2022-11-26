package com.photoapp.album.api.model;

import lombok.Data;

@Data
public class AlbumResponse {

    private String albumId;
    private String userId; 
    private String name;
    private String description;

}
