package zy.relation.mapper;

import org.apache.ibatis.annotations.Mapper;
import zy.relation.entity.Node;

import java.util.List;

@Mapper
public interface NodeMapper {
    public List<Node> list();

    void insert(Node node);
}
