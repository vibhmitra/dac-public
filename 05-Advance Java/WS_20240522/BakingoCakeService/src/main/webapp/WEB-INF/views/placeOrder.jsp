<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cake Form</title>
 <style>
 
#wrap{
	width:400px;
	margin:0 auto;
	text-align:left;
	margin-top:8px;
	padding:5px;
	background:#fff;
    font-family:AvenirLTStd, Arial, Helvetica, sans-serif;
	font-size:13px;    
    line-height:16px;
}
#wrap .cont_details fieldset,.cont_order fieldset{
	margin:10px;
	padding:10px;
    -moz-border-radius: 10px;
    -webkit-border-radius: 10px;
    -khtml-border-radius: 10px;
    border-radius: 10px;
}
#wrap legend{
	font-size:16px;
	font-family:Georgia, "Times New Roman", Times, serif;
	color:#000;
	font-weight:bold;
	font-style:italic;
    padding-bottom:8px;
}
#wrap .cont_details input{
	margin-bottom:8px;
	color:#000;
}
#wrap .input1:hover,.input1:active{
	
}
#wrap label{
	display:block;
	font-size:12px;
	color:#000;
    font-weight:bold;
}
#wrap label.inlinelabel
{
    display:inline;
}
#wrap .cont_order input{
	margin-bottom:3px;
}
#wrap .cont_order p{
	padding-top:5px;
}

#wrap input[type="radio"]
{
margin-top:8px;
margin-bottom:8px;
}

#wrap input[type="text"]:hover,
#wrap input[type="text"]:active {
background-color: #FAF398;
}

#wrap input#submit
{
margin:10px;
padding-left:20px;
padding-right:20px;
padding-top:10px;
padding-bottom:10px;
}



#wrap label.radiolabel
{
font-weight:normal;
 display:inline;
}

.error {
	color: red;
}
 </style>
    
</head>
<body>
    <div id="wrap">
        <sf:form action="orderStatus" name='form' modelAttribute="cake" method="POST">
       
            <div class="cont_order">
               <fieldset>
                <legend>Make your cake!</legend>
                
                <label>Size Of the Cake</label> <br/>
                
                <sf:radiobutton path="selectedcake" id="selectedcake1" value="10"/>
                <label class='radiolabel' for="selectedcake1">Round cake 6" - serves 8 people ($10)</label> <br/>
                
                <sf:radiobutton path="selectedcake" id="selectedcake2" value="15" />
                <label class='radiolabel' for="selectedcake2">Round cake 8" - serves 12 people ($15)</label> <br/>
                
                <sf:radiobutton path="selectedcake" id="selectedcake3" value="25" />
                <label class='radiolabel' for="selectedcake3">Round cake 10" - serves 16 people($25)</label> <br/>
                
                <sf:radiobutton path="selectedcake" id="selectedcake4" value="30" />
                <label class='radiolabel' for="selectedcake4">Round cake 12" - serves 30 people($30)</label> <br/>
               <span class='error'> <sf:errors path="selectedcake" /></span>
                
                <br/>
                <label>Filling Flavor</label>
         		<sf:select path="flavor" id="flavor" items="${flavorList}" />
                
                <p> 
                	<label for='includeCandles' class="inlinelabel">Include Candles($5)</label>
              		<sf:checkbox path="includeCandles" id="includecandles" value="5" />
                </p>
                <p>
                	<label class="inlinelabel" for='includeinscription'>Include Inscription($5)</label>
                	<sf:checkbox path="includeinscription" id="includeinscription" value="5" />
                	<sf:input path="theinscription" id="theinscription"  placeholder="Enter Inscription" />
                </p>
                </fieldset>
            </div>
              	<div class="cont_details">
            	<fieldset>
                <legend>Contact Details</legend>
                
                <label for='name'>Name</label>
                <sf:input path="name" id="name" />
                <span class='error'><sf:errors path="name" /></span>
                <br/>
                
                <label for='address'>Address</label>
                <sf:input path="address" id="address" />
               <span class='error'><sf:errors path="address" /></span> 
                <br/>
                
                <label for='phonenumber'>Phone Number</label>
                <sf:input path="phonenumber" id="phonenumber" />
                <span class="error"><sf:errors path="phonenumber" /></span>
                <br/>
                
                </fieldset>
                
            </div>
       		<input type="submit" value="Place Order" name="submit" />
       		
       </sf:form>
	</div><!--End of wrap-->

</body>

</html>