/**
 * 
 */
package ejemploWEBClase.aplicaciones;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author Talamino
 *
 */

@Configuration
@ComponentScan
@PropertySource("classpath:propiedades.properties")
@EnableJpaRepositories(basePackages = "ejemploWEBClase.aplicaciones.dal")
public class AplicacionConfiguracionContexto {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("ejemploWEBClase.dal, ejemploWEBClase.web.controladores, ejemploWEBClase.impl");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		return factoryBean;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		Properties properties = new Properties();
		
		dataSource.setDriverClassName(properties.getProperty("datasource.driverClassName"));
		dataSource.setUrl(properties.getProperty("datasource.url"));
		dataSource.setUsername(properties.getProperty("datasource.user"));
		dataSource.setPassword(properties.getProperty("datasource.password"));
		
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");


		return dataSource;
	}

	
	@Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
	
}
