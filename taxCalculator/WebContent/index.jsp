<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Home</title>
</head>
<body>
	<h2>Tax Calculation</h2>
				
  <div>
    <div class="row">
      <div class="col-md-6 offset-md-3">
      
        <form action="CalculatorServlet" method="post">
	          <div class="form-row">
	            <label class="col-sm-8 col-form-label">Which tax year would you like to calculate?</label>
	            <div class="col-sm-4">
	              <select class="form-control form-control-sm" name="year">
	                <option value="2017">2017</option>
	                <option value="2018">2018</option>
	              </select>
	            </div>
	          </div>

          <div class="form-row">
            <label class="col-sm-8 col-form-label">What is your total salary before deductions? </label>
            <div class="col-sm-4">
              <div class="input-group-prepend">
                <div class="input-group-text">R</div>
              <input type="number" class="form-control" name="salary" placeholder="Salary">
              </div>
            </div>
          </div>

		          <div class="form-row">
		            <label class="col-sm-8 col-form-label">How often do you receive this salary? </label>
		            <div class="col-sm-4">
		              <select class="form-control form-control-sm" name="period">
		                <option value="Monthly" >Monthly</option>
		                <option value="Annual" >Annual</option>
		              </select>
		            </div>
		          </div>

		         <div class="form-row">
		            <label class="col-sm-8 col-form-label">Your age?</label>
		            <div class="col-sm-4">
		              <input type="number" class="form-control" name="age" placeholder="age">
		            </div>
		          </div>

		           <div class="form-row">
		            <label class="col-sm-8 col-form-label">Number of medical aid dependent(s):</label>
		            <div class="col-sm-4">
		              <input type="number" class="form-control" name="dependents" placeholder="No. of Dependents">
		            </div>
		          </div>
 		<br>
	           <div class="form-row">
	             <div class="col">
	             <button class="btn btn-primary btn-block" name="calculateTax">Submit</button>
	             </div>
	           </div>
	
	        </form>
	
	      </div>
	    </div>
	  </div>
</body>
</html>