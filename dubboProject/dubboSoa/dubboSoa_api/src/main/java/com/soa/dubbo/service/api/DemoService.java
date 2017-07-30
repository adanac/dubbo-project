package com.soa.dubbo.service.api;

public interface DemoService {

    void sayHello();

    String returnHello();

    MsgInfo returnMsgInfo(MsgInfo info);

}