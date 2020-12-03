package leetcode;

public class MinimumNumberofStepstoMakeTwoStringsAnagram_1347 {

    public void MinimumNumberofStepstoMakeTwoStringsAnagram_1347() {
        String s = "friend", t = "family";
        StringBuffer sResult = new StringBuffer(t);
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sTemp = new StringBuffer();
            sTemp.append(s.charAt(i));
            if(sResult.indexOf(sTemp.toString())!=-1)
            {
                sResult.deleteCharAt(sResult.indexOf(sTemp.toString()));
            }
        }
        System.out.println(sResult.length());
    }
}
