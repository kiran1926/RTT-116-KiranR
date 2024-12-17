
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-header pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">New Employee</h1>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/employee/create-employee">
            <div class="mb-3 row justify-content-center">
                <label for="firstNameId" class="col-sm-2 col-form-label">First Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="firstNameId" name="firstName" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="lastNameId" class="col-sm-2 col-form-label">Last Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="lastNameId" name="lastName" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="emailId" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="emailId" name="email" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="jobTitleId" class="col-sm-2 col-form-label">Job Title</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="jobTitleId" name="jobTitle" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="extensionId" class="col-sm-2 col-form-label">Extension</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="extensionId" name="extension" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <div class="col-sm-12 col-lg-8">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>