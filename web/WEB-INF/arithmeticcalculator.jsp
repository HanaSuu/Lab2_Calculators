<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="" method="post">
            <div>
                <label for="firstInput">First:</label>
                <input type="number" name="firstInput" id="firstInput" value="${firstInput}">
            </div>
            
            <div>
                <label for="secondInput" >Second:</label>
                <input type="number" name="secondInput" id="secondInput" value="${secondInput}">
            </div>
            
            <div>
                <button type="submit" id="plus" value="+" name="operator">+</button>
                <button type="submit" id="subtract" value="-" name="operator">-</button>
                <button type="submit" id="multiple" value="*" name="operator">*</button>
                <button type="submit" id="remainder" value="%" name="operator">%</button>
            </div><br>
            
            <div>Result:${result}</div>      
        </form>
       
        <div> <a href="/Calculators/age">Age Calculator</div>
    </body>
</html>
