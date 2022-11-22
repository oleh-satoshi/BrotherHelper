package com.example.brotherhelper.repository;

import com.example.brotherhelper.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Long> {
}
