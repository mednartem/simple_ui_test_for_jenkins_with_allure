Selenium autotests for run to selenoid with use Allure

### Dependencies:

* Java 8
* Selenide 5.16.2
* JUnit 5.7.0
* Aspectj 1.9.4
* Allure-selenide 2.13.7
* Allure plugin 2.8.1

For run tests need to pass the parameters via System.properties

* Login and password for access selenoid
 >user.credentials= 

* Url selenoid
> remote.browser.url=

Then run tests with use terminal:
> gradle test -Duser.credentials= -Dremote.browser.url=

