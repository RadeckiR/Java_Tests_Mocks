package put.io.testing.mocks;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import put.io.students.fancylibrary.database.FancyDatabase;
import put.io.students.fancylibrary.database.IFancyDatabase;
import  org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class ExpenseRepositoryTest {


    @Test
    public void testTestedMethod() {


        MyDatabase fakeLoad = new MyDatabase();
        ExpenseRepository mockObject = Mockito.mock(ExpenseRepository.class);
        mockObject.setDatabase(fakeLoad);

        verify(mockObject, times(0)).loadExpenses();


        when(mockObject.getExpenses()).thenReturn(null);
        //assertEquals(zad2.getExpenses(),new ArrayList<>());
    }

    @Test
    public void testLoadExpense() {


        IFancyDatabase f = mock(MyDatabase.class);
        ExpenseRepository zad2 = new ExpenseRepository(f);

        zad2.loadExpenses();

//        verify(f).connect();
//        verify(f).queryAll();
//        verify(f).close();

        InOrder inOrder = inOrder(f);
        inOrder.verify(f).connect();
        inOrder.verify(f).queryAll();
        inOrder.verify(f).close();


        assertEquals(zad2.getExpenses(), new ArrayList<>());
        //when(zad2.getExpenses()).thenReturn(null);
    }


    @Test
    public void testSaveExpense() {


        FancyDatabase f = mock(FancyDatabase.class);
        ExpenseRepository zad2 = new ExpenseRepository(f);
        Expense expense = new Expense();
        zad2.addExpense(expense);
       // zad2.loadExpenses();
        zad2.saveExpenses();

        verify(f).persist(any(Expense.class));
        //verify(f,times(5)).persist(any(Expense.class));
//
    }

}

