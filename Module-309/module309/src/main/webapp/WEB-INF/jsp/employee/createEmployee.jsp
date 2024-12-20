
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-header pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">New Employee</h1>
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
        <form action="/employee/create-employee">
            <input type="hidden" name="id" value="${form.id}"/>
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
                <label for="emailId" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="emailId" name="email" value="${form.email}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('email')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('email')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="jobTitleId" class="col-sm-2 col-form-label">Job Title</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="jobTitleId" name="jobTitle" value="${form.jobTitle}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('jobTitle')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('jobTitle')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>


            <div class="mt-3 row justify-content-center">
                <label for="extensionId" class="col-sm-2 col-form-label">Extension</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="extensionId" name="extension" value="${form.extension}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('extension')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('extension')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="reportsToId" class="col-sm-2 col-form-label">Reports To</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="reportsToId" name="reportsTo" value="${form.reportsTo}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('reportsTo')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('reportsTo')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="vacationHoursId" class="col-sm-2 col-form-label">Vacation Hours</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="vacationHoursId" name="vacationHours" value="${form.vacationHours}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('vacationHours')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="profileImageUrlId" class="col-sm-2 col-form-label">Profile Image Url</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="file" class="form-control" id="profileImageUrlId" name="profileImageUrl" value="${form.profileImageUrl}">
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('profileImageUrl')}">
                <div class="row justify-content-center">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10 col-lg-6">
                        <c:forEach var="error" items="${bindingResult.getFieldErrors('profileImageUrl')}">
                            <dd class="mb-0 form-input-error">${error.getDefaultMessage()}</dd>
                        </c:forEach>
                    </div>
                </div>
            </c:if>

            <div class="mt-3 row justify-content-center">
                <label for="officeId" class="col-sm-2 col-form-label">Office</label>
                <div class="col-sm-10 col-lg-6">
                    <select  id="officeId" name="officeId" class="form-control">
                        <option></option>
                        <c:forEach var="office" items="${officesKey}">
                            <option value="${office.id}"
                                    <c:if test="${form.officeId eq office.id}">selected</c:if>
                            >${office.city}</option>
                        </c:forEach>
                    </select>
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