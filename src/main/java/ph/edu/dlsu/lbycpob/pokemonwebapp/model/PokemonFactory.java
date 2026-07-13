package ph.edu.dlsu.lbycpob.pokemonwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ph.edu.dlsu.lbycpob.pokemonwebapp.model.Pokemon;
import ph.edu.dlsu.lbycpob.pokemonwebapp.service.PokemonService;
import java.util.List;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Pokemon> allPokemon = pokemonService.getAllPokemon();
        model.addAttribute("allPokemon", allPokemon);
        model.addAttribute("pokemonCount", pokemonService.getPokemonCount());

        if (!model.containsAttribute("selectedPokemon")) {
            model.addAttribute("selectedPokemon", null);
        }
        if (!model.containsAttribute("message")) {
            model.addAttribute("message", null);
        }
        return "index";
    }
