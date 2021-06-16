package ma.sii.workshop.ms.account.presentation.mapping;

import ma.sii.workshop.libs.mapping.BaseMapper;
import ma.sii.workshop.ms.account.domain.entity.Person;
import ma.sii.workshop.ms.account.presentation.dto.PersonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<Person, PersonDTO> { }
