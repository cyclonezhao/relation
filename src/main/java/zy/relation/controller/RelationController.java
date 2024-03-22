package zy.relation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zy.relation.dao.entity.Node;
import zy.relation.dao.mapper.NodeMapper;
import zy.relation.dao.mybatisplus.Sequence;

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
        Node node = Node.builder().number("dfd").description("dlkjfds").build();
        nodeMapper.insert(node);
    }
}
