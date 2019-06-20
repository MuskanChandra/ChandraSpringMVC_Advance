<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Chandra Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information System</h2>
      <form:form method = "POST" action = "/ChandraSpringMVC/ProcessMineLogin">
         <table>
            <tr>
               <td><form:label path = "username">Name :</form:label></td>
               <td><form:input path = "username" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password :</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td><form:label path = "cm_password">Cm_Password :</form:label></td>
               <td><form:input path = "cm_password" /></td>
            </tr>
            <tr>
               <td colspan = "3">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>