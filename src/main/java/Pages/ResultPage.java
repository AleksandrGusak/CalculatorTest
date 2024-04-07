package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class ResultPage {

    private String resutlDisplay;
    private Boolean returnResultException;

    //результат сложения
    public String resultDisplayAddition() {
        resutlDisplay = $(By.className("calculator__display")).shouldBe().val();
        Assert.assertEquals(resutlDisplay, "10");
        return resutlDisplay;
    }

    //результат умножения
    public String resultDisplayMultiplication() {
        resutlDisplay = $(By.className("calculator__display")).shouldBe().val();
        Assert.assertEquals(resutlDisplay, "9");
        return resutlDisplay;
    }

    //результат умножения на ноль
    public String resultDisplayMultiplicationByZero() {
        resutlDisplay = $(By.className("calculator__display")).shouldBe().val();
        Assert.assertEquals(resutlDisplay, "0");
        return resutlDisplay;
    }

    //результат деления на ноль
    public String resultDivisionByZero() {
        resutlDisplay = $(By.className("calculator__display")).shouldBe().val();
        Assert.assertEquals(resutlDisplay, "Infinity");
        return resutlDisplay;
    }

    //результат на последовательные нажатия на кнопки разделить и равно
    public String resultTapDivisionByEquually() {
        resutlDisplay = $(By.className("calculator__display")).shouldBe().val();
        Assert.assertEquals(resutlDisplay, "0/");
        return resutlDisplay;
    }

}

    
