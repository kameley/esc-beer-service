package esc.springframework.escbeerservice.repositories;

import esc.springframework.escbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>
{
}
