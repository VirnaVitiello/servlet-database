package srv;

import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticoloDao;
import model.Articolo;

public class ArticoloSrv extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ArticoloSrv() {
		super();
		//TODO Auto-generated constructor stub 
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		ArticoloDao  aDao= new ArticoloDao();
		String descrizione= request.getParameter("descrizione");
		String quantita1= request.getParameter("quantita");
		int quantita= Integer.parseInt(quantita1);
		
		
		Articolo a = new Articolo();
		a.setDescrizione(descrizione);
		a.setQuantita(quantita);
		
		aDao.insert(a);
		
		
	}
	
}
