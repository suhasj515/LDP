package com.spring.springsecurity.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Logger;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.spring")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {


	//set up variable to hold properties
	@Autowired
	private Environment env;

	//logger
	private Logger logger=Logger.getLogger(getClass().getName());

	// define a bean for ViewResolver

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	// define bean for security datasourse

	@Bean
	public DataSource securityDataSource() {

		//create connection pool
		ComboPooledDataSource securityDataSource= new ComboPooledDataSource();

		//jdbc driver class
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		}catch (PropertyVetoException e){
			throw  new RuntimeException(e);
		}

		//log connection props
		logger.info(">>>>>>> jdbc.url="+env.getProperty("jdbc.driver"));
		logger.info(">>>>>>> jdbc.user="+env.getProperty("jdbc.user"));


		//set databse connection
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));

		//set connection pool props
		securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));

		return securityDataSource;


	}

	//heper method to read env prop and convert to int
	int getIntProperty(String propName){
		String propVal=env.getProperty(propName);

		int intPropValue= Integer.parseInt(propVal);
		return intPropValue;
	}

	
}









