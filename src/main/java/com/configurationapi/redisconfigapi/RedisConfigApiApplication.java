package com.configurationapi.redisconfigapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SpringBootApplication
public class RedisConfigApiApplication {

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}

	@Bean
	RedisTemplate<String, String> redisTemplate() {
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer( ));
		redisTemplate.setHashValueSerializer(new StringRedisSerializer( ));
		redisTemplate.setKeySerializer(new StringRedisSerializer( ));
		redisTemplate.setValueSerializer(new StringRedisSerializer( ));
		return redisTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(RedisConfigApiApplication.class, args);
	}
}
