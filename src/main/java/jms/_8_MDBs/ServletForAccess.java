package jms._8_MDBs;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class ServletForAccess extends HttpServlet {

    @EJB
    MessageProducer producer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = "Hello JavaEE from Servlet";
        producer.sendMessage(message);
        resp.getWriter().write("Published the message: " + message);
    }
}
