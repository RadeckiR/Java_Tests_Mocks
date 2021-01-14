package put.io.testing.mocks;

import put.io.students.fancylibrary.database.IFancyDatabase;

import java.util.Collections;
import java.util.List;

public class MyDatabase implements IFancyDatabase {

   public <T> List<T> queryAll(){

        return Collections.emptyList();
    }

    public void connect() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
    @Override
    public void close() {

    }
    @Override
    public <T> void persist(T t) {

    }

}
