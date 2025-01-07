public class Main {
    public static void main(String[] args) {
        CupStanley cupStanley = new CupStanley();

        // Criando os valores dos dados

        String colorCup = "Red";
        Float sizeCup = 20.2F;
        String materialCup = "Metal";

        // Setando os valores dos dados

        cupStanley.setColorCup(colorCup);
        cupStanley.setSizeCup(sizeCup);
        cupStanley.setMaterialCup(materialCup);

        // Mostrando os valores dos dados

        System.out.println(cupStanley.getColorCup());
        System.out.println(cupStanley.getSizeCup());
        System.out.println(cupStanley.getMaterialCup());

    }
}