package put.io.testing.mocks;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import put.io.students.fancylibrary.database.FancyDatabase;
import put.io.students.fancylibrary.database.IFancyDatabase;
import put.io.students.fancylibrary.service.FancyService;

import java.net.ConnectException;
import java.util.Arrays;
import java.util.List;

public class ExpenseManagerTest {


    @Test
    public void testcalculateTotal() {


        FancyService mockServ = new FancyService();
        FancyDatabase f = mock(FancyDatabase.class);

        ExpenseRepository zad4 = mock(ExpenseRepository.class);
        Expense expense = new Expense();
        expense.setAmount(5);
        zad4.addExpense(expense);
        zad4.addExpense(expense);
        zad4.addExpense(expense);


        ExpenseManager man = new ExpenseManager(zad4, mockServ);
        assertEquals(15, man.calculateTotal());


    }
    //zad 5
    @Test
    public void calculateTotalForCategory() throws ConnectException {
        ExpenseRepository expenseRepository = mock(ExpenseRepository.class);
        when(expenseRepository.getExpensesByCategory(any())).thenReturn(List.of());

        when(expenseRepository.getExpensesByCategory(("Home"))).thenReturn(List.of(
                new Expense(10),
                new Expense(5),
                new Expense(1)

        ));

        when(expenseRepository.getExpensesByCategory("Car")).thenReturn(List.of(
                new Expense(4),
                new Expense(5),
                new Expense(7),
                new Expense(7)

        ));

        ExpenseManager expenseManager = new ExpenseManager(expenseRepository, new FancyService());
        assertEquals(16, expenseManager.calculateTotalForCategory("Home"));
        assertEquals(23, expenseManager.calculateTotalForCategory("Car"));
        assertEquals(0, expenseManager.calculateTotalForCategory("Food"));
        assertEquals(0, expenseManager.calculateTotalForCategory("Sport"));

    }
        //zad 6
        @Test

        public void calculateTotalInDollars()  throws ConnectException {
            ExpenseRepository mockRepository = mock(ExpenseRepository.class);
            FancyService fancyservice = mock(FancyService.class);
            ExpenseManager expenseManager = new ExpenseManager(mockRepository, fancyservice);

            when(fancyservice.convert(anyDouble(), eq("PLN"), eq("USD")))
                    .thenReturn(new FancyService().convert(anyDouble(), eq("PLN"), eq("USD")));

        }
    }

