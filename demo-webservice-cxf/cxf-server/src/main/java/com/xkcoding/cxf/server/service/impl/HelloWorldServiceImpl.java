package com.xkcoding.cxf.server.service.impl;

import com.xkcoding.cxf.server.entity.dto.User;
import com.xkcoding.cxf.server.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * WebService服务实现类
 * </p>
 *
 * @author zhenghui
 * @date 2021/4/22 22:03
 */
@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort",
    targetNamespace = "http://ws.xkcoding.com/",
    endpointInterface = "com.xkcoding.cxf.server.service.HelloWorldService")
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String sayHello(String myname) {
        try {
            return "Hello, Welcome to CXF Spring boot " + myname + "!!!";
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    @Override
    public User getUser(String myname, String myage) {
        User u=new User();
        u.Name=myname;
        u.age=myage;
        return u;
    }
}
