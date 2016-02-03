package info.ernestas.simple.springexample.core.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "info.ernestas.simple.springexample.core")
@EnableJpaRepositories(basePackages = "info.ernestas.simple.springexample.core.dao.repository")
@EnableTransactionManagement
@EnableCaching
@PropertySource("classpath:springexample.${spring.profiles.active:dev}.properties")
public class SimpleCoreConfiguration {

    @Value("${db.server}")
    private String databaseServer;

    @Value("${db.user}")
    private String databaseUser;

    @Value("${db.password}")
    private String databasePassword;

    @Value("${db.database}")
    private String databaseName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DataSource dataSource() {
        Properties props = new Properties();
        props.setProperty("dataSourceClassName", "com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        props.setProperty("dataSource.serverName", databaseServer);
        props.setProperty("dataSource.user", databaseUser);
        props.setProperty("dataSource.password", databasePassword);
        props.setProperty("dataSource.databaseName", databaseName);
        props.setProperty("maximumPoolSize", "5");

        return new HikariDataSource(new HikariConfig(props));
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPackagesToScan("info.ernestas.simple.springexample.core.model");
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);

        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        jpaProperties.put("hibernate.format_sql", true);
        jpaProperties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
        jpaProperties.put("hibernate.show_sql", true);
        jpaProperties.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.EhCacheRegionFactory");
        jpaProperties.put("hibernate.cache.use_query_cache", true);
        jpaProperties.put("hibernate.cache.use_second_level_cache", true);

        entityManagerFactoryBean.setJpaProperties(jpaProperties);

        return entityManagerFactoryBean;
    }

    @Bean
    public EhCacheCacheManager ehcacheCacheManager() {
        EhCacheCacheManager ehCacheCacheManager = new EhCacheCacheManager();
        ehCacheCacheManager.setCacheManager(getEhCacheManagerFactoryBean().getObject());

        return ehCacheCacheManager;
    }

    @Bean
    public EhCacheManagerFactoryBean getEhCacheManagerFactoryBean() {
        EhCacheManagerFactoryBean bean = new EhCacheManagerFactoryBean();
        bean.setConfigLocation(new ClassPathResource("ehcache.xml"));

        return bean;
    }

}
