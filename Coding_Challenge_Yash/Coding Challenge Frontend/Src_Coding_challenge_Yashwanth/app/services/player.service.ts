import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Player } from '../model/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
 
  constructor(private http:HttpClient) { 
  }
  player!:Player;
  ROOT_URL:String="http://localhost:8080";
  getPlayerById(playerId:number){
    console.log(playerId);
    return this.http.get<Player>(this.ROOT_URL+`/api/player/getplayerbyId/${playerId}`)
  }
  updatePlayer(player:Player,playerId:number){
    return this.http.put<Player>(this.ROOT_URL+`/api/player/updateplayer/${playerId}`,player)

  }
}
