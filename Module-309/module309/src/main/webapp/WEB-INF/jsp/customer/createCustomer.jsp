<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-header pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">Create Customer</h1>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form>
            <div class="mb-3 row justify-content-center">
                <label for="companyNameId" class="col-sm-2 col-form-label">Company Name</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="companyNameId" name="companyName" value="">
                </div>
            </div>
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
                <label for="phoneId" class="col-sm-2 col-form-label">Phone</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="phoneId" name="phone" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="addressLine1Id" class="col-sm-2 col-form-label">Address Line 1</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="addressLine1Id" name="addressLine1" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="cityId" class="col-sm-2 col-form-label">City</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="cityId" name="city" value="">
                </div>
            </div>
            <div class="mb-3 row justify-content-center">
                <label for="countryId" class="col-sm-2 col-form-label">Country</label>
                <div class="col-sm-10 col-lg-6">
                    <input type="text" class="form-control" id="countryId" name="country" value="">
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
