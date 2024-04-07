package Test;
import Pages.InputPage;
import Pages.ResultPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CalcTest extends ResultPage {

    private InputPage page =
            open("https://ecalc.ru/simple/", InputPage.class);


    ResultPage page2 = new ResultPage();

    //проверка на корректный результат операции сложения
    @Test
    public void OperationAddition() {
        page.clickOnButton1();
        page.clickOnButtonAddition();
        page.clickOnButton9();
        page.clickOnButtonEquually();
        page2.resultDisplayAddition();
    }

    //проверка на на корректный результат операции умножения
    @Test
    public void OperationMultiplication() {
        page.clickOnButton1();
        page.clickOnButtonMultiplication();
        page.clickOnButton9();
        page.clickOnButtonEquually();
        page2.resultDisplayMultiplication();
    }

    //проверка на на корректный результат операции умножения на ноль
    @Test
    public void OperationMultiplicationByZero() {
        page.clickOnButton1();
        page.clickOnButtonMultiplication();
        page.clickOnButton0();
        page.clickOnButtonEquually();
        page2.resultDisplayMultiplicationByZero();
    }

    //проверка на на корректный результат операции деления на ноль
    @Test
    public void OperationDivisionByZero() {
        page.clickOnButton1();
        page.clickOnButtonDivision();
        page.clickOnButton0();
        page.clickOnButtonEquually();
        page2.resultDivisionByZero();
    }

    //проверка на на корректный результат при последовательном нажатии на деление и равно
    @Test
    public void OperationDivisionByEqually() {
        page.clickOnButtonDivision();
        page.clickOnButtonEquually();
        page2.resultTapDivisionByEquually();
    }


}