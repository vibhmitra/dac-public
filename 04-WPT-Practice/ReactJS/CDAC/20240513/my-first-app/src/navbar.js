import logo from './logo.svg';

function Navbar() {
    return (
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
    <img src={logo} class="rounded" alt="Cinque Terre" width="60px"></img>

    <a class="navbar-brand" href="#">🧪 ReactJS</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

);
}

export default Navbar;