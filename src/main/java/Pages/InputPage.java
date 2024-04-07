package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class InputPage {



    //локатор кнопки 0
    @FindBy(how = How.XPATH,using = ".//button[@value='0']")
    private SelenideElement button0;

    //локатор кнопки 1
    @FindBy(how = How.XPATH,using = ".//button[@value='1']")
    private SelenideElement button1;

    //локатор кнопки 9
    @FindBy(how = How.XPATH,using = ".//button[@value='9']")
    private SelenideElement button9;

    //локатор кнопки точка
    @FindBy(how = How.XPATH,using = ".//button[@value='.']")
    private SelenideElement point;

    //локатор кнопки умножения
    @FindBy(how = How.XPATH,using = ".//button[@value='*']")
    private SelenideElement multiplication;

    //локатор кнопки деления
    @FindBy(how = How.XPATH,using = ".//button[@value='/']")
    private SelenideElement division;

    //локатор кнопки сложения
    @FindBy(how = How.XPATH,using = ".//button[@value='+']")
    private SelenideElement addition;

    //локатор кнопки вычитания
    @FindBy(how = How.XPATH,using = ".//button[@value='-']")
    private SelenideElement subtraction;

    //локатор кнопки возведения в степень
    @FindBy(how = How.XPATH,using = ".//button[@value='x²']")
    private SelenideElement exponentiation;

    //локатор кнопки равно
    @FindBy(how = How.CSS,using = "body > section.topform > astro-island > div > form > div:nth-child(6) > button.calculator__key.calculator__key--equal.equal__button")
    private SelenideElement equually;

    //нажатие на кнопку 0
    public void clickOnButton0 (){
        button0.scrollIntoView(true).shouldBe().click();
    }

    //нажатие на кнопку 1
    public void clickOnButton1 (){
        button1.shouldBe().click();
    }

    //нажатие на кнопку 9
    public void clickOnButton9 (){
        button9.shouldBe().click();
    }

    //нажатие на кнопку умножить
    public void clickOnButtonMultiplication (){
        multiplication.shouldBe().click();
    }

    //нажатие на кнопку сложить
    public void clickOnButtonAddition (){
        addition.shouldBe().click();
    }

    //нажатие на кнопку разделить
    public void clickOnButtonDivision (){
        division.shouldBe().click();
    }

    //нажатие на кнопку равно
    public void clickOnButtonEquually (){
        equually.scrollIntoView(true).shouldBe().click();
    }

}


