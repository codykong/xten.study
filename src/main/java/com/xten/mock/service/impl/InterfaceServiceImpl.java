package com.xten.mock.service.impl;

import com.xten.mock.service.InterfaceService;

/**
 * Created with IntelliJ IDEA.
 * Date: 15-1-6
 * Time: 下午4:26
 */
public class InterfaceServiceImpl implements InterfaceService {
    @Override
    public String mockInterface() {
        return "这是一个线上的接口";
    }
}
