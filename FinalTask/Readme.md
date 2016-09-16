Final task

URL: http://automationpractice.com/index.php
Это тестовый e-commerce сайт, который позволяет написать авто-тесты такого типа, 
как регистрация на сайте, поиск товара, добавление товара в корзину и так далее.

Test cases

E-1 Verify that contact us form sends successfully
1. Перейдите на страницу Contact Us.
2. Заполните все необходимые поля (прикрепите txt файл).
3. Нажмите кнопку Send.
4. Убедитесь, что сообщение об успешной отправке отображается.

E-2 Verify that error message appears if Message area is empty
1. Перейдите на страницу Contact Us.
2. Заполните все необходимые поля, кроме поля Message.
3. Нажмите кнопку Send.
4. Убедитесь, что сообщение «The message cannot be blank.» об ошибке отображается.

E-3 Verify the ability to register
1. Выполните регистрацию на сайте, успользуя рандомные данные.
2. Убедитесь, что страница My Account отображается.

E-4 Verify the ability to search items
1. Выполните поиск товара Blouse.
2. Убедитесь, что этот товар отображается в результатах поиска.

E-5 Verify the ability to add and delete items from cart
1. Выполните поиск какого-нибудь товара, добавьте его в корзину и убедитесь, что он отображается там.
2. После этого удалите товар из корзины и убедитесь, что она пустая.

E-6 Catalog Test.
1. Перейдите на страницу  Women -> T-Shirts.
2. Убедитесь, что отображается товар T-Shirt.

E-7 Proceed To Checkout
1. Добавьте товар в корзину и выполните его покупку, пройдя по всем пунктам. 
2. Убедитесь, что товар отображается в Order history.

Technology stack
- Programming language – Java
- Build and project management tool – Maven
- Testing framework – TestNG or Junit
- Browser Automation – Selenium WebDriver (can use some wrapper – Cucumber, Selenide, etc.)
- Reporting – Allure framework

Tasks
- Automate 7 test cases, which are described in section Test Cases
- Write 4-5 test cases by yourself and automated them. Test Cases should be documented (doc/docx or xls/xlsx)
- You should use Page Object (Page Factory) pattern for your project
- Use Allure reporting for test project
- Project should be placed on GitHub or Bitbucket
- Tests should work in Chrome and Firefox
- *Add switch in your code to run tests locally or using Selenium Grid (user can give params through maven – url, port)
- *Install Jenkins and run your tests using CI+Selenium Grid

