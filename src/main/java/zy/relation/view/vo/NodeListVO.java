package zy.relation.view.vo;

import lombok.Data;
import zy.relation.dao.entity.BaseEntity;
import zy.relation.dao.entity.Node;

import java.util.List;

@Data
public class NodeListVO extends BaseEntity {
    private long categoryId;
    private List<Node> nodeList;
}
