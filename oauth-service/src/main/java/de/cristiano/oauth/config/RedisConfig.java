package de.cristiano.oauth.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Slf4j
@EnableCaching
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

}
