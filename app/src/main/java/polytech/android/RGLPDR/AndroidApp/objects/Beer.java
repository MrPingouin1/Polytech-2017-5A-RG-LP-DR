package polytech.android.RGLPDR.AndroidApp.objects;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Beer implements Serializable {

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
    private String brewers_tips;
    private String contributor;

    private Map<String, List<String>> ingredients;

    public Beer() {

    }

    public Beer(JSONObject jsonBeer) {
        this.id = jsonBeer.optInt("id");
        this.name = jsonBeer.optString("name");
        this.tagline = jsonBeer.optString("tagline");
        this.first_brewed = jsonBeer.optString("first_brewed");
        this.description = jsonBeer.optString("description");
        this.image_url = jsonBeer.optString("image_url");
        this.abv = jsonBeer.optDouble("abv");
        this.ibu = jsonBeer.optDouble("ibu");
        this.target_fg = jsonBeer.optDouble("target_fg");
        this.target_og = jsonBeer.optDouble("target_og");
        this.ebc = jsonBeer.optDouble("ebc");
        this.srm = jsonBeer.optDouble("srm");
        this.ph = jsonBeer.optDouble("ph");
        this.attenuation_level = jsonBeer.optDouble("attenuation_level");
        this.brewers_tips = jsonBeer.optString("brewers_tips");
        this.contributor = jsonBeer.optString("contributed_by");

        try {
            this.ingredients = new HashMap<>();
            final JSONObject ingredients = jsonBeer.getJSONObject("ingredients");
            ingredients.keys().forEachRemaining(ingredient -> {
                List<String> listIngredients = new ArrayList<>();
                this.ingredients.put(ingredient, listIngredients);
                try {
                    if(Objects.equals(ingredient, "yeast")) {
                        listIngredients.add(ingredients.getString(ingredient));
                    }
                    else {
                        JSONArray ingredientDetails = ingredients.getJSONArray(ingredient);
                        for(int i = 0; i < ingredientDetails.length(); i++) {
                            listIngredients.add(ingredientDetails.getJSONObject(i).optString("name"));
                        }
                    }
                }
                catch (JSONException e) {
                    e.printStackTrace();
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
        this.abv = abv;
    }

    public Double getIbu() {
        return ibu;
    }

    public void setIbu(Double ibu) {
        this.ibu = ibu;
    }

    public Double getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(Double target_fg) {
        this.target_fg = target_fg;
    }

    public Double getTarget_og() {
        return target_og;
    }

    public void setTarget_og(Double target_og) {
        this.target_og = target_og;
    }

    public Double getEbc() {
        return ebc;
    }

    public void setEbc(Double ebc) {
        this.ebc = ebc;
    }

    public Double getSrm() {
        return srm;
    }

    public void setSrm(Double srm) {
        this.srm = srm;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(Double attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public Map<String, List<String>> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, List<String>> ingredients) {
        this.ingredients = ingredients;
    }
}
