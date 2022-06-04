class Lcs {
public static String lcs(String a, String b) {

    if (a.length() == 0 || b.length() == 0 || a == null || a == null)
        return "";

    String MaxResult = "";
    String result = "";
  
    for (int i = 0; i < a.length(); i++) 
    {
        String currRes = a.substring(i, i+1);
        int posRes = b.indexOf(currRes);
        if (posRes >= 0) 
        {
          result = currRes + lcs(a.substring(i + 1) , b.substring(posRes + 1));
        }
        if (result.length() > MaxResult.length()) 
        {
          MaxResult = result;
        }
      }
      return MaxResult;
  }
}
