package com.javanauta.agendadortarefas.business.mapper;

import com.javanauta.agendadortarefas.business.dto.TarefaDTO;
import com.javanauta.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefaEntity(TarefaDTO dto);
    TarefaDTO paraTarefaDTO(TarefasEntity entity);
    List<TarefasEntity> paraListaTarefasEntity(List<TarefaDTO> dtos);
    List<TarefaDTO> paraListaTarefasDTO(List<TarefasEntity> entities);

}
