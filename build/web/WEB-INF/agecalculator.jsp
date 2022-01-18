<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="" method="post">
            <label for="age">Enter your age:</label>
            <input type="number" name="age" id="age">

            <button type="submit">Age next birthday</button>
        </form>
        
        <p>${message}</p>
        <div> <a href="/Calculators/arithmetic">Arithmetic Calculator</div>
    </body>
</html>
