package zy.relation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zy.relation.entity.Node;
import zy.relation.mapper.NodeMapper;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/relation")
public class RelationController {
    @Resource
    private NodeMapper nodeMapper;

    @GetMapping("list")
    public List<Node> list(){
        return nodeMapper.list();
    }

    @GetMapping("add")
    public void add(){
        Node node = Node.builder().id(1).number("dfd").description("dlkjfds").build();
        nodeMapper.insert(node);
    }
}
