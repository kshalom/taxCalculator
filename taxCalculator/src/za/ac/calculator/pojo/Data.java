package za.ac.calculator.pojo;

import java.util.ArrayList;

public class Data 
{
	
	//private ArrayList<Double> taxAbleAmnts, incomeBases, taxRebates, taxThresholds;
	//private ArrayList<Integer> taxRates, taxYears;
	private int year;
	private ArrayList<Integer> taxRates, taxYears;
	private ArrayList<Double> taxAbleAmnts, incomeBases, taxRebates, taxThresholds;
	private TaxYear taxYear;
	
	public TaxYear taxYearData()
		
	{
		if(year == 2017) {
			
			this.year = 2017;
	        this.taxRates = new ArrayList<Integer>();
	        this.taxAbleAmnts = new ArrayList<Double>();
	        this.incomeBases = new ArrayList<Double>();
	        this.taxRebates = new ArrayList<Double>();
	        this.taxThresholds = new ArrayList<Double>();
	        this.taxYears = new ArrayList<Integer>();
	        
	        this.taxYears.add(2017);

	        this.taxRates.add(18);
	        this.taxRates.add(26);
	        this.taxRates.add(31);
	        this.taxRates.add(36);
	        this.taxRates.add(39);
	        this.taxRates.add(41);

	        this.taxAbleAmnts.add(0.0);
	        this.taxAbleAmnts.add(33840.0);
	        this.taxAbleAmnts.add(61296.0);
	        this.taxAbleAmnts.add(96264.0);
	        this.taxAbleAmnts.add(147996.0);
	        this.taxAbleAmnts.add(206964.0);

	        this.incomeBases.add(0.0);
	        this.incomeBases.add(188000.0);
	        this.incomeBases.add(293600.0);
	        this.incomeBases.add(406400.0);
	        this.incomeBases.add(550100.0);
	        this.incomeBases.add(701300.0);

	        this.taxRebates.add(13500.0);
	        this.taxRebates.add(7407.0);
	        this.taxRebates.add(2466.0);

	        this.taxThresholds.add(75000.0);
	        this.taxThresholds.add(116150.0);
	        this.taxThresholds.add(129850.0);
	        
	         taxYear= new TaxYear(year,taxRates , taxAbleAmnts, incomeBases, taxRebates, taxThresholds);
	        
		}else if(year == 2018){
			
			this.year = 2018;
	        this.taxRates = new ArrayList<Integer>();
	        this.taxAbleAmnts = new ArrayList<Double>();
	        this.incomeBases = new ArrayList<Double>();
	        this.taxRebates = new ArrayList<Double>();
	        this.taxThresholds = new ArrayList<Double>();
	        this.taxYears = new ArrayList<Integer>();
	        
	        this.taxYears.add(2018);

	        this.taxRates.add(18);
	        this.taxRates.add(26);
	        this.taxRates.add(31);
	        this.taxRates.add(36);
	        this.taxRates.add(39);
	        this.taxRates.add(41);
	        this.taxRates.add(45);

	        this.taxAbleAmnts.add(0.0);
	        this.taxAbleAmnts.add(34178.0);
	        this.taxAbleAmnts.add(61910.0);
	        this.taxAbleAmnts.add(97225.0);
	        this.taxAbleAmnts.add(149475.0);
	        this.taxAbleAmnts.add(209032.0);
	        this.taxAbleAmnts.add(533625.0);

	        this.incomeBases.add(0.0);
	        this.incomeBases.add(189880.0);
	        this.incomeBases.add(296540.0);
	        this.incomeBases.add(410460.0);
	        this.incomeBases.add(555600.0);
	        this.incomeBases.add(708310.0);
	        this.incomeBases.add(1500000.0);

	        this.taxRebates.add(13635.0);
	        this.taxRebates.add(7479.0);
	        this.taxRebates.add(2493.0);

	        this.taxThresholds.add(75750.0);
	        this.taxThresholds.add(117300.0);
	        this.taxThresholds.add(131150.0);
	        
	        taxYear = new TaxYear(year,taxRates , taxAbleAmnts, incomeBases, taxRebates, taxThresholds);
		}
		
		return taxYear;
	}
}
