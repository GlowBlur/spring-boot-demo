package com.xkcoding.cxf.server.entity.dto;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * <p>
 * 用户类
 * </p>
 *
 * @author zhenghui
 * @date 2021/4/23 12:48
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name="User")
public class User implements Serializable {
    @XmlElement(name = "NAME")
    public String Name="MyName";
    @XmlElement(name = "AGE")
    public String age="18";
}
