package uk.co.jamesj999.sonic.graphics;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import uk.co.jamesj999.sonic.Control.InputHandler;
import uk.co.jamesj999.sonic.configuration.SonicConfiguration;
import uk.co.jamesj999.sonic.configuration.SonicConfigurationService;
import uk.co.jamesj999.sonic.sprites.Sprite;
import uk.co.jamesj999.sonic.sprites.playable.AbstractPlayableSprite;

/**
 * Manages drawing of all sprites on the screen. Acts as a Singleton.
 * 
 * @author james
 * 
 */
public class SpriteManager {
	private final SonicConfigurationService configService = SonicConfigurationService
			.getInstance();

	private static SpriteManager spriteManager;

	private Map<String, Sprite> sprites;

	private SpriteManager() {
		sprites = new HashMap<String, Sprite>();
	}

	/**
	 * Adds the given sprite to the SpriteManager. Returns true if we have
	 * overwritten a sprite, false if we are creating a new one.
	 * 
	 * @param sprite
	 * @return
	 */
	public boolean addSprite(Sprite sprite) {
		return (sprites.put(sprite.getCode(), sprite) != null);
	}

	/**
	 * Removes the Sprite with provided code from the SpriteManager. Returns
	 * true if a Sprite was removed and false if none could be found.
	 * 
	 * @param code
	 * @return
	 */
	public boolean removeSprite(String code) {
		return removeSprite(getSprite(code));
	}

	/**
	 * Draws all sprites.
	 */
	public void draw() {
		for (Entry<String, Sprite> entry : sprites.entrySet()) {
			Sprite sprite = entry.getValue();
			sprite.draw();
			if(sprite instanceof AbstractPlayableSprite) {
				// TODO temp debug stuff, remove
				((AbstractPlayableSprite) sprite).getGroundSensors().draw();
			}
		}
	}

	/**
	 * Calls all sprites to recalculate their positions.
	 * 
	 * @param frame
	 */
	public void update(InputHandler handler) {
		// Firstly calculate key presses:
		boolean up = handler.isKeyDown(configService
				.getInt(SonicConfiguration.UP));
		boolean down = handler.isKeyDown(configService
				.getInt(SonicConfiguration.DOWN));
		boolean left = handler.isKeyDown(configService
				.getInt(SonicConfiguration.LEFT));
		boolean right = handler.isKeyDown(configService
				.getInt(SonicConfiguration.RIGHT));
		boolean space = handler.isKeyDown(KeyEvent.VK_SPACE);
		// Iterate our Sprites:
		for (Entry<String, Sprite> entry : sprites.entrySet()) {
			Sprite sprite = entry.getValue();
			// Check we're dealing with a playable sprite:
			if (sprite instanceof AbstractPlayableSprite) {
				((AbstractPlayableSprite) sprite).getMovementManager()
						.handleMovement(left, right, space);
			}
			((AbstractPlayableSprite) sprite).getMovementManager()
					.handleCollisions(up, down);
			// ((AbstractPlayableSprite) sprite).getMovementManager()
			// .handleGravity(down);
		}
	}

	/*
	 * These will probably be added back in when things get more complex:
	 */
	// private void draw(Sprite sprite) {
	// sprite.draw();
	// }

	// private void update(Sprite sprite) {
	// //
	// }

	private Sprite getSprite(String code) {
		return sprites.get(code);
	}

	private boolean removeSprite(Sprite sprite) {
		return (sprites.remove(sprite) != null);
	}

	public synchronized static SpriteManager getInstance() {
		if (spriteManager == null) {
			spriteManager = new SpriteManager();
		}
		return spriteManager;
	}
}
