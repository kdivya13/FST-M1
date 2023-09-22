from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("Page title is: ", driver.title)
    driver.find_element(By.ID, "confirm").click()
    # Switch focus to the alert
    confirm_alert = driver.switch_to.alert
    # Print the text in the alert
    print(confirm_alert.text)
    # Close the alert with either one of the methods
    # with OK
    confirm_alert.accept()
    # with Cancel
    # confirm_alert.dismiss()