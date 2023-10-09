package goosegame;
public interface Cell{

  /**
  * get the index of the Cell
  * @return the index of the cell
  */
    public int getIndex();

    /**
    * get the player on the Cell
    * @return the player of the cell
    */
    public Player getPlayer();


  /**
   * calculate the index new cell after the bounce
   * @param diceThrow the throw of the dice at the round
   * @return the number of moves with the bounce
   */
    public int bounce(int diceThrow );




  /**
  * verify if there is a player on the cell
  * @return true if there is a player on the cell else false
  */
    public boolean isBusy();

/**
 * verify if the player can left the cell or no
 * @return true if the player can left the cell else false
 */
    public boolean canBeLeft();


/**
 * handle on the player coming
 * @param the player comming to the cell
*/
    public void handleOnComing(Player p);


}
