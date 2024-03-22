package zy.relation.dao.mybatisplus;

public class ArrayUtils {
    public static boolean isNotEmpty(Object[] array) {
        return array != null && array.length > 0;
    }
}
