package za.ac.calculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xpath.internal.operations.Number;

import za.ac.calculator.pojo.Data;
import za.ac.calculator.pojo.TaxYear;
import za.ac.calculator.service.TaxService;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CalculatorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.getRequestDispatcher("view.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//getServletContext().getRequestDispatcher("/view.jsp").forward(request, response);
	}
		//Not complete
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		 int year=0;
		 ArrayList<Double> taxAbleAmnts, incomeBases, taxRebates, taxThresholds;
		 ArrayList<Integer> taxRates;
		 TaxYear taxYear;
			
						 		
		 		year = 2017;
				taxRates = new ArrayList<Integer>();
		        taxAbleAmnts = new ArrayList<Double>();
		        incomeBases = new ArrayList<Double>();
		        taxRebates = new ArrayList<Double>();
		        taxThresholds = new ArrayList<Double>();

		        taxRates.add(18);
		        taxRates.add(26);
		        taxRates.add(31);
		        taxRates.add(36);
		        taxRates.add(39);
		        taxRates.add(41);

		        taxAbleAmnts.add(0.0);
		        taxAbleAmnts.add(33840.0);
		        taxAbleAmnts.add(61296.0);
		        taxAbleAmnts.add(96264.0);
		        taxAbleAmnts.add(147996.0);
		        taxAbleAmnts.add(206964.0);

		        incomeBases.add(0.0);
		        incomeBases.add(188000.0);
		        incomeBases.add(293600.0);
		        incomeBases.add(406400.0);
		        incomeBases.add(550100.0);
		        incomeBases.add(701300.0);

		        taxRebates.add(13500.0);
		        taxRebates.add(7407.0);
		        taxRebates.add(2466.0);

		        taxThresholds.add(75000.0);
		        taxThresholds.add(116150.0);
		        taxThresholds.add(129850.0);
		        
		       
		       
		    taxYear = new TaxYear(year,taxRates , taxAbleAmnts, incomeBases, taxRebates, taxThresholds);
		    
		    int inputYear= Integer.parseInt(request.getParameter("year"));
			double salary = Double.parseDouble(request.getParameter("salary"));
			String period = request.getParameter("period");
			int age = Integer.parseInt(request.getParameter("age"));
			int dependents = Integer.parseInt(request.getParameter("dependents"));
		        	
			ArrayList<TaxYear> indexYear = new ArrayList<TaxYear>();
			indexYear.add(taxYear);
			
			TaxService service = new TaxService();
			int index = service.getYearIndex(inputYear,indexYear);
			
			double monthlyTax = service.calculateTax(salary, year, age, indexYear, period);
			double net = service.netAmount(salary,inputYear, age, indexYear, period);
			int taxRate = service.taxRates(salary, index,indexYear,period);
			double incomebase = service.incomeBase(salary, index, indexYear,period);
			double taxable = service.taxableAmount(salary, index,indexYear, period);
			System.out.println("");
			
			System.out.println(index);
			System.out.println( monthlyTax);
			System.out.println( net);
			System.out.println( taxRate);
			System.out.println( incomebase);
			System.out.println(taxable);
		
	}
	
	
	

}
