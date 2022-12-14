package Common;

import org.openqa.selenium.WebDriver;

import java.time.format.DateTimeFormatter;

public class Constant {
    public static WebDriver DRIVER;
    public static final String FIREFOX_DRIVER_KEY = "webdriver.gecko.driver";
    public static final String FIREFOX_DRIVER = "src/main/resources/Executables/geckodriver.exe";
    public static final String WEB_DRIVER_KEY = "webdriver.chrome.driver";
    public static final String PATH_DRIVER_DIRECTION = "src/main/resources/Executables/chromedriver.exe";
    public static final String PATH_EXCEL = "src/test/resources/Book1.xlsx";
    public static final String SHEET_LOGIN = "login";
    public static final String SHEET_REGISTER = "register";
    public static final String SHEET_BOOK_TICKET = "bookTicket";
    public static final String RAILWAY_URL = "http://www.railwayb2.somee.com/Page/HomePage.cshtml";
    public static final String TAB_LOGIN = "Login";
    public static final String TAB_LOGOUT = "Log out";
    public static final String TAB_BOOK_TICKET = "Book ticket";
    public static final String TAB_CONTACT = "Contact";
    public static final String TAB_REGISTER = "Register";
    public static final String TAB_CHANGE_PASSWORD = "Change password";
    public static final String TAB_TIMETABLE = "Timetable";
    public static final String TAB_TICKET_PRICE = "Ticket price";
    public static final String TAB_MY_TICKET = "My ticket";
    public static final String SERVER_ERROR = "Server Error";
    public static final String TITLE_TABLE_CHECK_PRICE = "Ticket price from Sài Gòn to Huế";
    public static final String MSG_CONTENT_OF_BOOK_TICKET_PAGE = "Book ticket";
    public static final String MSG_CONTENT_OF_TICKET_PRICE_PAGE = "Ticket Price";
    public static final int NUMBER_OF_LOGIN = 4;

    public static final String EMAIL = "nhi12@gmail.com";
    public static final String EMAIL_UN_EXITING = "n@gmail.com";
    public static final String PASSWORD = "12345678";
    public static final String MSG_WELCOME_USER = "Welcome %s";
    public static final String INVALID_PASSWORD = "1";
    public static final String MSG_PROBLEM_WITH_LOGIN = "There was a problem with your login and/or errors exist in your form.";
    public static final String MSG_INVALID_USERNAME_PASSWORD = "Invalid username or password. Please try again.";
    public static final String MSG_RUN_OUT_OF_TRY_LOGIN = "Invalid username or password. Please try again.";
    public static final String EMAIL_REGISTER = "nhi1912@gmail.com";
    public static final String CONFIRM_PASSWORD = "12345678";
    public static final String CONFIRM_INVALID_PASSWORD = "123456789";
    public static final String PID = "12345678";
    public static final String MSG_REGISTER_SUCCESSFULLY = "You're here";
    public static final String MSG_REGISTER_FAILED = "There're errors in the form. Please correct the errors and try again.";
    public static final String MSG_REGISTER_FAILED_EMAIL_USED = "This email address is already in use.";
    public static final String MSG_PASSWORD_FIELD = "Invalid password length";
    public static final String MSG_PID_FIELD = "Invalid ID length";
    public static final String MSG_CHANGE_PASSWORD_SUCCESS = "Your password has been updated!";
    public static final String MSG_CHANGE_PASSWORD_INVALID_PASSWORD = "Invalid current password.";
    public static final String MSG_CHANGE_PASSWORD_INVALID_NEW_PASSWORD = "Invalid new password.";
    public static final String MSG_CHANGE_PASSWORD_FIELD_PASSWORD_NO_MATCH = "The password confirmation does not match the new password.";
    public static final String VALID_DEPART_DATE = Utilities.getDate();
    public static final String VALID_DEPART_FROM = "Huế";
    public static final String VALID_ARRIVE_AT = "Sài Gòn";
    public static final String VALID_SEAT = "Soft seat";
    public static final int VALID_AMOUNT_TICKET = 1;
    public static final int MORE_AMOUNT_TICKET = 5;
    public static final int MAX_AMOUNT_TICKET = 10;
    public static final String SUCCESSFULLY_TITLE = "Ticket Booked Successfully!";
    public static final String ERROR_MESSAGE_WHEN_BOOK_10_TICKET = "You have booked 10 tickets. You can book no more.";
    public static final String DEPART_FROM = "Sài Gòn";
    public static final String ARRIVE_AT = "Huế";
    public static final String SEAT_TYPE = "HS:";
    public static final int PRICE_OF_HS = 460000;
    public static final int PRICE_OF_SS = 485000;
    public static final int PRICE_OF_SSC = 510000;
    public static final int PRICE_OF_HB = 560000;
    public static final int PRICE_OF_SB = 610000;
    public static final int PRICE_OF_SBC = 660000;
    public static final String EMAIL_DRESS_HREF = "mailto:thanh.viet.le@logigear.com";
    public static final String ERROR_MSG_FORGOT_PASSWORD_UN_EXITING="This email address doesn't exist.";
    public static final String ERROR_MSG_INVALID_DATE = "The date format is wrong, date filter is ignored.\n" +
            "Example of a proper date: Today is " + java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("M/d/yyyy"));

}