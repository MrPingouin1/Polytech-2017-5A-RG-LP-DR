package polytech.android.LGLPDR.AndroidApp.objects;

import java.util.Map;

public class Beer {

    private Integer id;
    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
    private Double abv;
    private Double ibu;
    private Double target_fg;
    private Double target_og;
    private Double ebc;
    private Double srm;
    private Double ph;
    private Double attenuation_level;

    private Map<String, String> volume;
    private Map<String, Ingredient> ingredients;
}
