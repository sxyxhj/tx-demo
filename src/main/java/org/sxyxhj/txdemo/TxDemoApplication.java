package org.sxyxhj.txdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.sxyxhj.txdemo.config.DB1DataSourceConfig;
import org.sxyxhj.txdemo.config.DB2DataSourceConfig;
import org.sxyxhj.txdemo.controller.PaymentController;


//首先要在@SpringBootApplication排除该类，因为它会读取application.properties文件的spring.datasource.*属性并自动配置单数据源
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class})
@EnableConfigurationProperties(value = {DB1DataSourceConfig.class, DB2DataSourceConfig.class})
//@MapperScan("org.sxyxhj.txdemo.mybatis.mapper.*")
@ComponentScan(basePackages = "org.sxyxhj")
public class TxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxDemoApplication.class, args);
    }

}
