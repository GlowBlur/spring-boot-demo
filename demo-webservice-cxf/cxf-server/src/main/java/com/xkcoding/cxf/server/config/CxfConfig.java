package com.xkcoding.cxf.server.config;

import com.xkcoding.cxf.server.service.HelloWorldService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * <p>
 * Cxf-Server配置类
 * </p>
 *
 * @author zhenghui
 * @date 2021/4/22 21:47
 */
@Configuration
public class CxfConfig {
    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        //绑定要发布的服务
        EndpointImpl endpoint=new EndpointImpl(bus, helloWorldService);
        //显示要发布的名称
        endpoint.publish("/hello");
        return endpoint;
    }
}
