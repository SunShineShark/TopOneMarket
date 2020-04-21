package com.sunzhai.util;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisPlusGenerator {
    public static void main(String[] args) {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false) // 是否支持AR模式，自动生成实体类对应的CRUD方法
                .setAuthor("zhai") // 作者
                .setOutputDir("C:\\MybatisPlus") // 生成路径
                .setFileOverride(true)  // 文件是否覆盖
                .setOpen(true) //生成完后是否打开文件夹
                .setEnableCache(false) //是否在xml中添加二级缓存配置
                .setIdType(IdType.AUTO) // 主键策略
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
                // IEmployeeService
                .setBaseResultMap(true) //生成基本的resultMap
                .setBaseColumnList(true);//生成基本的SQL片段

        //2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://59.110.41.46:7000/cute_auth?useUnicode=true&characterEncoding=utf-8&useSSL=false")
                .setUsername("root")
                .setPassword("Zr019741230");

        //3. 策略配置StrategyConfig中
        String[] fieldPrefix = {"cute_"};
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
                .setEntityLombokModel(true)
                .setNaming(NamingStrategy.underline_to_camel)// 数据库表映射到实体的命名策略
                .entityTableFieldAnnotationEnable(true)
                .setTablePrefix("cute_") //指定扫描表的前缀
                .setFieldPrefix(fieldPrefix)//指定字段前缀
                .setInclude("cute_user_1");  // 指定扫描的表的名称
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };
        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.sunzhai")
                .setMapper("mapper")//dao
                .setService("service")//servcie
                .setController("controller")//controller
                .setEntity("entity")
                .setXml("mapper");//mapper.xml

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setCfg(injectionConfig)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();
    }
}
