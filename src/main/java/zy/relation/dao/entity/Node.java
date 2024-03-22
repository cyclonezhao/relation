package zy.relation.dao.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Node {
    private long id;
    private String number;
    private String description;
}
