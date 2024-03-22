package zy.relation.dao.mybatis.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import zy.relation.dao.entity.BaseEntity;
import zy.relation.dao.mybatisplus.Sequence;

@Intercepts(
        {
                @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}),
        }
)
public class MyInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        Object[] args = invocation.getArgs();
        if (target instanceof Executor) {
            final Executor executor = (Executor) target;
            MappedStatement ms = (MappedStatement) args[0];
            if (ms.getSqlCommandType() == SqlCommandType.INSERT) {
                Object parameter = args[1];
                if(parameter instanceof BaseEntity){
                    ((BaseEntity)parameter).setId(new Sequence().nextId());
                }
            }
        }

        return invocation.proceed();
    }
}
