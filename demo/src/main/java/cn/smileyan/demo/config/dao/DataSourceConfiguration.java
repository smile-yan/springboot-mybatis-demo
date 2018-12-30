package cn.smileyan.demo.config.dao;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;


/**
 * 配置mmybatis
 * @author smileyan
 */
@Configuration
@MapperScan("cn.smileyan.demo.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.user}")
    private String jdbcUser;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setUser(jdbcUser);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setPassword(jdbcPassword);
        // 关闭连接后无自动commit
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
