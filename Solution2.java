import java.util.ArrayList;
import java.util.HashMap;

public class Solution2_hw2 {

    static HashMap <String,Double> hm=new HashMap<String, Double>();

    public static void main(String args[])
    {
        hm.put( "A", .08167);
        hm.put( "B", .01492);
        hm.put( "C", .02782);
        hm.put( "D", .04253);
        hm.put( "E", .12702);
        hm.put("F", .02228);
        hm.put("G", .02015);
        hm.put("H", .06094);
        hm.put("I", .06966);
        hm.put("J", .00153);
        hm.put("K", .00772);
        hm.put("L", .04025);
        hm.put("M", .02406);
        hm.put("N", .06749);
        hm.put("O", .07507);
        hm.put("P", .01929);
        hm.put("Q", .00095);
        hm.put("R", .05987);
        hm.put("S", .06327);
        hm.put("T", .09056);
        hm.put("U", .02758);
        hm.put("V", .00978);
        hm.put("W", .02360);
        hm.put("X", .00150);
        hm.put("Y", .01974);
        hm.put("Z", .00074);
         String s="ethicslawanduniversitypolicieswarningtodefendasystemyouneedtobeabletothinklikeanattackerandthatincludesunderstandingtechniquesthatcanbeusedtocompromisesecurityhoweverusingthosetechniquesintherealworldmayviolatethelawortheuniversitysrulesanditmaybeunethicalundersomecircumstancesevenprobingforweaknessesmayresultinseverepenaltiesuptoandincludingexpulsioncivilfinesandjailtimeourpolicyineecsisthatyoumustrespecttheprivacyandpropertyrightsofothersatalltimesorelseyouwillfailthecourseactinglawfullyandethicallyisyourresponsibilitycarefullyreadthecomputerfraudandabuseactcfaaafederalstatutethatbroadlycriminalizescomputerintrusionthisisoneofseverallawsthatgovernhackingunderstandwhatthelawprohibitsifindoubtwecanreferyoutoanattorneypleasereviewitsspoliciesonresponsibleuseoftechnologyresourcesandcaenspolicydocumentsforguidelinesconcerningproper";
         int l=s.length();
        System.out.println("Hey yo");
        System.out.println("Population variance 1 = "+variance1());//q2 a
        System.out.println("Population variance 2 = "+variance2(s,l));//q2 b
        blocking(s,l);//q2 c
        blocking2(s,l);//q2 d
        blocking3(s,l);//q2 e
        //encrypt('b','z');

    }
    public static double variance1()//q2 part a
    {
        double var=0.0;//to find the variance
        double mean=0.0;//to find the mean
        for(char x='A';x<='Z';x++)//to store all the A till Z in the hashmap
        {
            String k=x+"";
            mean=mean+hm.get(k);
        }
        mean=mean/26.0;
        for(char x='A';x<='Z';x++)
        {
            var=var+Math.pow((hm.get(x+"")-mean),2);
        }
        var=var/26.0;
        return var;//return the variance

    }
    public static double variance2(String s,int l)//q2 part b
    {
        HashMap<Character ,Double> hm2=new HashMap<Character, Double>();//to sture the alphabets and the frequency of a-z in the given plane next
        for(char x='a';x<='z';x++)
        {
            double c=0;
            for(int y=0;y<s.length();y++) {
                if (x == s.charAt(y))
                {
                    c++;//to find the frequency of the alphabets
                }
            }
            c=c/l;
            hm2.put(x,c);
        }
        //to find the mean variance
        double var=0.0;
        double mean=0.0;
        for(char x='a';x<='z';x++)
        {
            mean=mean+hm2.get(x);
        }
        mean=mean/26.0;
        for(char x='a';x<='z';x++)
        {
            var=var+Math.pow((hm2.get(x)-mean),2);
        }
        var=var/26.0;
        return var;

    }

    public static char encrypt(char a, char k) //to encrypt
    {
        int cd=(a+(k-97));
        char ch=(char)(cd);
        if(cd>122)
        {
            ch=(char)(cd-26);
        }
        return ch;
    }
    public static void blocking(String s,int l)//for q2 part c
    {
        String ar[] = {"yz", "xyz", "wxyz", "vwxyz", "uvwxyz"};
        for (int i = 0; i < ar.length; i++) {
            String key = ar[i];
            int kl=key.length();
            String dec = "";
            for (int x = 0; x < l; x += kl) {
                int t = x;
                for (int y = 0; y < kl; y++) {
                    if(t<l) {
                        char ch = s.charAt(t++);
                        char chk = key.charAt(y);
                        dec = dec + encrypt(ch, chk);
                    }
                }
            }
            //System.out.println(dec + " = " + dec.length() + " = " + l);
            double var=variance2(dec,dec.length());
            System.out.println("Population variance "+ar[i]+" = "+var);
        }
    }

    public static void blocking2(String s,int l)//for q2 part d
    {
        String ar[] = {"yz", "xyz", "wxyz", "vwxyz", "uvwxyz"};//for various keys
        for (int i = 0; i < ar.length; i++) {
            String key = ar[i];//for the key we will encrypt using every keys in the ar one by one
            int kl=key.length();//storing the key length
            String dec[] = new String[kl];
            for(int x=0;x<kl;x++)
            {
                dec[x]="";
            }
            for (int x = 0; x < l; x += kl) {
                int t = x;
                for (int y = 0; y < kl; y++) {
                    if(t<l) {
                            char ch = s.charAt(t++);
                            char chk = key.charAt(y);
                            dec[y] = dec[y] + encrypt(ch, chk);
                    }
                }
            }
            //System.out.println(dec + " = " + dec.length() + " = " + l);
            double var=0.0;//variance2(dec,dec.length());
            for(int x=0;x<kl;x++)
            {
                var=var+variance2(dec[x],dec[x].length());
            }
            var=var/kl;
            System.out.println("Population variance "+ar[i]+" = "+var);
        }
    }

    public static void blocking3(String s,int l)//for q2 part e
    {
        int ar[] = {2,3,4,5};//for various key lengths
        for (int i = 0; i < ar.length; i++)//key length loop
        {
            String key = "uvwxyz";//for this key we will encrypt it normally generating the cypher text with the normal keylength of 6 here
            int kl=key.length();
            String dec2="";//to store the cypher text
            for (int x = 0; x < l; x += kl) //2nd loop will go till length of the plain text
            {
                int t = x;//temp. variable to store the value of x as it will be incrimented later so I dont want to get confused
                for (int y = 0; y < kl; y++) {

                    if(t<l ) {
                        char ch = s.charAt(t++);//for charAt plain text
                        char chk = key.charAt(y);//for charAt the key
                        dec2=dec2+encrypt(ch,chk);//encrypting it
                    }
                }
            }

            double var=0.0;
            String temp[]=new String[ar[i]];// A temp array to store the cypher text with the respect key lengths
            for(int x=0;x<ar[i];x++)
            {
                temp[x]="";//innitialising it with null string.
            }
            for (int x = 0; x < l; x+=ar[i])//to find the variance of the cypher text with the variable key length so storing the cypher text into the temp array of the variable key len index
            {
                int t=x;
                for(int y=0;y<ar[i];y++)
                {
                    temp[y] = temp[y] + dec2.charAt(t++);

                }
            }
            for(int x=0;x<ar[i];x++)//finding the variance
            {
                    var = var + variance2(temp[x], temp[x].length());
            }
            var=var/ar[i];
            System.out.println("Population variance of key length "+ar[i]+" = "+var);
        }
    }
}
