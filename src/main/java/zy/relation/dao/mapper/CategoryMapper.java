package zy.relation.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import zy.relation.dao.entity.Category;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public List<Category> list();
}
