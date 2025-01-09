<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-header pt-5 pb-5">
    <div class="container">
        <div class="row">
            <h1 class="m-0 text-center">Ajax Example</h1>
        </div>
    </div>
</section>

<script>
    $(document).ready(function(){
        $('#ajaxBtn').on('click', function(){
            console.log("ajax button clicked")  // 1st executed
            // now we have to make ajax call

            let cId = $("#cId").val();
            console.log("customerId = " + cId); // 2nd executed

            $.ajax({
                method: "GET",
                url: "/customer/ajaxCall",
                data: {customerId: cId}
            }).done(function( msg ){   // 4th executed ... reason being ajax is asynchronous
                console.log( msg)
                let customer = JSON.parse( msg);
                $('#ajaxResult').text(customer.customerName + " " + customer.id);
            });
            console.log("after json call but before .done") // 3rd executed

        });
    });

</script>

<section>
    <div class="container bg-light2">
        <div class="row pt-5 pb-5">
            <div class="col-6">
                <input class="form-control" type="text" id="cId"/>
                <button id="ajaxBtn" class="btn btn-primary">Ajax Trigger</button>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <div id="ajaxResult"></div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>