package com.photoapp.album.mapper;

import com.photoapp.album.api.model.AlbumResponse;
import com.photoapp.album.data.AlbumEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlbumMapper {

    AlbumResponse albumEntityToAlbumResponse(AlbumEntity albumEntity);
    List<AlbumResponse> albumEntityToAlbumResponse(List<AlbumEntity> albumEntities);

}
