<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>IMDB</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery-func.js"></script>
<link rel="stylesheet" href="src/css/ie6.css" type="text/css" media="all" />
</head>
<body>
<!-- START PAGE SOURCE -->
<div id="shell">
  <div id="header">
    <h1 id="logo"><a href="#"><img src="css/images/logo.png"/></a></h1>
    <div class="social"> <span>FOLLOW US ON:</span>
      <ul>
        <li><a class="twitter" href="#">twitter</a></li>
        <li><a class="facebook" href="#">facebook</a></li>
        <li><a class="vimeo" href="#">vimeo</a></li>
        <li><a class="rss" href="#">rss</a></li>
      </ul>
    </div>
    <div id="navigation">
      <ul>
        <li><a class="active" href="#">HOME</a></li>
        <% if(session.getAttribute("user")==null){
        	%>
        
       <li><a href="Register.jsp">SignUp</a></li>
        <li><a href="Login.jsp">LOGIN</a></li>
        <% } else { %>
         <li><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       <li><a href="Logout">LOGOUT</a></li>
      
       <%} %>
        <li><a href="#">CONTACT</a></li>
      
      </ul>
    </div>
    
    <div id="sub-navigation">
      
      
    </div>
  </div>
  <div id="main">
    <div id="content">
      <div class="box">
        <div class="head">
          <h2>LATEST TRAILERS</h2>
          <p class="text-right"><a href="#">See all</a></p>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">BAHUBALI</span></span> <a href="Bahubali.jsp"><img src="css/images/bahuu.jpg" alt="" /></a> </div>
          <div class="rating">
          
            
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">DDLJ</span></span> <a href="Ddlj.jsp"><img src="css/images/download.jpg" alt="" /></a> </div>
          <div class="rating">
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">DHAMAAL</span></span> <a href="Dhamaal.jsp"><img src="css/images/dhamaal.jpg" alt="" /></a> </div>
          <div class="rating">
          

            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">DARLING</span></span> <a href="Darling.jsp"><img src="css/images/darl.jpg" alt="" /></a> </div>
          <div class="rating">
         

            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">KRISH</span></span> <a href="Krish.jsp"><img src="css/images/krish.jpg" alt="" /></a> </div>
          <div class="rating">
          
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie last">
          <div class="movie-image"> <span class="play"><span class="name">KGF</span></span> <a href="Kgf.jsp"><img src="css/images/kgf.jpg" alt="" /></a> </div>
          <div class="rating">
          
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="cl">&nbsp;</div>
      </div>
      <div class="box">
        <div class="head">
          <h2>TOP RATED</h2>
          <p class="text-right"><a href="#">See all</a></p>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">DHOOM</span></span> <a href="Dhoom.jsp"><img src="css/images/dhoom.jpg" alt="" /></a> </div>
          <div class="rating">
         
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">ANDHADHUN</span></span> <a href="Andhadhun.jsp"><img src="css/images/andha.jpg" alt="" /></a> </div>
          <div class="rating">
            
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">ANNABELLE</span></span> <a href="Annabelle.jsp"><img src="css/images/anna.jpg" alt="" /></a> </div>
          <div class="rating">
          
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">CONJURING</span></span> <a href="Conjuring.jsp"><img src="css/images/conj.jpg" alt="" /></a> </div>
          <div class="rating">
            
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie">
          <div class="movie-image"> <span class="play"><span class="name">RAHASYA</span></span> <a href="Rahasya.jsp"><img src="css/images/rahasya.jpg" alt="" /></a> </div>
          <div class="rating">
           
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="movie last">
          <div class="movie-image"> <span class="play"><span class="name">ANGELS &amp; DEMONS</span></span> <a href="Angels.jsp"><img src="css/images/angels.jpg" alt="" /></a> </div>
          <div class="rating">
            <p>RATING</p>
            <div class="stars">
              <div class="stars-in"> </div>
            </div>
            <span class="comments">12</span> </div>
        </div>
        <div class="cl">&nbsp;</div>
      </div>
      </div>
      </div>
      </div>
</body>
</html>