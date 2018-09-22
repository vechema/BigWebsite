package com.jegner.converter;

import com.jegner.dto.ChoreDto;
import com.jegner.entity.Chore;

public class ChoreConverter {
    public static Chore dtoToEntity(ChoreDto choreDto) {
        Chore chore = new Chore(choreDto.getName(), null);
        chore.setId(choreDto.getId());
        return chore;
    }

    public static ChoreDto entityToDto(Chore chore) {
        return new ChoreDto(chore.getId(), chore.getName());
    }
}
