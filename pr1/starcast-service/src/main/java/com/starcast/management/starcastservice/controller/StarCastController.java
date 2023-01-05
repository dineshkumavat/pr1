package com.starcast.management.starcastservice.controller;

import com.starcast.management.starcastservice.entity.ResponseTemplateVO;
import com.starcast.management.starcastservice.entity.StarCast;
import com.starcast.management.starcastservice.service.StarCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cast")
public class StarCastController {

    @Autowired
    StarCastService starCastService;
    @PostMapping("/")
    public StarCast saveStarCast(@RequestBody StarCast starCast){
        return starCastService.saveStarCast(starCast);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getStarCastDetails(@PathVariable Long id){
        return starCastService.getStarCastDetails(id);
    }
}
