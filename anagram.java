class anagram{

    int countSentences(String wordSet,String sentences){
        int wordcount=wordSet.length();
        int totalcount=1;
        for(int i=1;i<wordcount;i++) {
            totalcount=2*totalcount;
        }
        return totalcount;
    }
    public static void main(String args[]){
        String sentences="cat the bats";
        String wordSet[]=sentences.split(" ");
        anagram ob=new anagram();
        int numSentences;

        //System.out.println(wordSet.length);
        numSentences=ob.countSentences(wordSet,sentences);
        System.out.println(numSentences);
    }
}