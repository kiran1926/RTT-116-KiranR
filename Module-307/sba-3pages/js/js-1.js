
console.log("===== js is here======");


$("#login").on("submit", function () {
  console.log("submit clicked");
  console.log("--------- here---------");
});

    function submitFunction(event) {
  console.log("Submit clicked");
  console.log(event);
  event.preventDefault();
  // !!!! ============ Email validation with input required ===========
  let em = $("#email").val();
  if (em == "") {
    console.log("Email is required");
    $("#eml").css("color", "red");
    $("#email").css("border-color", "red");
    $("#emlerror").text("Email is required");
  } else {
    let pattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+$/.test(em);
    if (!pattern) {
      console.log("incorrect email pattern");
      $("#eml").css("color", "red");
      $("#email").css("border-color", "red");
      $("#emlerror").text("Please enter a valid email address!");
    } else {
      console.log("user entered " + fn);
      $("#eml").css("color", "black");
      $("#email").css("border-color", "black");
      $("#emlerror").hide;
    };
  };
};



