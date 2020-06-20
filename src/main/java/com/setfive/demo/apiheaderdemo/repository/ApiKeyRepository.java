package com.setfive.demo.apiheaderdemo.repository;

import com.setfive.demo.apiheaderdemo.entity.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer> {
    public Optional<ApiKey> findOneByKey(String key);
}
