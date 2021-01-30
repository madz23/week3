module week3.app.main {
    requires javafx.controls;
    requires com.google.common;
    requires com.google.gson;
    exports week3;
    opens week3 to com.google.gson;
}