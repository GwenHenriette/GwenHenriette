import React, { useState, useEffect } from 'react';
import axios from 'axios'; 

function GetTeams217() {
  const [team, setTeam] = useState([]);

  useEffect(() => {
    const fetchTeam = async () => {
      try {
        const response = await axios.get('http://localhost:8080/teams_217/getAllTeams');
        setTeam(response.data);
      } catch (error) {
        console.error('Error while fetching teams: ' + error.message);
      }
    };

    fetchTeam();
  }, []);

  return (
    <div>
      <h1>Teams List</h1>
      <ul className="team"> 
        {team.map(teams => (
          <li key={teams.id}>  
            <h2>{teams.teamName217}</h2> 
            <p>Manager: {teams.managerFirstName217} {teams.managerLastName217}</p> 
            <p>Phone number: {teams.managerPhoneNumber217}</p>
            <h3>Players in the Team</h3> 
            <ul> 
              
                <li> Christopher217 Jones217</li>
    
            </ul>
          </li>
        ))}
        
      </ul>
    </div>
  );
}

export default GetTeams217;
