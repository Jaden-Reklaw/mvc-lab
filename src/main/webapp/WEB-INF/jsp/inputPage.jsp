<!DOCTYPE html>
<html>
<head>
    <title>MVC-Lab</title>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="d-flex justify-content-center">
    <%-- input is connected to the Controller that connect the model to the view --%>
    <form:form modelAttribute="input" action="/input" method="post" cssClass="form-horizontal" class="justify-content-center">
        <fieldset>

            <LEGEND>MVC LAB INPUT</LEGEND><hr />

                <%-- Text Input --%>
            <div class="form-group">
                <h3>Text:</h3>
                <form:input path="text" type="text" class="form-control" placeholder="Text Goes Here" />
            </div>

                <%-- Password Input --%>
            <div class="form-group">
                <h3>Password:</h3>
                <form:password path="password" class="form-control" placeholder="Enter password" />
            </div>

                <%-- CheckBox Input --%>
            <div class="form-group">
                <h3>Checkboxes:</h3>
                <div class="checkbox">
                    <label class="checkbox-inline"><form:checkbox path="checkbox1"  value="Check Box 1" />Checkbox 1</label>
                    <label class="checkbox-inline"><form:checkbox path="checkbox2"  value="Check Box 2" />Checkbox 2</label>
                    <label class="checkbox-inline"><form:checkbox path="checkbox3"  value="Check Box 3" />Checkbox 3</label>
                </div>
            </div>

                <%-- Textarea Input --%>
            <div class="form-group">
                <h3>Textarea:</h3>
                <form:textarea path="notes" class="form-control" rows="5" placeholder="Textarea"/>
            </div>

                <%-- Radio Input --%>
            <div class="form-group">
                <h3>Radios:</h3>
                <label><form:radiobutton path="radio" value="opt1" />Option 1</label>
                <label><form:radiobutton path="radio" value="opt2" />Option 2</label>
                <label><form:radiobutton path="radio" value="opt3" />Option 3</label>
            </div>

                <%-- Select 1 Input --%>
            <div class="form-group">
                <label>Select list (select one):</label>
                <form:select path="color" class="form-control">
                    <form:option value="Blue"/>
                    <form:option value="Green"/>
                    <form:option value="Red"/>
                    <form:option value="Yellow"/>
                </form:select>
            </div>

                <%-- Select 2 Input --%>
            <div class="form-group">
                <label>Multiple select list (hold ctrl to select more than one):</label>
                <form:select path="selectList" multiple="true" class="form-control">
                    <form:option value="Cat"/>
                    <form:option value="Dog"/>
                    <form:option value="Bird"/>
                    <form:option value="Rabbit"/>
                    <form:option value="Turtle"/>
                </form:select>
            </div>

                <%-- Form Buttons --%>
            <div class="form-group">
                <input type="reset" value="Cancel" class="rounded border border-dark">
                <input type="submit" value="Save" class="bg-primary text-white rounded border border-dark">
            </div>

        </fieldset>
    </form:form>
</div>
</body>
</html>