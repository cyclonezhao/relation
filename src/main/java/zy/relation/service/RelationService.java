package zy.relation.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import zy.relation.dao.entity.Category;
import zy.relation.dao.entity.Node;
import zy.relation.dao.mapper.CategoryMapper;
import zy.relation.dao.mapper.NodeMapper;
import zy.relation.view.vo.IndexVO;
import zy.relation.view.vo.NodeListVO;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RelationService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private NodeMapper nodeMapper;

    public void index(Model model) {
        List<Category> categoryList = categoryMapper.list();

        IndexVO indexVO = new IndexVO();
        indexVO.setCategoryList(categoryList);

        model.addAttribute("indexVO", indexVO);
    }

    public void addNode(Node node) {
        nodeMapper.insert(node);
    }

    public void nodeList(Model model, long categoryId) {
        List<Node> nodeList = nodeMapper.list(categoryId);
        NodeListVO nodeListVO = new NodeListVO();
        nodeListVO.setCategoryId(categoryId);
        nodeListVO.setNodeList(nodeList);
        model.addAttribute("nodeListVO", nodeListVO);
    }
}
