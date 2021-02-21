package com.coursework.demo.mapper;

import com.coursework.demo.dto.CrewDTO;
import com.coursework.demo.entity.Crew;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CrewMapper {

    CrewDTO convertToDto(Crew crew);

    Crew convertToEntity(CrewDTO crewDTO);

    List<CrewDTO> convertToDtoList(List<Crew> licens);

}
