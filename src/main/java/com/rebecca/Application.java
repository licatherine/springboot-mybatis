package com.rebecca;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by catherine on 2017/4/14.
 */
/*@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication
/*@MapperScan(basePackages = "com.rebecca")*/
/*@ConfigurationProperties(prefix="spring.datasource")*/
public class Application {

    public static Log logger = LogFactory.getLog(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
