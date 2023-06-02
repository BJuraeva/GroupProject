package Project2;

/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
 */
public interface Task10WebDriver {
    void open();

    void close();

    void getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends Task10WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDrive implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("ChromeDrive open ...");
    }

    @Override
    public void close() {
        System.out.println("ChromeDrive close ...");
    }

    @Override
    public void getTitle() {
        System.out.println("Tittle is ChromeDrive");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with ChromeDrive ...");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate with ChromeDrive");
    }
}

class FireFoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("FireFoxDriver open ...");
    }

    @Override
    public void close() {
        System.out.println("FireFoxDriver close ...");
    }

    @Override
    public void getTitle() {
        System.out.println("Tittle is FireFoxDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with FireFoxDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate with FireFoxDriver");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("SafariDriver open ...");
    }

    @Override
    public void close() {
        System.out.println("SafariDriver close ...");
    }

    @Override
    public void getTitle() {
        System.out.println("Tittle is SafariDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot with SafariDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate with SafariDriver");
    }
}

class Task10Tester {
    public static void main(String[] args) {

        RemoteWebDriver [] drivers = {new ChromeDrive(),new FireFoxDriver(),new SafariDriver()};
        for (RemoteWebDriver driver:drivers){
            driver.open();
            driver.close();
            driver.getTitle();
            driver.getScreenshot();
            driver.navigate();
        }
    }
}