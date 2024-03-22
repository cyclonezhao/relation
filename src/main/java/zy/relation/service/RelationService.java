package zy.relation.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import zy.relation.dao.entity.Node;
import zy.relation.dao.mapper.NodeMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RelationService {
    @Resource
    private NodeMapper nodeMapper;

    public void index(Model model) {
        List<Node> nodeList = nodeMapper.list();
        model.addAttribute("nodeList", nodeList);
    }
}
