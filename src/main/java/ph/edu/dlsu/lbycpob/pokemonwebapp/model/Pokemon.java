package ph.edu.dlsu.lbycpob.pokemonwebapp.model;

// Concrete Pokemon implementation
public class Pokemon extends AbstractPokemon {

    public Pokemon(int instanceId, String name, double weight, double height, double attack, double defense, double stamina, String type) {
        super(instanceId, name, weight, height, attack, defense, stamina, type);
    }

    @Override
    public String getSpecialAbility() {
        return "Standard Pokemon ability for " + type + " type";

    }

    @Override
    public String getTypeBackground() {
        String[] types = type.split("-");
        String primaryType = types[0].toUpperCase();
        return getTypeBackground(primaryType);

    }
    // Follow the first type by default
    public String getTypeBackground(String customType) {
        return switch (customType) {
            case "WATER" -> "linear-gradient(to bottom, #6BB6FF, #0066CC)";
            case "FIRE" -> "linear-gradient(to bottom, #FF6B6B, #CC0000)";
            case "GRASS" -> "linear-gradient(to bottom, #4CAF50, #2E7D32)";
            case "ELECTRIC" -> "linear-gradient(to bottom, #FFD700, #FFA500)";
            case "PSYCHIC" -> "linear-gradient(to bottom, #FF69B4, #8B008B)";

        }

        }