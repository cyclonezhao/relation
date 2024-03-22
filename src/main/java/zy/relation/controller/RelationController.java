package zy.relation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zy.relation.dao.entity.Node;
import zy.relation.dao.mapper.NodeMapper;
import zy.relation.dao.mybatisplus.Sequence;
import zy.relation.service.RelationService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/relation")
public class RelationController {

    @Resource
    private RelationService relationService;

    @GetMapping("/")
    public String index(Model model){
        relationService.index(model);
        return "index";
    }
}
