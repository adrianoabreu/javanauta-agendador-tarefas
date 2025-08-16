package com.javanauta.agendadortarefas.business.mapper;

import com.javanauta.agendadortarefas.business.dto.TarefaDTORecord;
import com.javanauta.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefaEntity(TarefaDTORecord dto);
    TarefaDTORecord paraTarefaDTORecord(TarefasEntity entity);
    List<TarefasEntity> paraListaTarefasEntity(List<TarefaDTORecord> dtos);
    List<TarefaDTORecord> paraListaTarefasDTO(List<TarefasEntity> entities);

}
