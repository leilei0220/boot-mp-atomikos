package com.leilei.controller;


import com.leilei.service.IRealEseateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author leilei
 * @since 2019-11-27
 */
@Controller
@RequestMapping("/realEseate")
public class RealEseateController {
    @Autowired
    private IRealEseateService realEseateService;

    @PostMapping("aa")
    public int aaa(){
        realEseateService.TestAtomikos();
        return 0;
    }
}

