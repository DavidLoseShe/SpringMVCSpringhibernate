package com.test.ssh.service.impl;

import com.test.ssh.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XRog
 * On 2/1/2017.12:58 AM
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }
}