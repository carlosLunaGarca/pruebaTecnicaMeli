package com.meli.cuponservice.Entitys;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Data
@ToString
public class Favoritos {
    @Id
    String id;
    Integer favoriteCounter;
    Long price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Favoritos)) return false;
        Favoritos item = (Favoritos) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
