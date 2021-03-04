package org.sxyxhj.txdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: tx-demo
 * @description: 数据库2 数据源管理器
 * @author: elroyh
 * @create: 2021-03-04 14:44
 **/
@ConfigurationProperties(prefix = "spring.datasource.db2")
@Data
public class DB2DataSourceConfig {
    String url;
    String username;
    String password;
    int minPoolSize;
    int maxPoolSize;
    int maxLifetime;
    int borrowConnectionTimeout;
    int loginTimeout;
    int maintenanceInterval;
    int maxIdleTime;
}
