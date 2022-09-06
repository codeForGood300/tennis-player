package io.datajek.springdataJPA2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSpringDataRepository extends JpaRepository<Player, Integer>{

    public List<Player> findByNationality(String nationality);

}