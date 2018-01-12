package com.crady;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.crady.bean.SystemParams;

@MapperScan("com.crady.dao")
@EnableConfigurationProperties({SystemParams.class})
@ImportResource(locations = {"classpath*:/spring-mybatis.xml","classpath*:/spring-transaction.xml"})
@EnableTransactionManagement
@SpringBootApplication
public class SpringCloudMybatisApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMybatisApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringCloudMybatisApplication.class);
	}

}
