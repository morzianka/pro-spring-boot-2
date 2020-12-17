package com.apress.todo.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shabunina Anita
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "todo")
public class ToDoRestClientProperties {

    private String url;
    private String basePath;
}
