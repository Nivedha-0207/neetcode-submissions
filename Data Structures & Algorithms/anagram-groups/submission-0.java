class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> same = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            same.putIfAbsent(sorted,new ArrayList<>());
            same.get(sorted).add(s);
        }
        return new ArrayList<>(same.values());

    }
}
