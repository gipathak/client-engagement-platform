import React from 'react';
import Ps_logo from '../assets/logo_short.png';
import Ps_full_logo from '../assets/PS_Logo_RGB.svg.png';
import Card from '../reusableComponent/Card';

function filterCards(e)
{
  let val = e.target.value;
  console.log(val);
}

const Dashboard = () => {
  return (
    <>
      <div className="navbar">
        <div className="logo-container">
          <img src={Ps_logo} alt="Logo1" className="home-logo" />
          <img src={Ps_full_logo} alt="Logo1" className="home-full-logo" />
        </div>
        <button className="login-btn">Login</button>
      </div>
      <div className="header">
        <div className="heading-text">Clients Onboard</div>
        <button className="new-client-btn">NEW CLIENT</button>
      </div>
      <div class="search-container">
        <i class="fa fa-search"></i>
        <input type="text" placeholder="Search..." name="search" onChange={e=>filterCards(e)} />
      </div>
      <div className="filter-container">
        <div className="filter-text">Filter By</div>
      </div>
      <div className="card-wrapper">
        <Card
          image={Ps_full_logo}
          name="Harsh"
          description="Coder"
          type="Front-end"
          date="14/02/2000"
        />
        <Card
          image={Ps_full_logo}
          name="Harsh"
          description="Coder"
          type="Front-end"
          date="14/02/2000"
        />
       
      </div>
    </>
  );
};

export default Dashboard;
