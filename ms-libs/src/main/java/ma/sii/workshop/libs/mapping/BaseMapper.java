package ma.sii.workshop.libs.mapping;

import java.util.List;

public interface BaseMapper<E, D> {

    List<D> toDtoList(List<E> entityList);

    D toDto(E entity);

    E toEntity(D dto);
}
