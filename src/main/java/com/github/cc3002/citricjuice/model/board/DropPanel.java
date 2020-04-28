package com.github.cc3002.citricjuice.model.board;

/**
 */
 public class DropPanel extends Panel{
  /**
   * Reduces the player's star count by the D6 roll multiplied by the player's norma level.
   */
  private static void applyDropTo(final @NotNull Player player) {
    player.reduceStarsBy(player.roll() * player.getNormaLevel());
  }
}
