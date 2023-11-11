package com.typhoone.rrts.utility;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  Wrapper around ModelMapper that provides methods for converting between entity and DTO objects. See existing DTO
 *  and entity classes for how to name fields. The ModelMapper
 *  <a href="http://modelmapper.org/getting-started/">documentation</a> has
 *  more information on the conventions and configuration needed for proper usage.
 */
@Component
public class EntityMapper {


    private final ModelMapper mapper;

    @Autowired
    public EntityMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    /**
     * Maps an entity to a DTO.
     *
     * @param entity The entity.
     * @param dtoClass Class object for the DTO type.
     * @param <D> The type of the DTO.
     * @param <E> Type of the entity.
     * @return A DTO of type {@link D}
     */
    public <D, E> D toDto(E entity, Class<D> dtoClass) {
        return mapper.map(entity, dtoClass);
    }

    /**
     * Maps a DTO to an entity.
     *
     * @param dto The DTO to map.
     * @param entityClass Class object for the entity type.
     * @param <D> Type of the DTO
     * @param <E> Type of the Entity.
     * @return An entity of Type {@link E}
     */
    public <D, E> E toEntity(D dto, Class<E> entityClass) {
        return mapper.map(dto, entityClass);
    }
}
