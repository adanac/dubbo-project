package com.dubbo.demo.api;

public interface DemoService {

    void sayHello();

    String returnHello();

    MsgInfo returnMsgInfo(MsgInfo info);

}