package pt.biblioescola;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/estado")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws IOException {

        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().println("Hello World! BiblioEscola funcionando!");
    }
}
