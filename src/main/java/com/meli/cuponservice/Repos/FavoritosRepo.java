package com.meli.cuponservice.Repos;

import com.meli.cuponservice.Entitys.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritosRepo extends JpaRepository<Favoritos,String> {
    List<Favoritos> findByOrderByFavoriteCounterDesc();

}
