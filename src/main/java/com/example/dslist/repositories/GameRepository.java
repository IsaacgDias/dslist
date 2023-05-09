package com.example.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dslist.entities.Game;

//Repository faz a consulta do banco de dados 

public interface GameRepository extends JpaRepository<Game, Long> {

}
