package org.sxyxhj.txdemo.config;

import javafx.beans.NamedArg;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.AliasFor;

/**
 * @program: tx-demo
 * @description: 数据库1 数据源管理器
 * @author: elroyh
 * @create: 2021-03-04 14:44
 **/


@ConfigurationProperties(prefix = "spring.datasource.db1")
@Data
public class DB1DataSourceConfig {

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

