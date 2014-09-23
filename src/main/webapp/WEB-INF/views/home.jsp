<%-- 
    Document   : home
    Created on : 05 Sep 2014, 12:16:29 PM
    Author     : Eusuph
--%>

<?xml version='1.0' encoding='UTF-8' ?>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  
    <head>
        <style type="text/css"> 
       .centerDiv 
    { 
        width: 70%;
        height:450px; 
        margin: 0 auto;
        background-color:whitesmoke ; 
        border-top-left-radius:15px;
        border-top-right-radius:15px;
        border-bottom-left-radius:15px; 
        border-bottom-right-radius:15px;
    } </style> 
        
<style>
  body {background-color:lightgrey}
  h1   {color:black}
</style>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="well well-lg">
           <center> <ceiling><button class="btn btn-success" ng-click="('new')">
            <span class="glyphicon glyphicon-user"></span> Home
        </button>
            
        <ceiling><button class="btn btn-success" ng-click="addUser('new')">
            <span class="glyphicon glyphicon-user"></span> Register Patient
        </button>
                 
                 
  
           <button 
                type="button" class="btn btn-success">Dash Board
            </button>
   
            
            
          <ceiling>
            <button 
                type="button" class="btn btn-success">Success
            </button>
        
            
            
        <ceiling>
            <button type="button" class="btn btn-success" value="saveUser">Successful</button>
        </center>
        </div>
       
        
        
        <div class="centerDiv"> 
           <div id="slideshow">

<%-- 
       <ul class="slides">
        <li><img src="<c:url value='/Doctor.jpg'/>" width="620" height="320" alt=" Yho" /></li>
        <li><img src="\doc1.jpg" width="620" height="320" alt=" Beach" /></li>
        <li><img src="\doc2.jpg" width="620" height="320" alt="Station" /></li>
        <li><img src="\doc3.jpg" width="620" height="320" alt="Nature" /></li>
    </ul>
--%> 

    <span class="arrow previous"></span>
    <span class="arrow next"></span>
</div>
        </div>
       
    </body>
</html>
