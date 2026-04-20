class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> ssort = new HashMap<>();
        HashMap<Character, Integer> tsort = new HashMap<>();
        for(int i =0;i<s.length();i++){
            ssort.put(s.charAt(i), ssort.getOrDefault(s.charAt(i), 0)+1);
            tsort.put(t.charAt(i),tsort.getOrDefault(t.charAt(i),0)+1);

        }
        return ssort.equals(tsort);

    }
}
