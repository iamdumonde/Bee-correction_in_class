import java.util.ArrayList;

public class BeeHive {
  private ArrayList<Bee> beeList;

  public BeeHive(int numBees) {
    this.beeList = new ArrayList<Bee>();
    for (int i = 0; i < numBees; i++) {
      this.beeList.add(new Bee("bee" + i));
    }
  }

  // 1st Exercice
  public void printBees() {
    for (Bee bee : beeList) {
      System.out.println(bee.getName());
    }
  }

  // 2nd Exercice
  public ArrayList<Bee> getBeeList() {
    return this.beeList;
  }

  public void leaveHome(String bee) {
    String beeName = bee.substring(3);
    int beeNumber = Integer.valueOf(beeName);
    beeList.get(beeNumber).leaveHome();
  }

  // 3rd Exercice
  public void addBees(ArrayList<String> beeNames) {
    for (String name : beeNames) {
      this.beeList.add(new Bee(name));
    }
  }

  // 4th Exercice
  public void moveOutBees() {
    this.beeList.clear();// supprime tous les éléments
    // this.beeList.remove(index); supprime un élément particulier
    // while (this.beeList.size() > 0) {
    //   this.beeList.remove(0);// supprime un élément
    // }
    // for (int i = 0; i < this.beeList.size();) {
    //   this.beeList.remove(i);
    // }
  }

  public static void main(String[] args) {
    // BeeHive myHive = new BeeHive(365);
    // 1st Exercice
    // myHive.printBees();
    // 2nd Exercice
    // myHive.leaveHome("bee43");
    // Affiche le statut de l'abeille pour s'assurer qu'elle n'est plus à la maison
    // System.out.println(myHive.beeList.get(43).isHome());

    // 3rd Exercice
    BeeHive myHive = new BeeHive(3);
    ArrayList<String> newBees = new ArrayList<String>();
    newBees.add("bob");
    newBees.add("macey");
    newBees.add("anna");
    myHive.addBees(newBees);
    // Afficher les éléments dans la liste d'abeille pour s'assurer que les
    // nouvelles abeille ont été ajoutées
    for (Bee b : myHive.beeList) {
      System.out.println(b.getName());
    }
    
    // 4th Exercice
    myHive.moveOutBees();
    // Afficher tous les éléments dans la liste d'abeille pour s'assure que toutes
    // les abeilles ont été retirées
    // for (Bee b : myHive.beeList) {
    //   System.out.println(b.getName());
    // }
  }
}
