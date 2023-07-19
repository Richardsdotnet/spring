package contextDemo.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private  String tableName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
