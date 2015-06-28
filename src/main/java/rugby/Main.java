package rugby;

import static spark.Spark.*;
import rugby.todo.TodoSvc;

public class Main {

    public static void main(String[] args) {

        externalStaticFileLocation("target/web/public/main");

        App.routes();

        TodoSvc.routes();

    }
}