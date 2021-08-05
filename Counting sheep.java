public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int sheepNumber = 0;
    for (int i = 0; i < arrayOfSheeps.length; i++) {
      if (arrayOfSheeps[i] == null) {
        continue;
      }
      if (arrayOfSheeps[i] == true) {
        sheepNumber = sheepNumber + 1;
      }
    }
    return sheepNumber;
  }
}
