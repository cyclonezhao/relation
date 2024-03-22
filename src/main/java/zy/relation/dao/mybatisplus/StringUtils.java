package zy.relation.dao.mybatisplus;

public class StringUtils {
    public static boolean isNotBlank(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
