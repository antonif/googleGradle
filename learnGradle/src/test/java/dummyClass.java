//package myGoogleTest;

public class dummyClass {
    @Test
    public void test() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","driver = webdriver.Chrome(");
        WebDriver driver = new ChromeDriver();

        String urlToshow = "http://google.com";

        driver.get(urlToshow);

    }
}
