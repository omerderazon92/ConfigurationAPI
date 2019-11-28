package com.configurationapi.redisconfigapi;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    private RedisTemplate<String, String> redisTemplate;
    private HashOperations<String, String, String> hashOperations;

    public RepositoryImpl(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Map<String, String> findAll(String projectName) {
        return hashOperations.entries(projectName);
    }
}
