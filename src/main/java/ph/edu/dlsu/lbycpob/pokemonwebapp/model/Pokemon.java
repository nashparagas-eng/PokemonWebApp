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
}