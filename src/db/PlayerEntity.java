package db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="PlayerEntities")
@SuppressWarnings("serial")
public class PlayerEntity implements Serializable {
	
	@Id
	@Column(name="playerName")
	protected String playerName;
	
	@Column(name="winCount")
	protected int winCount;
	
	
	
	public PlayerEntity(String playerName, int winCount) {
		super();
		this.playerName = playerName;
		this.winCount = winCount;
	}



	@OneToMany
	@JoinColumn(name= "playerName")
	protected List<GameSession> bestSessions;
//	@Id
//	private String playerName;
//
//
//	
//
//	public String getPlayerName() {
//		return playerName;
//	}
//
//
//
//
//	public void setPlayerName(String playerName) {
//		this.playerName = playerName;
//	}
//
//
//
//
//	public PlayerEntity(String playerName) {
//	super();
//	this.playerName = playerName;
//}
//
//
//
//
//	@Override
//	public String toString() {
//
//		return "[player| " + playerName + " ]";
//	}
}
