package ca.sait.calculator.servlets;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Xin Su
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response); 
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstInput = request.getParameter("firstInput");
        String secondInput = request.getParameter("secondInput");
        String operator = request.getParameter("operator");

            try {
                int number1 = Integer.parseInt(firstInput);
                int number2 = Integer.parseInt(secondInput);

                if(operator.equals("+"))
                {
                    request.setAttribute("result", number1 + number2);
                }
                if(operator.equals("-"))
                {
                    request.setAttribute("result", number1 - number2);
                }
                if(operator.equals("*"))
                {
                    request.setAttribute("result", number1 * number2);
                }
                if(operator.equals("%"))
                {
                    request.setAttribute("result", number1 % number2);
                }
            } catch (Exception ex)
            {
                request.setAttribute("result","invalid");
            }
                      
        request.setAttribute("firstInput", firstInput);
        request.setAttribute("secondInput", secondInput);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);    
    }
}
