package za.ac.calculator.service;
import java.util.ArrayList;

import za.ac.calculator.pojo.*;

public class TaxService {
	
	 private static int AGE_CLASS_ONE = 65;
	 private static int AGE_CLASS_TWO = 75;


	    public TaxService() {

	    }
	   
	    public double calculateTax(double salary, int year, int age, ArrayList<TaxYear> years, String period){

	        double monthlyTax = 0.0;

	        if(period.equals("Monthly")){ 
	        	 
	            salary = salary * 12;
	        }
	        
	        System.out.println(salary + " salary after if statement on monthly tax");
	        
	        int indexYear = this.getYearIndex(year, years);

	        double tax = this.taxBracket(salary,indexYear, years,period);
	        
	        System.out.println(tax + " tax bracket after if statement on monthly tax");
	        

	        double rebate = this.calculateRebate(age, indexYear, years);

	        monthlyTax = (tax - rebate) / 12;

	        return monthlyTax;

	    }	    
	    
	    public double netAmount(double salary,int year,int age,ArrayList<TaxYear> years,String period)
	    {
	    	double amount = 0.0;
	    	 
	    	 double monthlyTax = calculateTax(salary, year, age, years, period);
	    	 
	    	 if(period.equals("Annual"))
	    	 {
	    		 salary = salary / 12;
	    	 }
	    	
	    	amount = (salary - monthlyTax);
	    	
	    	return amount;
	    }
	    
	    
	    public double taxBracket(double salary, int indexYear, ArrayList<TaxYear> years,String period){
	        double totalTaxBracket = 0.00;
	        
	        System.out.println(salary + " salary after if statement on main tax bracket");
	        double taxableAmnt = 0.0;
	        double incomeBase = 0.0;
	        int taxRate = 0;
	        

	        boolean found = false;
	        int index = 0;

	        while(!found){

	            try{
	                if (salary < years.get(indexYear).getTaxIncomeBase().get(index + 1)){
	                    taxRate = years.get(indexYear).getTaxRate().get(index);
	                    taxableAmnt = years.get(indexYear).getTaxableAmnt().get(index);
	                    incomeBase = years.get(indexYear).getTaxIncomeBase().get(index);
	                    found = true;
	                }
	            }catch (Exception ex){

	            }

	            index += 1;
	            int length = years.get(indexYear).getTaxRate().size();

	            if(index > length) {
	                taxRate = years.get(indexYear).getTaxRate().get(length - 1);
	                taxableAmnt = years.get(indexYear).getTaxableAmnt().get(length - 1);
	                incomeBase = years.get(indexYear).getTaxIncomeBase().get(length - 1);
	                found = true;
	            }

	        }
	        
	        System.out.println(salary + incomeBase + taxRate + taxableAmnt);
	        totalTaxBracket = ((salary - incomeBase) * (taxRate / 100)) + taxableAmnt;

	        return totalTaxBracket;
	    }
	   
	    
public double taxableAmount(double salary, int indexYear, ArrayList<TaxYear> years,String period){
	 
			 if(period.equals("Monthly")){ 
		    	 
		         salary = salary * 12;
		     }
	        double taxableAmnt = 0.00;
	       
	        System.out.println(salary + " salary after if statement on taxable");
	        
	        boolean found = false;
	        int index = 0;

	        while(!found){

	            try{
	                if (salary < years.get(indexYear).getTaxIncomeBase().get(index + 1)){
	                	taxableAmnt = years.get(indexYear).getTaxableAmnt().get(index);
	                    found = true;
	                }
	            }catch (Exception ex){

	            }

	            index += 1;
	            int length = years.get(indexYear).getTaxRate().size();

	            if(index > length) {
	               
	            	taxableAmnt = years.get(indexYear).getTaxableAmnt().get(length - 1);
	                found = true;
	            }
	        }
	        
	        System.out.println(taxableAmnt + " taxable amount");
	        
	            return taxableAmnt;

	        }
	    
	    
	    public double incomeBase(double salary, int indexYear, ArrayList<TaxYear> years,String period){
	 
	    	 if(period.equals("Monthly")){ 
	        	 
		            salary = salary * 12;
		        }
	        double incomeBase = 0.00;
	        
	        System.out.println(salary + " salary after if statement on incomebase");
	        
	        boolean found = false;
	        int index = 0;

	        while(!found){

	            try{
	                if (salary < years.get(indexYear).getTaxIncomeBase().get(index + 1)){
	                    incomeBase = years.get(indexYear).getTaxIncomeBase().get(index);
	                    found = true;
	                }
	            }catch (Exception ex){

	            }

	            index += 1;
	            int length = years.get(indexYear).getTaxRate().size();

	            if(index > length) {
	               
	                incomeBase = years.get(indexYear).getTaxIncomeBase().get(length - 1);
	                found = true;
	            }
	        }
	        	
	        System.out.println(incomeBase + " incomebase");
	            return incomeBase;

	        }
	    
	    public int taxRates(double salary, int indexYear, ArrayList<TaxYear> years,String period) {
	    	int taxRate = 0;
	    	
	    	 if(period.equals("Monthly")){ 
	        	 
		            salary = salary * 12;
		        }
	    	 
	    	System.out.println(salary + " salary after if statement on tax rates");
	        boolean found = false;
	        int index = 0;

	        while(!found){

	            try{
	                if (salary < years.get(indexYear).getTaxIncomeBase().get(index + 1)){
	                    taxRate = years.get(indexYear).getTaxRate().get(index);
	                    found = true;
	                }
	            }catch (Exception ex){
	            	
	            }

	            index += 1;
	            int length = years.get(indexYear).getTaxRate().size();

	            if(index > length) {
	                taxRate = years.get(indexYear).getTaxRate().get(length - 1);
	               
	                found = true;
	            }

	        }
	        
	        System.out.println(taxRate + " tax rate");
	        return taxRate;
	        
	    }

	    public int getYearIndex(int inputyear, ArrayList<TaxYear> years){
	        int index = 0;

	        for (int i = 0; i < years.size() ; i++) {
	            TaxYear year = years.get(i);

	            if(inputyear == year.getYear()){
	                index = i;
	                break;
	            }

	        }

	        return index;
	    }

	    public double calculateRebate(int age, int indexYear, ArrayList<TaxYear> years){
	        double rebateAmnt = 0.00;
	        int index = 0;

	        if(age < AGE_CLASS_ONE){
	            index = 0;
	        }else if(age > AGE_CLASS_ONE && age < AGE_CLASS_TWO){
	            index = 1;
	        }else if(age > AGE_CLASS_TWO){
	            index = 2;
	        }

	        rebateAmnt = years.get(indexYear).getAgeRangeTaxRebate().get(0);

	        if(index > 0){
	            rebateAmnt += years.get(indexYear).getAgeRangeTaxRebate().get(index);
	        }

	        return rebateAmnt;
	    }
	    
	    
	    

}
