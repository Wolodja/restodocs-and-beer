package com.github.restodocsandbeer.web.mappers;

import com.github.restodocsandbeer.domain.Beer;
import com.github.restodocsandbeer.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
