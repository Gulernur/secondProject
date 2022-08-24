package com.example.secondproject.repositories;

import com.example.secondproject.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
