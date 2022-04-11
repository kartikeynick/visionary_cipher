# visionary_cipher
This code helps in cracking the Visionary cipher text to the plain text using kasiski method.
In addition to that it does the friquency analysis.


The Cipher text is:

OBRGXIMYAZZAWCATBNMUYYHAZNVGFCXPVVSIJSVLKIFAVGBIECAZSBWGRGRQWUCHMMOCYE
FLGQQNKFSHQMGYALNKCIJQVEKVWXNFOYFYQBESGOYTXMAYTXSISNBPMSGOJBKFWRUTTMLS
BNQMLLRGFNZUAWHZLBRVZGHUVZMCKJEHSLSWGXCNZYEXRIMLPXRIXNUXRNSNRPHFDHBMAY
WKHTKNGNUXRNJUVGMYNYEYNLYYGPGYFSBNQQWUCHMMSLRWTFDYQRNOJUEWNLVUZIDHWXLH
TLKNEXMALBRQGUMMGXCUFXLHTLLLRTROJYFIDHLIGADLUBVXENSCALVCDFFIQCFAHISILU
XXZXNUAMZAWISRNOJYKMQYECGRSBWHAHLUFBBPDPWLJBRYOCYEAYSVYXSISPRKSNZYPHMM
WKHXMWWMGAZNEOFMDHKORMGOKNUHTAZQRAZPWBRTQXGZFMTJAXUTRNWCAPZLUFRODLFYFL
GUKHRODLTYRGRYWHNLRIUCNMDXOCGAKIFAQXKUQMVGZFDBVLSIJSGADLWCFGNCFMGTMWWI
STBIMHGKXBSPVGFVWHRYHNWXSKNGHLBENHYYQPZLXUEXNHDSBGDQZIXGNQKNUXCCKUFMQI
MMRYEYUNFHEUDIAZVUJWNGQYSFVSDNZYFNOLWGRBLJGLGTMWWISKZJAXVMXCFVEBMAAHTB
SNGUPENMWCGBRIFFLHMYOBBBRNZIEHTAZFLTBKMUVGSYVQVMGNZYROHFKISPZLOBBVZHLB
BKNOYBYRTHVYELSUFXGADJJISBSUTFRPZSGZPTQLQCAZHNGHGADMCCYEEODARGDLSFQHDM
FIGKZCKYNLDWGHQEDPQHRBSBWLNKDBAMFNOJDSJTFIFMYHZXWXZHQYLBNGSQAWRHMWWQNK
HMVYPEZLWXUXVCDFAHSQSMGXOLWWVHTMLCZXHHOUVMHHYZBKQYAHSHQWWGRGSMFIEPHFDB
RMTLFBVLZLESOTBEXIEYQYKBFNOJDCRLAOLWEHRMWMGADYFYZRRZJIAMHYJQVMGIMNQXKU
QNUXUUDORHENAGRMGULCFUDCFANEHNLFRTGYSXBYXIMLBIOIFYAMGUKWBNMNWXSHQGGLRM
GUFYVMGYJHHFDLAWNEROHYEBNLANLHQNZYABBYKNPTKWMFNMHIFMJBSBJYTTQXLIPHLGAM
FTQCSN
Assume that encrypting with the key letter A results in no change, B results in an increment by
one place in the alphabet, C results in an increment by two places, and so on.
What is the key?- //To find the key use the Kasiski method. (In this case the key I got was 6)

2. A dictionary of the relative frequency of letters in English text are given as below:

{ "A": .08167, "B": .01492, "C": .02782, "D": .04253, "E": .12702, "F": .02228,
"G": .02015, "H": .06094, "I": .06966, "J": .00153, "K": .00772, "L": .04025,
"M": .02406, "N": .06749, "O": .07507, "P": .01929, "Q": .00095, "R": .05987,
"S": .06327, "T": .09056, "U": .02758, "V": .00978, "W": .02360, "X": .00150,
"Y": .01974, "Z": .00074 }
Here is some plaintext:
ethicslawanduniversitypolicieswarningtodefendasystemyouneedtobeabletot
hinklikeanattackerandthatincludesunderstandingtechniquesthatcanbeusedt
ocompromisesecurityhoweverusingthosetechniquesintherealworldmayviolate
thelawortheuniversitysrulesanditmaybeunethicalundersomecircumstancesev
enprobingforweaknessesmayresultinseverepenaltiesuptoandincludingexpuls
ioncivilfinesandjailtimeourpolicyineecsisthatyoumustrespecttheprivacya
ndpropertyrightsofothersatalltimesorelseyouwillfailthecourseactinglawf
ullyandethicallyisyourresponsibilitycarefullyreadthecomputerfraudandab
useactcfaaafederalstatutethatbroadlycriminalizescomputerintrusionthisi
soneofseverallawsthatgovernhackingunderstandwhatthelawprohibitsifindou
btwecanreferyoutoanattorneypleasereviewitsspoliciesonresponsibleuseoft
echnologyresourcesandcaenspolicydocumentsforguidelinesconcerningproper

The population variance of a finite population X of size N and mean μ is given by
Var(X) = 1/N {(N ∑ i=1) (xi − μ)2}.

a -  What is the population variance of the relative letter frequencies in English
text?
b - (10 points) What is the population variance of the relative letter frequencies in the given
plaintext?
c - For each of the following keys — yz, xyz, wxyz, vwxyz, uvwxyz — encrypt
the plaintext with a Vigenère cipher and the given key, then calculate and report the
population variance of the relative letter frequencies in the resulting ciphertext. Describe
and briefly explain the trend in this sequence of variances.
d -  Viewing a Vigenère key of length k as a collection of k independent Caesar
ciphers, calculate the mean of the frequency variances of the ciphertext for each one.
(E.g., for key yz, calculate the frequency variance of the even numbered ciphertext. 
characters and the frequency variance of the odd numbered ciphertext characters. Then
take their mean.) Report the result for each key in part (c). Is the mean variance like
those observed in part (b)? Part (c)? Briefly explain.
e -  Consider the ciphertext that was produced with key uvwxyz. In part (d), you
calculated the mean of six variances for this key. Revisit that ciphertext, and calculate
the mean of the frequency variances that arise if you had assumed that the key had
length 2, 3, 4, and 5. Does this suggest a variant to the Kasiski attack? (Don’t say no!)
Please provide a Brief explanation.

3.  Are all the 56 bits of the DES key used an equal number of times in the Ki ?
Specify, for each of the Ki , which bits are not used. Here, Ki is the round key for round i.
