package put.io.testing.junit;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
public class FailureOrErrorTest {


    @Test
    public void test1() {
        assertEquals(5,4);

    }
    @Test
    public void test2() throws IOException {

//        assertThrows(Exception.class, () -> {
//            Integer.parseInt("1");
//        });
        throw new IOException("blad");


        //4.1 failure wystapil w metodzie test1, poniewaz test sie ni powiodl i zostal oznaczony jako failure. a test2 to error poniewaz nstapilk nioczekiwany wyjatek.
    }
    @Test
    public void test3() throws  Exception{
        try{assertEquals(4,5);}
        catch (Throwable ex){
            //ex.printStackTrace(System.out);
            System.out.println(ex.getStackTrace());
            //ex.printStackTrace();
        }
    }
    //4.2 oczekuje obiektu typu throwable
}
