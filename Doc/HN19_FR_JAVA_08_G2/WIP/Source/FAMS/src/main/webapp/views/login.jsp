<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <jsp:include page="cdn.jsp" />
    <link rel="stylesheet" href="<c:url value="/pageResources/css/login.css"/>" type="text/css">
    <title>Login</title>
</head>
<body>

    <div class="container-fluid banner">
       <!-- navbar -->
	   <jsp:include page="navbar.jsp" />

        <div class="content-body">
            <div class="row row-content">
                <div class="content-left col-lg-2" id="content-left">
                    <a href="#" id="event-nav"><i class="fas fa-angle-double-left"></i></a>
                    <a href="#" id="nav-event" class="hidden-a"><i class="fas fa-angle-double-right"></i></a>
                </div>

                <div class="content-right col-lg-10" id="content-right">
                    <h3>Login</h3>
                    <hr>

                    <div class="row main-content">
                        <div class="form-login col-lg-4 col-md-4 col-sm-4">
                            <form action="landing-page.html" id="loginForm">
                                <div class="row form-group-inline">
                                    <div class="col-sm-3 col-md-3 col-lg-3">
                                        <label for="my-input" class="form-check-label">Username</label>
                                    </div>

                                    <div class="col-sm-9 col-md-9 col-lg-9">
                                        <input type="text" name="username" id="username" class="form-control" placeholder="Enter username">
                                    </div>
                                </div>
                                <div class="row form-group-inline">
                                    <div class="col-sm-3 col-md-3 col-lg-3">
                                        <label for="my-input" class="form-check-label">Password</label>
                                    </div>

                                    <div class="col-sm-9 col-md-9 col-lg-9">
                                        <input type="password" name="password" id="password" class="form-control" placeholder="Enter password">
                                    </div>
                                </div>

                                <div class="row form-group-inline">
                                    <div class="col-sm-6 col-md-6 col-lg-6">
                                        <button type="submit" class="form-control btn-login" name="btn-login" id="btn-login">Login</button>
                                    </div>

                                    <div class="col-sm-6 col-md-6 col-lg-6">
                                        <button type="reset" class="form-control btn-reset" name="btn-reset" id="btn-reset">Reset</button>
                                    </div>
                                </div>
                            </form>
                        </div>

                        <div class="content-fixed col-lg-6 col-md-6 col-sm-6">
                            <span><b>Welcome to F-soft HR Utility</b></span>
                            <p>This tool is developed to help Employees. Project Managers, BJ Managers, FSU Leads, HR (SSC, BP Manager), CTC ,FWA, QA,... in submiting HR related informations, approving the submitted info, monitoring status of your submissions...and
                                further more
                            </p><br/>
                            <p>------------------------------------------------------------------------</p><br/>
                            <p>The recommended web browser is Google Chrome Sorry for any inconvenience!!!</p>

                        </div>

                    </div>
                </div>
              <!--  footer -->
              <jsp:include page="footer.jsp" />
            </div>
        </div>
    </div>

    <script src="<c:url value="/pageResources/js/login.js" />"></script>
</body>

</html>