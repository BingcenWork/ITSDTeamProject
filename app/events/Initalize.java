package events;

import com.fasterxml.jackson.databind.JsonNode;

import akka.actor.ActorRef;
import demo.CheckMoveLogic;
import demo.CommandDemo;
import structures.GameState;
//byLuo
import commands.BasicCommands;
import structures.basic.Card;
import structures.basic.EffectAnimation;
import structures.basic.Player;
import structures.basic.Tile;
import structures.basic.Unit;
import structures.basic.UnitAnimationType;
import utils.BasicObjectBuilders;
import utils.StaticConfFiles;

/**
 * Indicates that both the core game loop in the browser is starting, meaning
 * that it is ready to recieve commands from the back-end.
 * 
 * { 
 *   messageType = “initalize”
 * }
 *
 *  表示浏览器中的核心游戏循环正在启动，意味着
 *  * 它已经准备好接收来自后端的命令。
 *
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class Initalize implements EventProcessor {

	@Override
	public void processEvent(ActorRef out, GameState gameState, JsonNode message) {
		// hello this is a change

		gameState.gameInitalised = true;

		gameState.something = true;

		// User 1 makes a change
		//CommandDemo.executeDemo(out); // this executes the command demo, comment out this when implementing your solution
		//CheckMoveLogic.executeDemo(out);
		initAllTile(out);


	}

	// init drawTile by Luo
	public static void initAllTile(ActorRef out) {

		// addPlayer1Notification
		BasicCommands.addPlayer1Notification(out, "addPlayer1Notification", 2);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

		BasicCommands.addPlayer1Notification(out, "initDrawAllTile", 2);// 发出消息持续两秒
		Tile tile00 = BasicObjectBuilders.loadTile(0, 0);
		Tile tile01 = BasicObjectBuilders.loadTile(0, 1);
		Tile tile02 = BasicObjectBuilders.loadTile(0, 2);
		Tile tile03 = BasicObjectBuilders.loadTile(0, 3);
		Tile tile04 = BasicObjectBuilders.loadTile(0, 4);

		Tile tile10 = BasicObjectBuilders.loadTile(1, 0);
		Tile tile11 = BasicObjectBuilders.loadTile(1, 1);
		Tile tile12 = BasicObjectBuilders.loadTile(1, 2);
		Tile tile13 = BasicObjectBuilders.loadTile(1, 3);
		Tile tile14 = BasicObjectBuilders.loadTile(1, 4);

		Tile tile20 = BasicObjectBuilders.loadTile(2, 0);
		Tile tile21 = BasicObjectBuilders.loadTile(2, 1);
		Tile tile22 = BasicObjectBuilders.loadTile(2, 2);
		Tile tile23 = BasicObjectBuilders.loadTile(2, 3);
		Tile tile24 = BasicObjectBuilders.loadTile(2, 4);

		Tile tile30 = BasicObjectBuilders.loadTile(3, 0);
		Tile tile31 = BasicObjectBuilders.loadTile(3, 1);
		Tile tile32 = BasicObjectBuilders.loadTile(3, 2);
		Tile tile33 = BasicObjectBuilders.loadTile(3, 3);
		Tile tile34 = BasicObjectBuilders.loadTile(3, 4);

		Tile tile40 = BasicObjectBuilders.loadTile(4, 0);
		Tile tile41 = BasicObjectBuilders.loadTile(4, 1);
		Tile tile42 = BasicObjectBuilders.loadTile(4, 2);
		Tile tile43 = BasicObjectBuilders.loadTile(4, 3);
		Tile tile44 = BasicObjectBuilders.loadTile(4, 4);

		Tile tile50 = BasicObjectBuilders.loadTile(5, 0);
		Tile tile51 = BasicObjectBuilders.loadTile(5, 1);
		Tile tile52 = BasicObjectBuilders.loadTile(5, 2);
		Tile tile53 = BasicObjectBuilders.loadTile(5, 3);
		Tile tile54 = BasicObjectBuilders.loadTile(5, 4);

		Tile tile60 = BasicObjectBuilders.loadTile(6, 0);
		Tile tile61 = BasicObjectBuilders.loadTile(6, 1);
		Tile tile62 = BasicObjectBuilders.loadTile(6, 2);
		Tile tile63 = BasicObjectBuilders.loadTile(6, 3);
		Tile tile64 = BasicObjectBuilders.loadTile(6, 4);

		Tile tile70 = BasicObjectBuilders.loadTile(7, 0);
		Tile tile71 = BasicObjectBuilders.loadTile(7, 1);
		Tile tile72 = BasicObjectBuilders.loadTile(7, 2);
		Tile tile73 = BasicObjectBuilders.loadTile(7, 3);
		Tile tile74 = BasicObjectBuilders.loadTile(7, 4);

		Tile tile80 = BasicObjectBuilders.loadTile(8, 0);
		Tile tile81 = BasicObjectBuilders.loadTile(8, 1);
		Tile tile82 = BasicObjectBuilders.loadTile(8, 2);
		Tile tile83 = BasicObjectBuilders.loadTile(8, 3);
		Tile tile84 = BasicObjectBuilders.loadTile(8, 4);


		BasicCommands.drawTile(out, tile00, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile01, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile02, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile03, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile04, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile10, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile11, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile12, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile13, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile14, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile20, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile21, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile22, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile23, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile24, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile30, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile31, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile32, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile33, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile34, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile40, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile41, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile42, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile43, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile44, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile50, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile51, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile52, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile53, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile54, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile60, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile61, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile62, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile63, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile64, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile70, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile71, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile72, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile73, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile74, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile80, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile81, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile82, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile83, 0);//0默认，1高亮，2red modified by Luo
		BasicCommands.drawTile(out, tile84, 0);//0默认，1高亮，2red modified by Luo


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	//init player by Luo

}
