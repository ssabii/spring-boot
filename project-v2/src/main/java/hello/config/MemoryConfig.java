package hello.config;

import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfig {

    @Bean
    public MemoryFinder memoryfinder(){
        return new MemoryFinder();
    }

    @Bean
    public MemoryController memoryController(){
        return new MemoryController(memoryfinder());
    }
}
