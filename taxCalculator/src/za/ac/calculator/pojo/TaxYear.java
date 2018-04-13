package za.ac.calculator.pojo;


import java.util.ArrayList;


public class TaxYear 
{
	 private int year;
	    private ArrayList<Integer> taxRate;
	    private ArrayList<Double> taxableAmnt;
	    private ArrayList<Double> taxIncomeBase;
	    private ArrayList<Double> ageRangeTaxRebate;
	    private ArrayList<Double> ageRangeTaxThresholds;
	    private ArrayList<Integer> taxYears;
	    private TaxYear taxYear;

	    public TaxYear() {
	        super();
	    }

	    public TaxYear(int year, ArrayList<Integer> taxRate, ArrayList<Double> taxableAmnt, ArrayList<Double> taxIncomeBase, ArrayList<Double> ageRangeTaxRebate, ArrayList<Double> ageRangeTaxThresholds) {
	        super();
	        this.year = year;
	        this.taxRate = taxRate;
	        this.taxableAmnt = taxableAmnt;
	        this.taxIncomeBase = taxIncomeBase;
	        this.ageRangeTaxRebate = ageRangeTaxRebate;
	        this.ageRangeTaxThresholds = ageRangeTaxThresholds;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public ArrayList<Integer> getTaxRate() {
	        return taxRate;
	    }

	    public void setTaxRate(ArrayList<Integer> taxRate) {
	        this.taxRate = taxRate;
	    }

	    public ArrayList<Double> getTaxableAmnt() {
	        return taxableAmnt;
	    }

	    public void setTaxableAmnt(ArrayList<Double> taxableAmnt) {
	        this.taxableAmnt = taxableAmnt;
	    }

	    public ArrayList<Double> getTaxIncomeBase() {
	        return taxIncomeBase;
	    }

	    public void setTaxIncomeBase(ArrayList<Double> taxIncomeBase) {
	        this.taxIncomeBase = taxIncomeBase;
	    }

	    public ArrayList<Double> getAgeRangeTaxRebate() {
	        return ageRangeTaxRebate;
	    }

	    public void setAgeRangeTaxRebate(ArrayList<Double> ageRangeTaxRebate) {
	        this.ageRangeTaxRebate = ageRangeTaxRebate;
	    }

	    public ArrayList<Double> getAgeRangeTaxThresholds() {
	        return ageRangeTaxThresholds;
	    }

	    public void setAgeRangeTaxThresholds(ArrayList<Double> ageRangeTaxThresholds) {
	        this.ageRangeTaxThresholds = ageRangeTaxThresholds;
	    }

		public ArrayList<Integer> getTaxYears() {
			return taxYears;
		}

		public void setTaxYears(ArrayList<Integer> taxYears) {
			this.taxYears = taxYears;
		}
	
		public void add2017()
		{
			
			
			if(year == 2017) {
				
				this.year = 2017;
		        this.taxRate = new ArrayList<Integer>();
		        this.taxableAmnt = new ArrayList<Double>();
		        this.taxIncomeBase = new ArrayList<Double>();
		        this.ageRangeTaxRebate = new ArrayList<Double>();
		        this.ageRangeTaxThresholds = new ArrayList<Double>();
		        this.taxYears = new ArrayList<Integer>();
		        
		        this.taxYears.add(2017);

		        this.taxRate.add(18);
		        this.taxRate.add(26);
		        this.taxRate.add(31);
		        this.taxRate.add(36);
		        this.taxRate.add(39);
		        this.taxRate.add(41);

		        this.taxableAmnt.add(0.0);
		        this.taxableAmnt.add(33840.0);
		        this.taxableAmnt.add(61296.0);
		        this.taxableAmnt.add(96264.0);
		        this.taxableAmnt.add(147996.0);
		        this.taxableAmnt.add(206964.0);

		        this.taxIncomeBase.add(0.0);
		        this.taxIncomeBase.add(188000.0);
		        this.taxIncomeBase.add(293600.0);
		        this.taxIncomeBase.add(406400.0);
		        this.taxIncomeBase.add(550100.0);
		        this.taxIncomeBase.add(701300.0);

		        this.ageRangeTaxRebate.add(13500.0);
		        this.ageRangeTaxRebate.add(7407.0);
		        this.ageRangeTaxRebate.add(2466.0);

		        this.ageRangeTaxThresholds.add(75000.0);
		        this.ageRangeTaxThresholds.add(116150.0);
		        this.ageRangeTaxThresholds.add(129850.0);
		        
		        this.taxYear = new TaxYear(year,taxRate , taxableAmnt, taxIncomeBase, ageRangeTaxRebate, ageRangeTaxThresholds);
		        
			}else if(year == 2018){
				
				this.year = 2018;
		        this.taxRate = new ArrayList<Integer>();
		        this.taxableAmnt = new ArrayList<Double>();
		        this.taxIncomeBase = new ArrayList<Double>();
		        this.ageRangeTaxRebate = new ArrayList<Double>();
		        this.ageRangeTaxThresholds = new ArrayList<Double>();
		        this.taxYears = new ArrayList<Integer>();
		        
		        this.taxYears.add(2018);

		        this.taxRate.add(18);
		        this.taxRate.add(26);
		        this.taxRate.add(31);
		        this.taxRate.add(36);
		        this.taxRate.add(39);
		        this.taxRate.add(41);
		        this.taxRate.add(45);

		        this.taxableAmnt.add(0.0);
		        this.taxableAmnt.add(34178.0);
		        this.taxableAmnt.add(61910.0);
		        this.taxableAmnt.add(97225.0);
		        this.taxableAmnt.add(149475.0);
		        this.taxableAmnt.add(209032.0);
		        this.taxableAmnt.add(533625.0);

		        this.taxIncomeBase.add(0.0);
		        this.taxIncomeBase.add(189880.0);
		        this.taxIncomeBase.add(296540.0);
		        this.taxIncomeBase.add(410460.0);
		        this.taxIncomeBase.add(555600.0);
		        this.taxIncomeBase.add(708310.0);
		        this.taxIncomeBase.add(1500000.0);

		        this.ageRangeTaxRebate.add(13635.0);
		        this.ageRangeTaxRebate.add(7479.0);
		        this.ageRangeTaxRebate.add(2493.0);

		        this.ageRangeTaxThresholds.add(75750.0);
		        this.ageRangeTaxThresholds.add(117300.0);
		        this.ageRangeTaxThresholds.add(131150.0);
		        
		        this.taxYear = new TaxYear(year,taxRate , taxableAmnt, taxIncomeBase, ageRangeTaxRebate, ageRangeTaxThresholds);
			}
		}
}
