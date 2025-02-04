package br.com.alelo.consumer.consumerpat.api.dto.mapper;

import br.com.alelo.consumer.consumerpat.api.dto.Dto;

import java.util.Collection;
import java.util.List;

/**
 * Interface responsável por definir mapeamentos entre uma Entity da camada
 * de persistência e um DTO da camada de transporte.
 *
 * @param <E> - tipo de dados das entidades
 * @param <D> - tipo de dados dos DTOs
 */
public interface DtoMapper<E, D extends Dto> {
    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDtos(Collection<E> entities);

    List<E> toEntities(Collection<D> dtos);
}
