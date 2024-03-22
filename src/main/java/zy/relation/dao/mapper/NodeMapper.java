package zy.relation.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import zy.relation.dao.entity.Node;

import java.util.List;

@Mapper
public interface NodeMapper {
    public List<Node> list();

    void insert(Node node);
}
