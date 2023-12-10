import { Component } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-player-update',
  templateUrl: './player-update.component.html',
  styleUrls: ['./player-update.component.css']
})
export class PlayerUpdateComponent {

constructor(private service:PlayerService){}
player:Player={
  playerName: '',
  jerssyNumber: 0,
  role: '',
  totalMatches: 0,
  teamName: '',
  country: '',
  playerId: 0
};

  send(data:any){
    console.log(data.form.value);
    this.service.getPlayerById(data.form.value.playerId).subscribe((response)=>{this.player=response;
    console.log(this.player)},
    (error)=>{console.log("Error record Not found",error)});
  }
  update(data:any){
    let playerId:number=this.player.playerId;
    this.service.updatePlayer(this.player,playerId).subscribe((response1)=>{ console.log(response1); 
    console.log("player updated successfully")});
  }
}
