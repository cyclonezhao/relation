package zy.relation.dao.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class Node extends BaseEntity {
    private String number;
    private String description;
}
