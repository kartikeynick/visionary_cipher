import java.io.*;
import java.util.*;
public class Decrypt1 {
    static String s = "OBRGXIMYAZZAWCATBNMUYYHAZNVGFCXPVVSIJSVLKIFAVGBIECAZSBWGRGRQWUCHMMOCYEFLGQQNKFSHQMGYALNKCIJQVEKVWXNFOYFYQBESGOYTXMAYTXSISNBPMSGOJBKFWRUTTMLSBNQMLLRGFNZUAWHZLBRVZGHUVZMCKJEHSLSWGXCNZYEXRIMLPXRIXNUXRNSNRPHFDHBMAYWKHTKNGNUXRNJUVGMYNYEYNLYYGPGYFSBNQQWUCHMMSLRWTFDYQRNOJUEWNLVUZIDHWXLHTLKNEXMALBRQGUMMGXCUFXLHTLLLRTROJYFIDHLIGADLUBVXENSCALVCDFFIQCFAHISILUXXZXNUAMZAWISRNOJYKMQYECGRSBWHAHLUFBBPDPWLJBRYOCYEAYSVYXSISPRKSNZYPHMMWKHXMWWMGAZNEOFMDHKORMGOKNUHTAZQRAZPWBRTQXGZFMTJAXUTRNWCAPZLUFRODLFYFLGUKHRODLTYRGRYWHNLRIUCNMDXOCGAKIFAQXKUQMVGZFDBVLSIJSGADLWCFGNCFMGTMWWISTBIMHGKXBSPVGFVWHRYHNWXSKNGHLBENHYYQPZLXUEXNHDSBGDQZIXGNQKNUXCCKUFMQIMMRYEYUNFHEUDIAZVUJWNGQYSFVSDNZYFNOLWGRBLJGLGTMWWISKZJAXVMXCFVEBMAAHTBSNGUPENMWCGBRIFFLHMYOBBBRNZIEHTAZFLTBKMUVGSYVQVMGNZYROHFKISPZLOBBVZHLBBKNOYBYRTHVYELSUFXGADJJISBSUTFRPZSGZPTQLQCAZHNGHGADMCCYEEODARGDLSFQHDMFIGKZCKYNLDWGHQEDPQHRBSBWLNKDBAMFNOJDSJTFIFMYHZXWXZHQYLBNGSQAWRHMWWQNKHMVYPEZLWXUXVCDFAHSQSMGXOLWWVHTMLCZXHHOUVMHHYZBKQYAHSHQWWGRGSMFIEPHFDBRMTLFBVLZLESOTBEXIEYQYKBFNOJDCRLAOLWEHRMWMGADYFYZRRZJIAMHYJQVMGIMNQXKUQNUXUUDORHENAGRMGULCFUDCFANEHNLFRTGYSXBYXIMLBIOIFYAMGUKWBNMNWXSHQGGLRMGUFYVMGYJHHFDLAWNEROHYEBNLANLHQNZYABBYKNPTKWMFNMHIFMJBSBJYTTQXLIPHLGAMFTQCSN";
    static int l=s.length();
    public static void main(String args[]) throws IOException{

        Scanner sc=new Scanner(System.in);
        //Finding the Key:
        //kasiki();//saw the population, The guess is that they key is 2 or 6. Taking 6 because 2 is just too easy.
        //System.out.println("Enter the gussed key length");
        //int k=sc.nextInt();
        blocking(6,"SUNTZU");

    }
    public static void kasiki()// to guess the length of the key
    {
        HashMap<String,ArrayList<Integer>> m=new HashMap<String, ArrayList<Integer>>();
        //for looking for each possible combinations
        for(int x=0;x<l-3;x++)//
        {
            String sub=s.substring(x,x+3);// taking 3 as the size of the text to be identified as the repeated texts

            for(int y=0;y<l-3;y++)
            {
                String sub2=s.substring(y,y+3);
                //System.out.println(sub2);
                   if(sub.equals(sub2))//if a match is found
                   {
                       int delta=Math.abs(y-x);//finding the spacing inbetween

                       ArrayList<Integer> l=new ArrayList<Integer>();//to store the factors
                       l=factor(delta);//to take out the factor
                       System.out.println(Arrays.asList(l));//printing the factors
                       m.put(sub, new ArrayList<Integer>());
                       m.put(sub,l);//adding it into the hashmap
                       System.out.println(sub+" = "+sub2);
                   }
            }
        }
    System.out.println(m);
    }
    static ArrayList <Integer> factor(int n)//to find the factors of int n
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int x=2;x<=n;x++)
        {
            if(n%x==0)
            {
                l.add(x);
                //System.out.println(x);
            }
        }
        return l;
    }
    public static void blocking(int k,String key)
    {
        //String key="SUNTZU";
        String dec="";
        for(int x=0;x<l;x+=k)
        {
            for(int y=0;y<k;y++) {
                int t=x;
                char ch = s.charAt(t++);
                char chk =key.charAt(y);
                dec=dec+decrypt(ch,chk);
            }
        }
        System.out.println(dec);
    }

    public static char decrypt(char a, char k) {
        int cd=(a-(k-65));
        //System.out.println(a+" = "+k);
        char ch=(char)(cd);
        if(cd<65)
        {

            ch=(char)(cd+26);
            //System.out.println(ch);
        }
        return ch;

    }

}
