package com.xkcoding.cxf.server.service;

import com.xkcoding.cxf.server.entity.dto.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * <p>
 * WebService服务接口
 * </p>
 *
 * @author zhenghui
 * @date 2021/4/22 21:09
 */
@WebService(targetNamespace = "http://ws.xkcoding.com/",name="HelloService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorldService {
   @WebResult(name = "return", targetNamespace = "http://ws.xkcoding.com/")
   @RequestWrapper(localName = "sayHello",
        targetNamespace = "http://ws.xkcoding.com/",
        className = "sample.ws.service.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
        targetNamespace = "http://ws.xkcoding.com/",
        className = "sample.ws.service.SayHelloResponse")
    String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname);

   @WebResult(name = "user", targetNamespace = "http://ws.xkcoding.com/")
    User getUser(@WebParam(name = "NAME", targetNamespace = "") String myname,@WebParam(name = "AGE", targetNamespace = "") String myage);

}
