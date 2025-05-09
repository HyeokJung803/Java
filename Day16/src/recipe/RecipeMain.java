package recipe;

public class RecipeMain {
	public static void main(String[] args) {
		PastaRecipe pr = new PastaRecipe("최연석");
		pr.info();
		pr.makeSource();
		
		System.out.println();
		
		StakeRecipe sr = new StakeRecipe("이현복");
		sr.info();
		sr.grillStake();
	}
}
