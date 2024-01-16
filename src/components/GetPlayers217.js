import React, { useState, useEffect } from 'react';
import axios from 'axios'; 

function GetPlayers217() {
  const [players, setPlayers] = useState([]);

  useEffect(() => {
    const fetchPlayers = async () => {
      try {
        const response = await axios.get('http://localhost:8080/players_217/getAllPlayers');
        setPlayers(response.data);
      } catch (error) {
        console.error('Error while fetching players: ' + error.message);
      }
    };

    fetchPlayers();
  }, []);

  return (
    <div className="App">
      <h1>Players List</h1>
      <table className="table">
        <thead> 
          <tr> 
            <th>First Name</th>  
            <th>Last Name</th>  
            <th>Phone Number</th>  
            <th>Team Preferences</th> 

          </tr>
        </thead> 
        <tbody> 
          {players.map(player =>(
            <tr key={player.id}> 
              <td>{player.firstName217}</td> 
              <td>{player.lastName217}</td>  
              <td>{player.phoneNumber217}</td>  
              <td>{player.TeamPreference217.join(', ')}</td> 

            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default GetPlayers217;
