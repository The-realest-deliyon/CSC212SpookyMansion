package edu.smith.cs.csc212.spooky;

import java.util.HashMap;
import java.util.Map;

/**
 * SpookyMansion, the game.
 * @author jfoley
 *
 */
public class SpookyMansion implements GameWorld {
	private Map<String, Place> places = new HashMap<>();

	/**
	 * Where should the player start?
	 */
	@Override
	public String getStart() {
		return "BusStop";
	}

	/**
	 * This constructor builds our SpookyMansion game.
	 */
	public SpookyMansion() {
		Place BusStop = insert(
				Place.create("BusStop", "You get to Hampshire, and it's late\n"
						+ "You cant wait to go to the woods parties you keep hearing about. Great start to Halloween"));
		BusStop.addExit(new Exit("RCC", "There's a path leading to your right."));
		BusStop.addExit(new Exit("Prescott", "There's a path leading upwards."));
		BusStop.addExit(new Exit("Endfield", "There's a path leading to Endfield"));
		BusStop.addExit(new Exit("Woods", "Welcome to the Hampshire Woods"));


		String EMOJI_SKULL = "\uD83D\uDC80";
		
		Place RCC = insert(Place.create("RCC", "Your greeted by a student worker who looks tired of his shift.\n"
				+ "You have to scan your ID to go any further \n" 
				+ "You ignore him"));
		RCC.addExit(new Exit("Gym", "Cross the Basketball court to the gym"));
		RCC.addExit(new Exit("Cafe", "Upstairs to the cafe"));
		RCC.addExit(new Exit("BusStop", "That way goes back to the bus stop"));

		Place Cafe = insert(
				Place.create("Cafe", "You found the cafe.\n" + "Smells like chicken tendnders in here.\n"));
		Cafe.addExit(new Exit("APL", "There's a bridge leading to another area"));
		Cafe.addExit(new Exit("RCC", "Go back downstairs"));
		Cafe.addExit(new Exit("WoodsParty","You could ask an employee for some help"));
		//Let this be your secret exit. they'll guide you to the woods party.
		
		
		Place APL = insert(Place.create("APL",
				"Some papers rustle from the wind as you enter the airport lounge. Creepy.\n" + "It's big in here."));
		APL.addExit(new Exit("Library", "There's a door leading to what looks like a mailroom."));
		APL.addExit(new Exit("Cafe", "A door? Up here? Can't be."));
		APL.addExit(new Exit("MailRoom","CC? Does that have any correlation to something?"));

		Place Gym = insert(Place.create("Gym", "There's definitely no one in here, you should take a breath.\n"
				+ "This part of campus does smell like sweat, so don't inhale to hard."));
		Gym.addExit(new Exit("BusStop", "There's a path back to the bus"));
		Gym.addExit(new Exit("Cafe", "Go back to the cafe"));
		Gym.addExit(new Exit("Endfield","You can walk a path to Endfield"));
		
		Place Library = insert(Place.create("Library", "Looks like you've found yourself in the library"));
		Library.addExit(new Exit("Elevator","Take the elevator down to the mailroom"));
		Library.addExit(new Exit("APL","Go back to the APL"));
		Library.addExit(new Exit("Elevator","Take the elevator down to the Media Basement"));
		
		Place MailRoom = insert(Place.create("MailRoom", "This room is suprisingly well lit.\n"));
		MailRoom.addExit(new Exit("Elevator", "Take the elevator upstairs to the Library."));
		MailRoom.addExit(new Exit("Elevator", "Take the elevator down to the Media Basement"));
		MailRoom.addExit(new Exit("APL", "Return to the Airport Lounge."));

		
		Place MediaBasement = insert(Place.create("MediaBasement", "You've found the media basement.\n" + 
				"There's a message inscribed on the wall next to a skull" + EMOJI_SKULL +
				"ENNWNE?"));
		MediaBasement.addExit(new Exit("Elevator", "There's the elevator to take you up to the Library"));
		MediaBasement.addExit(new Exit("Elevator", "There's the elevator to take you up to the mailroom"));

		Place Prescott = insert(Place.create("Prescott", "Welcome to a house complex really close to the woods"));
		Prescott.addExit(new Exit("BusStop", "Back to the Hampshire College Bus Stop"));
		Prescott.addExit(new Exit("Woods", "Walk into the Hampshire Woods "));
		Prescott.addExit(new Exit("Library", "Walk back to the Library"));

		
		Place Greenish = insert(Place.create("Greenish", "Welcome to a housing complex close to the woods"));
		Greenish.addExit(new Exit("BusStop", "Back to the Hampshire College Bus Stop"));
		Greenish.addExit(new Exit("Woods", "Walk the Road up into the Woods"));
		Greenish.addExit(new Exit("RCC", "Back to the RCC"));
		
		
		Place Endfield = insert(Place.create("Endfield", "Welcome to a housing complex FAR from the woods"));
		Endfield.addExit(new Exit("BusStop", "Back to the Hampshire College Bus Stop"));
		Endfield.addExit(new Exit("Greenish", "Walk to Greenish"));
		Endfield.addExit(new Exit("Gym", "Walk back to the Gym"));
		
		
		Place Elevator = insert(Place.create("Elevator", "Looks like an Elevator with three Levels"));
		Elevator.addExit(new Exit("Library","TOP FLOOR"));
		Elevator.addExit(new Exit("MailRoom","MID FLOOR"));
		Elevator.addExit(new Exit("MediaBasement", "LOWEST FLOOR"));
		
		Place Woods = insert(Place.create("Woods", "Welcome to the real fun "+ EMOJI_SKULL));
		Woods.addExit(new Exit("Woods0","Start the Hike"));
		

		String WoodsDescription = "Hope you remembered that code from the basement\n"
				+ "Time to walk in the dark";
		Place Woods0 = insert(Place.create("Woods0", WoodsDescription));
		Place Woods1 = insert(Place.create("Woods1", WoodsDescription));
		Place Woods2 = insert(Place.create("Woods2", WoodsDescription));
		Place Woods3 = insert(Place.create("Woods3", WoodsDescription));
		Place Woods4 = insert(Place.create("Woods4", WoodsDescription));
		Place Woods5 = insert(Place.create("Woods5", WoodsDescription));
		
		// solution: East
		Woods0.addExit(new Exit("Woods0", "Go North."));
		Woods0.addExit(new Exit("Woods1", "Go East."));
		Woods0.addExit(new Exit("Woods0", "Go South."));
		Woods0.addExit(new Exit("Woods0", "Go West."));
		
		// solution: North
		Woods1.addExit(new Exit("Woods2", "Go North."));
		Woods1.addExit(new Exit("Woods0", "Go East."));
		Woods1.addExit(new Exit("Woods0", "Go South."));
		Woods1.addExit(new Exit("Woods0", "Go West."));
		
		// solution: North
		Woods2.addExit(new Exit("Woods3", "Go North."));
		Woods2.addExit(new Exit("Woods0", "Go East."));
		Woods2.addExit(new Exit("Woods0", "Go South."));
		Woods2.addExit(new Exit("Woods0", "Go West."));
		
		// solution: West
		Woods3.addExit(new Exit("Woods0", "Go North."));
		Woods3.addExit(new Exit("Woods0", "Go East."));
		Woods3.addExit(new Exit("Woods0", "Go South."));	
		Woods3.addExit(new Exit("Woods4", "Go West."));
		
		// solution: North		
		Woods4.addExit(new Exit("Woods5", "Go North."));
		Woods4.addExit(new Exit("Woods0", "Go East."));
		Woods4.addExit(new Exit("Woods0", "Go South."));	
		Woods4.addExit(new Exit("Woods0", "Go West."));
		
		// solution: East
		Woods5.addExit(new Exit("Woods0", "Go North."));
		Woods5.addExit(new Exit("WoodsParty", "Go East."));
		Woods5.addExit(new Exit("Woods0", "Go South."));	
		Woods5.addExit(new Exit("Woods0", "Go West"));


		Place WoodsParty = insert(Place.terminal("WoodsParty", "Welcome to a Hampshire Woods Party.\n"
				+ "You made it Congrats.\n" + "You ready to make some bad decisions?."));
		WoodsParty.addExit(new Exit("BusStop","You get to Hampshire, and it's late\\n\"\n" + 
				"						+ \"You cant wait to go to the woods parties you keep hearing about. Great start to Halloween"));
		
		// Make sure your graph makes sense!
		checkAllExitsGoSomewhere();
	}

	/**
	 * This helper method saves us a lot of typing. We always want to map from p.id
	 * to p.
	 * 
	 * @param p - the place.
	 * @return the place you gave us, so that you can store it in a variable.
	 */
	private Place insert(Place p) {
		places.put(p.getId(), p);
		return p;
	}

	/**
	 * I like this method for checking to make sure that my graph makes sense!
	 */
	private void checkAllExitsGoSomewhere() {
		boolean missing = false;
		// For every place:
		for (Place p : places.values()) {
			// For every exit from that place:
			for (Exit x : p.getVisibleExits()) {
				// That exit goes to somewhere that exists!
				if (!places.containsKey(x.getTarget())) {
					// Don't leave immediately, but check everything all at once.
					missing = true;
					// Print every exit with a missing place:
					System.err.println("Found exit pointing at " + x.getTarget() + " which does not exist as a place.");
				}
			}
		}

		// Now that we've checked every exit for every place, crash if we printed any
		// errors.
		if (missing) {
			throw new RuntimeException("You have some exits to nowhere!");
		}
	}

	/**
	 * Get a Place object by name.
	 */
	public Place getPlace(String id) {
		return this.places.get(id);
	}
}
