package zy.relation.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zy.relation.dao.entity.Node;
import zy.relation.service.RelationService;

import javax.annotation.Resource;

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

    @GetMapping("/nodeList")
    public String nodeList(Model model, @RequestParam("categoryId") String categoryId){
        relationService.nodeList(model, Long.parseLong(categoryId));
        return "nodeList";
    }

    @GetMapping("/deleteNodes")
    public String deleteNodes(Model model, @RequestParam("categoryId") String categoryId, @RequestParam("ids") String ids){
//        relationService.deleteNodes(model, Long.parseLong(categoryId));
        relationService.nodeList(model, Long.parseLong(categoryId));
        return "nodeList";
    }

    @PostMapping("/addNode")
    public String addNode(Node node){
        relationService.addNode(node);
        return "redirect:/relation/";
    }
}
