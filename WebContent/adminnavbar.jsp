<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="AdminDashboard.jsp">Admin</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
         Manage Rooms
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="./RoomsListServlet">Rooms List</a>
          <a class="dropdown-item" href="AddRooms.jsp">Add Rooms</a>
        </div>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Staff
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="./staff">Staff List</a>
          <a class="dropdown-item" href="./fetch1">Add Staff</a>
          <a class="dropdown-item" href="ExitForm.jsp">Exit Form</a>
        </div>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Department
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="./departmentlist">Departments List</a>
          <a class="dropdown-item" href="AddDepartment.jsp">Add Department</a>
        </div>
      </li>
    </ul>
    <a href="Index.jsp"><button class="btn btn-outline-success my-2 my-sm-0"><i class="fa-duotone fa-solid fa-right-from-bracket mr-2"></i>Logout</button></a>
  </div>
</nav>