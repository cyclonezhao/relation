package zy.relation.view.vo;

import lombok.Data;
import zy.relation.dao.entity.Category;
import zy.relation.dao.entity.Node;

import java.util.ArrayList;
import java.util.List;

@Data
public class IndexVO {
    private List<Node> nodeList = new ArrayList<>();
    private List<Category> categoryList = new ArrayList<>();
}
