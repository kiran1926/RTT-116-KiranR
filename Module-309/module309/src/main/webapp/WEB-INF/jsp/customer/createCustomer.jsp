<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-body pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">Create Customer</h1>
        </div>
    </div>
</section>
<style>
    .form-input-error{
        color: red;
    }
</style>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/customer/create-customer" METHOD="POST" enctype="multipart/form-data">
            <input type="hidden" name="id" value="${form.id}"/>
            <div class="mt-3 row justify-content-center">
                <label for="companyNameId" class="col-sm-2 col-form-label">Company Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="companyNameId" name="companyName" value="${form.companyName}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('companyName')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('companyName')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="firstNameId" class="col-sm-2 col-form-label">First Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="firstNameId" name="firstName" value="${form.firstName}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('firstName')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('firstName')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="lastNameId" class="col-sm-2 col-form-label">Last Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="lastNameId" name="lastName" value="${form.lastName}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('lastName')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('lastName')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="phoneId" class="col-sm-2 col-form-label">Phone</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="phoneId" name="phone" value="${form.phone}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('phone')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('phone')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="addressLine1Id" class="col-sm-2 col-form-label">Address Line 1</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="addressLine1Id" name="addressLine1" value="${form.addressLine1}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('addressLine1')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('addressLine1')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="cityId" class="col-sm-2 col-form-label">City</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="cityId" name="city" value="${form.city}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('city')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('city')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="countryId" class="col-sm-2 col-form-label">Country</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="countryId" name="country" value="${form.country}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('country')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('country')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="employeeId" class="col-sm-2 col-form-label">Employee</label>
                <div class="col-sm-10 col-lg-6">
                    <select  id="employeeId" name="employeeId" class="form-control">
                        <option></option>
                        <c:forEach var="employee" items="${employeesKey}">
                            <option value="${employee.id}"
                                    <c:if test="${form.employeeId eq employee.id}">selected</c:if>
                            >${employee.firstname} ${employee.lastname}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>


            <div class="mt-3 row justify-content-center">
                <label for="upload" class="col-sm-2 col-form-label">Upload Image</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="file" class="form-control" id="upload" name="upload">
                </div>
            </div>


            <div class="mt-3 row justify-content-center">
                <div class="col-sm-12 col-lg-8">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </div>
</section>


<jsp:include page="../include/footer.jsp"/>
