package com.lamichhane.spring.rest.config;



import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.lamichhane.spring.rest")
@PropertySource("classpath:persistence-oracle.properties")
public class DemoAppConfig {
	
	
	// set up variable to hold the properties
		@Autowired
		private Environment env;
		
		// set up a logger  for diagnostics
		private Logger logger = Logger.getLogger(getClass().getName());


		
		// define a bean for our security datasource
		@Bean
		public DataSource securityDataSource() {
			
			// create a connection pool
			ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
			
			// set the jdbc driver class
			try {
				securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
			
			logger.info(">>> jdbc.url="+env.getProperty("jdbc.url"));
			logger.info(">>> jdbc.user="+env.getProperty("jdbc.user"));
			
			
			
			
			// log the conneciton props
			
			// set database connection props
			securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
			securityDataSource.setUser(env.getProperty("jdbc.user"));
			securityDataSource.setPassword(env.getProperty("jdbc.password"));
			
			
			// set connection pool props
			securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
			securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
			securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
			securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
			
			return securityDataSource;
		}
		
		
		// need a helper method
		private int getIntProperty(String propName) {
			String propVal = env.getProperty(propName);
			int intPropVal = Integer.parseInt(propVal);
			return intPropVal;
		}
		
		private Properties getHibernateProperties() {

			// set hibernate properties
			Properties props = new Properties();

			props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
			props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
			
			return props;				
		}

		
			
		
		@Bean
		public LocalSessionFactoryBean sessionFactory(){
			
			// create session factorys
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			
			// set the properties
			sessionFactory.setDataSource(securityDataSource());
			sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
			sessionFactory.setHibernateProperties(getHibernateProperties());
			
			return sessionFactory;
		}
		
		@Bean
		@Autowired
		public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
			
			// setup transaction manager based on session factory
			HibernateTransactionManager txManager = new HibernateTransactionManager();
			txManager.setSessionFactory(sessionFactory);

			return txManager;
		}
	
	
	
}









