@WebServlet("/Controller")
public class Controller extends HttpServlet {

 private Facade facade = new Facade();
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 try {
 String action=request.getParameter("action");
 if (action.equals("consulter")) {
 int num=Integer.parseInt(request.getParameter("num"));
 request.setAttribute("num", num);
 request.setAttribute("compte", facade.consulterCompte(num));
 }
 if (action.equals("consultertous")) {
 request.setAttribute("comptes", facade.consulterComptes());
 }

if ((action.equals("debit")) || (action.equals("credit"))) {
    int num=Integer.parseInt(request.getParameter("num"));
    int montant=Integer.parseInt(request.getParameter("montant"));
    request.setAttribute("num", num);
    if (action.equals("debit")) facade.debit(num, montant);
    else facade.credit(num, montant);
    request.setAttribute("num", null);
    }
    } catch (Exception ex) {
    request.setAttribute("exception", ex.getMessage());
    }
    request.getRequestDispatcher("Banque.jsp").forward(request, response);
   }
   }