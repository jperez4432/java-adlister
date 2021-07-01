<%--
  Created by IntelliJ IDEA.
  User: juanperez
  Date: 7/1/21
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>Welcome! Please create your desired pizza</h1>

<form action="${pageContext.request.contextPath}/pizza-order" method="post" id="pizza">
    <label for="crust">Choose a crust</label>
    <select name="crust">
        <option value="thin">Thin</option>
        <option value="hand">Hand Tossed</option>
        <option value="stuffed">Stuffed Crust</option>
        <input type="submit" name="crust" id="crust">
    </select>

    <label for="sauce">Choose a Sauce</label>
    <select name="sauce">
        <option value="tomato">Tomato Sauce</option>
        <option value="marinara">Marinara Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
        <input type="submit" name="sauce" id="sauce">
    </select>

    <label for="size">Choose a Size</label>
    <select name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
        <option value="xlarge">X-Large</option>
        <input type="submit" name="size" id="size">
    </select>

        <label >Select Your Toppings</label>
        <input name="toppings" type="checkbox" id="pepperoni" value="pepperoni">
        <label for="pepperoni">Pepperoni</label>
        <input name="toppings" type="checkbox" id="sausage"  value="sausage">
        <label for="sausage">Sausage</label>
        <input name="toppings" type="checkbox" id="bacon"  value="bacon">
        <label for="bacon">Bacon</label>
        <input name="toppings" type="checkbox" id="chicken" value="chicken">
        <label for="chicken">Chicken</label>

    <input name="address" id="address" placeholder="Enter delivery address">
    <input type="submit">
</form>
</body>
</html>
