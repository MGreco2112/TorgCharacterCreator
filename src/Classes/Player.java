package Classes;

import java.util.List;
import java.util.Map;

public class Player {
    private String characterName;
    private String playerName;
    private String cosm;
    private Map<String, Integer> axioms;
    private Integer possibilities;
    private Map<String, Integer> attributes;
    private Map<String, Integer> skills;
    private List<Equipment> equipment;

    public Player(String characterName, String playerName, String cosm, Map<String, Integer> axioms, Map<String, Integer> attributes, Map<String, Integer> skills, List<Equipment> equipment) {
        this.characterName = characterName;
        this.playerName = playerName;
        this.cosm = cosm;
        this.axioms = axioms;
        this.attributes = attributes;
        this.skills = skills;
        this.equipment = equipment;
        this.possibilities = 10;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCosm() {
        return cosm;
    }

    public void setCosm(String cosm) {
        this.cosm = cosm;
    }

    public Map<String, Integer> getAxioms() {
        return axioms;
    }

    public void setAxioms(Map<String, Integer> axioms) {
        this.axioms = axioms;
    }

    public Integer getPossibilities() {
        return possibilities;
    }

    public void setPossibilities(Integer possibilities) {
        this.possibilities = possibilities;
    }

    public Map<String, Integer> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Integer> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Integer> skills) {
        this.skills = skills;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }
}
