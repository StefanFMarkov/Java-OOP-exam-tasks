package PlayersAndMonsters.models.players.interfaces;

import PlayersAndMonsters.repositories.interfaces.CardRepository;

public interface Player {
    CardRepository getCardRepository();

    String getUsername();

    int getHealth();

    void setHealth(int healthPoints);

    boolean isDead();

    void takeDamage(int damagePoints);
}
