<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:include page="../include/header.jsp"/>
<%-- HTML for employee search  --%>
<section class="bg-header text-center mb-0 pt-3 pb-3">
    <h1>Employee Search</h1>
</section>
<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/employee/search" class="mb-0">
            <div class="row justify-content-center pt-3">
                <div class="col-6">
                    <div class="mb-3">
                        <label for="firstNameId" class="form-label">First Name</label>
                        <input type="text" class="form-control" id="firstNameId" name="firstName" value="${search}">
                    </div>
                </div>
            </div>
            <div class="row justify-content-center">
                <div class="col-6">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </div>
        </form>
    </div>
</section>

<%-- HTML for result list of employees --%>
<c:if test="${ not empty search}">
    <section class="bg-light2 pb-4 pt-4">
        <div class="container">
            <h1 class="text-center">Employees Found(${employeesKey.size()})</h1>

            <table class="table table-striped table-hover mt-5">
                <tr>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>id</th>
                    <th>Job Title</th>
                    <th>Reports To</th>
                    <th>Edit</th>
                </tr>
                <c:forEach var="employee" items="${employeesKey}">
                    <tr>
                        <td>${employee.firstname}</td>
                        <td>${employee.lastname}</td>
                        <td>${employee.id}</td>
                        <td>${employee.jobTitle}</td>
                        <td>${employee.reportsTo}</td>
                        <td><a href="/employee/search/${employee.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</c:if>
<jsp:include page="../include/footer.jsp"/>