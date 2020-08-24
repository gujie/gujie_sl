package com.gj.util;

import com.gj.realm.MyJdbcRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringShiroConfig {
/**
 * 开启Shiro注解（如@RequiresRoles,@RequiresPermissions）,
 * 借助SpringAOP扫描使用Shiro注解的类，并在必要时进行安全逻辑验证
 * 配置以下两个Bean（DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor）
 * */
@Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
    DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator=new DefaultAdvisorAutoProxyCreator();
    advisorAutoProxyCreator.setProxyTargetClass(true);
    return advisorAutoProxyCreator;
}
/**
 * 开启AOP注解自持
 * */
@Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Autowired SecurityManager securityManager){
    AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
    authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
    return authorizationAttributeSourceAdvisor;
    }

    @Bean
    public Realm createRealm(@Autowired DataSource dataSource){

        MyJdbcRealm realm = new MyJdbcRealm();
        realm.setDataSource(dataSource);
        realm.setPermissionsLookupEnabled(true);
        return realm;
    }

}
