<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">
	<jsp:include page="cdn.jsp" />
	<link rel="stylesheet" href="<c:url value="/pageResources/css/styles.css"/>" />
    <title>Dashboard</title>
</head>

<body>
    <div class="container-fluid">
        <!-- top-menu -->
        <jsp:include page="navbar.jsp" />

        <div class="wrapper">
            <!-- left-menu -->
            <nav id="sidebar" style="min-height: 90vh;">
                <div id="content" style="margin-left: 240px;">
                    <button type="button" id="sidebarCollapse" class="navbar-btn"><i class="fas fa-angle-double-left"></i></button>
                </div>
                <ul class="list-unstyled components" style="margin-top: 5px;">
                    <div class="mt-4 ml-3" style="color: black;">
                        <h6>Your role now is: </h6>
                    </div>
                    <div class="input-group" style="width: 90%; margin-left: 5%;">
                        <input type="text" class="form-control" aria-label="Text input with segmented dropdown button">
                        <div class="input-group-append">
                            <button type="button" class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								<span class="sr-only">Toggle Dropdown</span>
							</button>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <a class="dropdown-item" href="#">Something else here</a>
                                <div role="separator" class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                        </div>
                    </div>
                    <div class="ml-3">
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;Dashboard
                                </a>
                            </h6>
                        </li>
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;Class Management
                                </a>
                            </h6>
                        </li>
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;Candidate Management
                                </a>
                            </h6>
                        </li>
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;Trainer Management
                                </a>
                            </h6>
                        </li>
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;Trainee Management
                                </a>
                            </h6>
                        </li>
                        <li class="nav-item mt-4">
                            <h6>
                                <a href="#">
                                    <i class="fas fa-circle fa-1x"></i>&emsp;General Setting
                                </a>
                            </h6>
                        </li>
                    </div>
                </ul>
            </nav>
            <!-- <div id="content">
                <button type="button" id="sidebarCollapse" class="navbar-btn">
					<span></span>
					<span></span>
					<span></span>
				</button>
            </div> -->
            <!--  -->

            <!-- content -->
            <div class="ml-4" style="width: 100%;">
                <h4>Candidate Profile</h4>
                <div class="mt-4 p-4" style="border: 1px solid darkgray;">
                    <ul class="nav nav-tabs">
                        <li class="nav-item">
                            <a class="nav-link active" data-toggle="tab" href="#candidate_infomation">Candidate
								Infomation</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="tab" href="#result">Result</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content mt-4">
                        <div class="tab-pane container active ml-0" style="min-width: 100%;" id="candidate_infomation">
                            <table class="table table-bordered">
                                <div class="p-2" style="background-color: #3399ff;">
                                    <b>Personal Infomation</b>
                                </div>
                                <thead>
                                    <div class="row">
                                        <div class="col-2 bg_title p-2"><b>Empl ID</b></div>
                                        <div class="col-2">00126792</div>
                                        <div class="col-2 bg_title p-2"><b>Type</b></div>
                                        <div class="col-2">Candidate</div>
                                        <div class="col-2 bg_title p-2"><b>Status</b></div>
                                        <div class="col-2">New</div>
                                    </div>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="bg_title">Apllication Date</td>
                                        <td>Doe</td>
                                        <td class="bg_title">Channel</td>
                                        <td>john@example.com</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Site</td>
                                        <td>Ha Noi</td>
                                        <td class="bg_title">Account</td>
                                        <td>AnhDD3</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Name</td>
                                        <td>Dao Duc Anh</td>
                                        <td class="bg_title">Gender</td>
                                        <td>Male</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">DOB</td>
                                        <td>23-Oct-1995</td>
                                        <td class="bg_title">CV</td>
                                        <td>CV_DaoDucAanh</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">University</td>
                                        <td>HUST</td>
                                        <td class="bg_title">Faculty</td>
                                        <td>DTVT</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Phone</td>
                                        <td>0941146156</td>
                                        <td class="bg_title">Email</td>
                                        <td>daoducanh@gmail.com</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Skill</td>
                                        <td>Java</td>
                                        <td class="bg_title">Graduation Year</td>
                                        <td>June-2016</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Foreign Language</td>
                                        <td>English</td>
                                        <td class="bg_title">Level</td>
                                        <td>TOEIC - 800</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Site</td>
                                        <td>Ha Noi</td>
                                        <td class="bg_title">Account</td>
                                        <td>AnhDD3</td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Note</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td class="bg_title">Site</td>
                                        <td>Ha Noi</td>
                                        <td class="bg_title">Account</td>
                                        <td>AnhDD3</td>
                                    </tr>
                                </tbody>
                            </table>

                        </div>
                        <div class="tab-pane container fade" id="result">
                            <div class="row tabcontent" id="Result" style="width: 137%;
							margin-left: -222px;">
                                <div class="col-sm">
                                    <table class="table">
                                        <thead class="thead-light">
                                            <tr>
                                                <th scope="col"><button type="button" class="btn btn-primary collapsible" id="collapsible"><i
															class="fas fa-arrow-down"></i></button></th>
                                                <th scope="col">Entry Test</th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>
                                            </tr>
                                            <tr>
                                                <th scope="col">Time</th>
                                                <th scope="col">Date</th>
                                                <th scope="col">Language Valuator</th>
                                                <th scope="col">Language Point</th>
                                                <th scope="col">Technical Valuator</th>
                                                <th scope="col">Technical Point</th>
                                                <th scope="col">Result</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">1</th>
                                                <td>Otto</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
                                                <td>@mdo</td>
                                                <td>Otto</td>
                                                <td>@mdo</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <br />
                                    <br />
                                    <table class="table">
                                        <thead class="thead-light">
                                            <tr>
                                                <th scope="col"><button type="button" class="btn btn-primary collapsible" id="collapsible1"><i class="fas fa-arrow-down"></i></button></th>
                                                <th scope="col">Interviewer</th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>
                                                <th scope="col"></th>

                                            </tr>
                                            <tr>

                                                <th scope="col">Time</th>
                                                <th scope="col">Date</th>
                                                <th scope="col">Interviewer</th>
                                                <th scope="col">Comment</th>
                                                <th scope="col">Result</th>
                                            </tr>
                                        </thead>
                                        <div class="content">
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Otto</td>
                                                    <td>@mdo</td>
                                                    <td>Otto</td>
                                                    <td>@mdo</td>
                                                </tr>
                                            </tbody>
                                        </div>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button type="button" class="btn btn-primary"><i class="fas fa-pen-fancy"></i>&nbsp;Update
						Candidate</button>
                    <button type="button" class="btn btn-primary"><i class="far fa-trash-alt"></i>&nbsp;Delete
						Candidate</button>
                    <button type="button" class="btn btn-primary"><i class="fas fa-exchange-alt"></i>&nbsp;Tranfer
						Candidate</button>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="footer.jsp" />
    <script type="text/javascript" src="<c:url value="/pageResources/js/home.js"/>"></script>
</body>

</html>