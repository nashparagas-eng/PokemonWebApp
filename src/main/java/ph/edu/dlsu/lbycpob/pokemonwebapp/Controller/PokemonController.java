package ph.edu.dlsu.lbycpob.pokemonwebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ph.edu.dlsu.lbycpob.pokemonwebapp.model.Pokemon;
import ph.edu.dlsu.lbycpob.pokemonwebapp.service.PokemonService;

import java.util.List;

public class PokemonController {
    @Controller
    public static class PokemonController {

        private final PokemonService pokemonService;

        public PokemonController(PokemonService pokemonService) {
            this.pokemonService = pokemonService;
        }