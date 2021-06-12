package pl.aionpb.aion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.aionpb.aion.db.config.DatabaseConfigurations;
import pl.aionpb.aion.db.config.ServerRoutingDataSource;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class)
@EnableConfigurationProperties(DatabaseConfigurations.class)
public class AionApplication extends SpringBootServletInitializer implements WebMvcConfigurer {

    @Autowired
    DatabaseConfigurations databaseConfigurations;

    @Bean
    public DataSource dataSource() {
        ServerRoutingDataSource dataSource = new ServerRoutingDataSource();
        dataSource.setTargetDataSources(databaseConfigurations.createTargetDataSources());
        return dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(AionApplication.class, args);
    }

}
