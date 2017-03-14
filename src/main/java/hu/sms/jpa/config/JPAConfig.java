package hu.sms.jpa.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class JPAConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.postgresql.Driver");
	    dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
	    dataSource.setUsername("postgres");
	    dataSource.setPassword("postgres");
	    return dataSource;
	}
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	    em.setDataSource(dataSource());
	    em.setPackagesToScan("hu.sms.domain");
	    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    em.setJpaVendorAdapter(vendorAdapter);
	    em.setJpaProperties(additionalProperties());
	    return em;
    }
	
	Properties additionalProperties() {
	    Properties properties = new Properties();
	    properties.setProperty("hibernate.hbm2ddl.auto", "update");
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
	    //properties.setProperty("hibernate.show_sql", "true");
	    return properties;
	}

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
    	JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

}