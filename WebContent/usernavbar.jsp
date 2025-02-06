<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Reception</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="UserDashboard.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Guest
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="./roomno">Check-In</a>
          <a class="dropdown-item" href="Checkout.jsp">Check-Out</a>
          <a class="dropdown-item" href="./GuestList">Guest List</a>
        </div>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
          Rooms
        </a>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="./avaroomsSerlet">Available</a>
          <a class="dropdown-item" href="./occuroomsServlet">Occupied</a>
        </div>
      </li>
    </ul>
    <a href="Index.jsp"><button class="btn btn-outline-success my-2 my-sm-0"><i class="fa-duotone fa-solid fa-right-from-bracket mr-2"></i>Logout</button></a>
  </div>
</nav>