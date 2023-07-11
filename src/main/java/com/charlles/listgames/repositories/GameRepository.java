package com.charlles.listgames.repositories;

import com.charlles.listgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
