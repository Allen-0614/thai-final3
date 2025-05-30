import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] tempAnswers;
        ArrayList<Question> questionsP1 = new ArrayList<Question>();
        ArrayList<Question> questionsP2 = new ArrayList<Question>();
        ArrayList<Question> questionsP3 = new ArrayList<Question>();
        ArrayList<Question> questionsP4 = new ArrayList<Question>();

        
        Player allen = new Player(100000, 10000);
        Boss rehan = new Boss(10001, "weakling rehan");
        Boss brixton = new Boss(10001, "evil brixton");
        Boss boyuan = new Boss(10001, "boyuan the great");
        Boss Allen = new Boss(10001, "boyuan the great");
        ArrayList<Battle> battles = new ArrayList<>();
        battles.add(new Battle("King George III", questionsP1, allen,rehan));
        battles.add(new Battle("Robert Lee", questionsP2, allen,brixton));
        battles.add(new Battle("Rockefeller", questionsP3, allen,boyuan));
        battles.add(new Battle("Stalin", questionsP4, allen,Allen));
        // ...add more battles...

        javax.swing.SwingUtilities.invokeLater(() -> {
            new MyGUI(battles); // create and show GUI
        });

        // Period 1 (1491 - 1800)
        tempAnswers = new String[] {
            "A. Converting American Indians to Catholicism",
            "B. Monopolizing the New World's fur trade",
            "C. Preventing the intrusion of other European powers",
            "D. Gaining wealth through the acquisition of precious metals"
        };
        questionsP1.add(new Question(
            "I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.",
            "Which of the following most strongly motivated the Spanish conquest of American Indian societies, such as the Inca Empire?",
            tempAnswers, "D"
        ));

        tempAnswers = new String[] {
            "A. Repartimiento respected the rights of major American Indian groups, like the Inca, and allowed a large degree of self-rule.",
            "B. Encomienda allowed the buying and selling of natives, in a form of slavery.",
            "C. Encomienda lacked the professed main goal of converting the natives to Catholicism.",
            "D. Repartimiento was controlled by locals rather than the Spanish crown"
        };
        questionsP1.add(new Question(
            "I will be no man's tributary! I am greater than any prince upon Earth. Your emperor may be a great prince; I do not doubt it when I see that he has sent his subjects so far across the waters, and I am willing to hold him as a brother. As for the Pope of whom you speak, he must be crazy to talk of giving away countries which do not belong to him. For my faith, I will not change it. Your own God, as you say, was put to death by the very men whom he created, but mine, my god* still lives in the heavens and looks down on his children.",
            "How did the Spanish practice of encomienda differ from repartimiento?",
            tempAnswers, "B"
        ));

        tempAnswers = new String[] {
            "A. The War of 1812",
            "B. The Civil War",
            "C. The Nullification Crisis of 1832",
            "D. The Korean War"
        };
        questionsP1.add(new Question("...Let me now take a more comprehensive view, and warn you in the most solemn manner against the baneful effects of the spirit of party generally. There is an opinion that parties in free countries are useful checks upon the administration of government, and serve to keep alive the spirit of liberty. This within certain limits is probably true; and in governments of a monarchical cast patriotism may look with indulgence, if not with favor, upon the spirit of party. But in those of the popular character, in governments purely elective, it is a spirit not to be encouraged. From their natural tendency it is certain there will always be enough of that spirit for every salutary purpose; and there being constant danger of excess, the effort ought to be by force of public opinion to mitigate and assuage it. A fire not to be quenched, it demands a uniform vigilance to prevent its bursting into a flame, lest, instead of warming, it should consume. President George Washington, Farewell Address", "The sentiments expressed by Washington in his Farewell Address most warn against partisan divisions that occurred before which of the following conflicts?", tempAnswers, "A"));

            tempAnswers = new String[] {
                "A. Federalism",
                "B. Anti-Federalism",
                "C. Republicanism",
                "D. Sectionalism"
            };
            tempAnswers = new String[] {
        "A. The development of a racially mixed population and caste system",
        "B. The introduction of large-scale African slavery in the British colonies",
        "C. The establishment of representative government in Spanish colonies",
        "D. The rapid decline of European influence in the Americas"
    };

    questionsP1.add(new Question(
        "...Let me now take a more comprehensive view, and warn you in the most solemn manner against the baneful effects of the spirit of party generally. " +
        "There is an opinion that parties in free countries are useful checks upon the administration of government, and serve to keep alive the spirit of liberty. " +
        "This within certain limits is probably true; and in governments of a monarchical cast patriotism may look with indulgence, if not with favor, upon the spirit of party. " +
        "But in those of the popular character, in governments purely elective, it is a spirit not to be encouraged. From their natural tendency it is certain there will always be enough " +
        "of that spirit for every salutary purpose; and there being constant danger of excess, the effort ought to be by force of public opinion to mitigate and assuage it. " +
        "A fire not to be quenched, it demands a uniform vigilance to prevent its bursting into a flame, lest, instead of warming, it should consume. " +
        "President George Washington, Farewell Address",
        "Washington's Farewell Address best exemplifies which of the following political philosophies?",
        tempAnswers,
        "C"
    ));

tempAnswers = new String[] {
    "A. The development of a racially mixed population and caste system",
    "B. The introduction of large-scale African slavery in the British colonies",
    "C. The establishment of representative government in Spanish colonies",
    "D. The rapid decline of European influence in the Americas"
};

questionsP1.add(new Question(
    "Which of the following best describes a major effect of Spanish colonization in the Americas during the 16th century?",
    tempAnswers,
    "A"
));

        
                // Question 1
        tempAnswers = new String[] {
            "A. a series of armed conflicts between colonists and an alliance of Native American tribes, known as the Covenant Chain, led by Chief Pontiac.",
            "B. raids by Cherokee and the Creek warriors in the interior of Georgia and South Carolina following the \"Trail of Tears.\"",
            "C. a bloody conflict, known as King Philip's War, waged by the Narragansett against encroachments by colonists.",
            "D. skirmishes between Virginia settlers and the Powhatan Confederation."
        };
        tempAnswers = new String[] {
    "A. uniting British colonists and American Indians in mutual distrust of British intentions.",
    "B. slowing down British immigration to North America.",
    "C. intensifying tensions between Great Britain and France.",
    "D. creating resentment by colonists toward British policies in North America."
};

questionsP1.add(new Question(
    "\"And We do further declare it to be Our Royal Will and Pleasure, for the present as aforesaid, to reserve under our Sovereignty, Protection, and Dominion, for the use of the said Indians, . . . " +
    "all the Lands and Territories lying to the Westward of the Sources of the Rivers which fall into the Sea from the West and North West as aforesaid.\n\n" +
    "\"And We do hereby strictly forbid, on Pain of our Displeasure, all our loving Subjects from making any Purchases or Settlements whatever, or taking Possession of any of the Lands above reserved, " +
    "without our especial leave and Licence for that Purpose first obtained.\"\n\n" +
    "—Royal Proclamation of 1763 (excerpt)",
    "Which of the following best describes a primary effect of the Royal Proclamation of 1763?",
    tempAnswers,
    "D"
));

        // Question 3
        tempAnswers = new String[] {
            "A. Great Britain shifting the structure of its empire and allowing colonies more direct control of internal affairs.",
            "B. Great Britain's attempting to consolidate imperial control over its North American colonies.",
            "C. Great Britain attempting to prevent the spread of revolutionary sentiment.",
            "D. Great Britain shifting its policies from a mercantilist model to a free-market capitalist model."
        };
            questionsP1.add(new Question(
        "\"And We do further declare it to be Our Royal Will and Pleasure, for the present as aforesaid, to reserve under our Sovereignty, Protection, and Dominion, for the use of the said Indians, . . . " +
        "all the Lands and Territories lying to the Westward of the Sources of the Rivers which fall into the Sea from the West and North West as aforesaid.\n\n" +
        "\"And We do hereby strictly forbid, on Pain of our Displeasure, all our loving Subjects from making any Purchases or Settlements whatever, or taking Possession of any of the Lands above reserved, " +
        "without our especial leave and Licence for that Purpose first obtained.\"\n\n" +
        "—Royal Proclamation of 1763 (excerpt)",
        "The Royal Proclamation of 1763 could best be understood in the context of",
        tempAnswers,
        "B"
    ));


        // Question 7
        tempAnswers = new String[] {
            "A. President John Adams was extremely popular; any opposition to him was seen as treasonous.",
            "B. Irish immigration was changing the composition of many American cities; many Americans wondered if the United States could retain its Anglo-Saxon heritage without limiting immigration.",
            "C. federal authorities had uncovered and thwarted a plot by disgruntled North Carolina farmers to assassinate President John Adams; desperate times, it seemed, called for desperate measures.",
            "D. large numbers of Americans had become intensely critical of the revolutionary French government during the Quasi-War with France; restricting the ability of French immigrants to participate in American politics seemed reasonable."
        };
        questionsP1.add(new Question(
        "\"SECTION 1.\n\n" +
        "\"Be it enacted by the Senate and the House of Representatives of the United States of America in Congress assembled, That it shall be lawful for the President of the United States at any time during the continuance of this act, " +
        "to order all such aliens as he shall judge dangerous to the peace and safety of the United States, or shall have reasonable grounds to suspect are concerned in any treasonable or secret machinations against the government thereof, " +
        "to depart out of the territory of the United States, within such time as shall be expressed in such order, which order shall be served on such alien by delivering him a copy thereof, or leaving the same at his usual abode, " +
        "and returned to the office of the Secretary of State, by the marshal or other person to whom the same shall be directed.\"\n\n" +
        "—An Act Concerning Aliens (excerpt), 1798",
        "The legislative act, excerpted above, enjoyed widespread public support, despite opposition from Democratic–Republican leaders, because, in part,",
        tempAnswers,
        "D"
));


        // Question 8
        tempAnswers = new String[] {
            "A. calling for the impeachment of President John Adams.",
            "B. challenging the laws in the Supreme Court.",
            "C. putting forth the theory of state nullification of federal legislation.",
            "D. boycotting the elections of 1800."
        };
        questionsP1.add(new Question(
            "\"SECTION 1.\n\n" +
            "\"Be it enacted by the Senate and the House of Representatives of the United States of America in Congress assembled, That it shall be lawful for the President of the United States at any time during the continuance of this act, " +
            "to order all such aliens as he shall judge dangerous to the peace and safety of the United States, or shall have reasonable grounds to suspect are concerned in any treasonable or secret machinations against the government thereof, " +
            "to depart out of the territory of the United States, within such time as shall be expressed in such order, which order shall be served on such alien by delivering him a copy thereof, or leaving the same at his usual abode, " +
            "and returned to the office of the Secretary of State, by the marshal or other person to whom the same shall be directed.\"\n\n" +
            "—An Act Concerning Aliens (excerpt), 1798",
            "Leaders of the Democratic–Republican Party responded to legislative acts, such as the one excerpted, by",
            tempAnswers,
            "C"
        ));

        tempAnswers = new String[] {
            "A. adaptation by American Indians to European cultural practices.",
            "B. conflict among American Indian groups as a result of displacement and relocation by Spanish colonial forces.",
            "C. the high rate of intermarriage between American Indians and Spaniards in the New World.",
            "D. resistance by American Indians to Spanish colonial practices."
        };
        questionsP1.add(new Question(
            "\"Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], " +
            "because they beat them, took away what they had, and made them work without pay. Thus he replies.\n\n" +

            "\"Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, " +
            "killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, " +
            "'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . " +
            "He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question.\"\n\n" +

            "—Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)",
            "The events described by Josephe in the account, above, reflect",
            tempAnswers,
            "D"
        ));


        tempAnswers = new String[] {
            "A. were thoroughly Christianized by 1680.",
            "B. practiced nonviolent means of protest.",
            "C. traded extensively with the Spanish, but resented heavy taxes imposed on trade.",
            "D. targeted symbols of Spanish culture as well as the Spanish political and economic system."
        };
        questionsP1.add(new Question(
            "\"Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], " +
            "because they beat them, took away what they had, and made them work without pay. Thus he replies.\n\n" +

            "\"Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, " +
            "killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, " +
            "'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . " +
            "He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question.\"\n\n" +

            "—Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)",
            "The testimony of Josephe indicates that the Pueblo Indians",
            tempAnswers,
            "D"
        ));

        tempAnswers = new String[] {
            "A. Spanish colonizing efforts in North America in the late 1600s and 1700s saw an accommodation with some aspects of American Indian culture.",
            "B. Spanish military actions and disease wiped out the American Indian populations in Spanish North America.",
            "C. Spanish forces, having been defeated by the Pueblo Indians, abandoned all land claims in North America by 1700.",
            "D. Spain and Great Britain formed an alliance to establish European control over North America."
        };
        questionsP1.add(new Question(
            "\"Asked what causes or motives the said Indian rebels had for renouncing the law of God and obedience to his Majesty, and for committing so many kinds of crimes, [Josephe answered] the causes they have were alleged ill treatment and injuries received from [Spanish authorities], " +
            "because they beat them, took away what they had, and made them work without pay. Thus he replies.\n\n" +

            "\"Asked if he has learned if it has come to his notice during the time that he has been here the reason why the apostates burned the images, churches, and things pertaining to divine worship, making a mockery and a trophy of them, " +
            "killing the priests and doing the other things they did, he said that he knows and had heard it generally stated that while they were besieging the villa the rebellious traitors burned the church and shouted in loud voices, " +
            "'Now the God of the Spaniards, who was their father, is dead, and Santa Maria, who was their mother, and the saints, who were pieces of rotten wood,' saying that only their own god lived. . . . The captains and the chiefs ordered that the names of Jesus and Mary should nowhere be uttered. . . . " +
            "He has seen many houses of idolatry which they have built, dancing the dance of the cachina [part of a traditional Indian religious ceremony], which this declarant has also danced. Thus he replies to the question.\"\n\n" +

            "—Account of questioning of Josephe, a Spanish-speaking Pueblo Indian, by Spanish authorities following the Pueblo Revolt of 1680 (1681)",
            "Which of the following trends occurred in the aftermath of the events described in the account?",
            tempAnswers,
            "A"
        ));

        // Period 2 (1800 - 1865)

            String sharedStimulus = "\"From whence originated the idea, that it was derogatory to a lady's dignity, or a blot upon the female character, to labor? and who was the first to say, sneeringly, 'Oh, she works for a living'? Surely, such ideas and expressions ought not to grow on republican soil. The time has been, when ladies of the first rank were accustomed to busy themselves in domestic employment.\n" +
    "\n" +
    "Homer tells us of princesses who used to draw water from the springs, and wash with their own hands the finest of the linen of their respective families. The famous Lucretia used to spin in the midst of her attendants; and the wife of Ulysses, after the siege of Troy, employed herself in weaving, until her husband returned to Ithaca. And in later times, the wife of George the Third of England, has been represented as spending a whole evening in hemming pocket-handkerchiefs, while her daughter Mary sat in the corner, darning stockings.\n" +
    "\n" +
    "Few American fortunes will support a woman who is above the calls of her family; and a man of sense, in choosing a companion to jog with him through all the up-hills and down-hills of life, would sooner choose one who had to work for a living, than one who thought it beneath her to soil her pretty hands with manual labor, although she possessed her thousands. To be able to earn one's own living by laboring with the hands, should be reckoned among female accomplishments; and I hope the time is not far distant when none of my countrywomen will be ashamed to have it known that they are better versed in useful, than they are in ornamental accomplishments.\"\n\n" +
    "—\"Dignity of Labor,\" The Lowell [Massachusetts] Offering, 1842";

    tempAnswers = new String[] {
        "A. demonstrate the long history of women being treated as second-class citizens.",
        "B. assure poor women that hard work and dedication were the keys to advancement to a higher status.",
        "C. differentiate the emerging American culture from the corrupt traditions of Europe.",
        "D. convince middle-class men and women that they should not look down upon women performing physical work."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "The essay from the Lowell Offering, quoted above, describes the physical labors performed by important women—princesses in the time of Homer, the Roman noblewoman Lucretia, the wife of Ulysses, and the daughter of King George III of Great Britain—in order to",
        tempAnswers,
        "D"
    ));

    tempAnswers = new String[] {
        "A. New England abolitionists who participated in the Second Great Awakening.",
        "B. factory operatives at the textile mills in Lowell, Massachusetts, during the early stages of American industrialization.",
        "C. Transcendentalist writers who lived at the Brook Farm utopian community.",
        "D. African-American women who gained their freedom following the gradual elimination of slavery in Massachusetts."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "The contributors to the Lowell Offering were",
        tempAnswers,
        "B"
    ));

    tempAnswers = new String[] {
        "A. The popularity of the \"Arts and Crafts\" movement, which sought to revive traditional artisan techniques.",
        "B. The cultural shift that allowed for women to replace men in offices, as typists, accountants, and receptionists.",
        "C. The increasing number of Americans who made their living producing goods for national and foreign markets rather than relying on semi-subsistence agriculture.",
        "D. The movement to encourage society to see women's work in the home as actual labor that contributed to the social good."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "The reading from the Lowell Offering reflects which of the following historical developments?",
        tempAnswers,
        "C"
    ));
    sharedStimulus = "\"When the day of election approaches, visit your constituents far and wide. Treat liberally, and drink freely, in order to rise in their estimation, though you fall in your own. True, you may be called a drunken dog by some of the clean-shirt and silk-stocking gentry, but the real roughnecks will style you a jovial fellow. Their votes are certain, and frequently count double.\n" +
    "\n" +
    "Do all you can to appear to advantage in the eyes of the women. That's easily done. You have but to kiss and slabber their children, wipe their noses, and pat them on the head. This cannot fail to please their mothers, and you may rely on your business being done in that quarter.\n" +
    "\n" +
    "Promise all that is asked, said I, and more if you can think of anything. Offer to build a bridge or a church, to divide a county, create a batch of new offices, make a turnpike, or anything they like. Promises cost nothing; therefore, deny nobody who has a vote or sufficient influence to obtain one.\n" +
    "\n" +
    "Get up on all occasions, and sometimes on no occasion at all, and make long-winded speeches, though composed of nothing else than wind. Talk of your devotion to country, your modesty and disinterestedness, or any such fanciful subject. Rail against taxes of all kinds, officeholders, and bad harvest weather; and wind up with a flourish about the heroes who fought and bled for our liberties in the times that tried men's souls.\"\n\n" +
    "—Robert Penn Smith (writing as David Crockett), Colonel Crockett's Exploits and Adventures in Texas, 1837";

    tempAnswers = new String[] {
        "A. Demographic shifts were giving middle-class, literate voters increased power in determining the direction of national politics.",
        "B. As larger numbers of citizens participated in the electoral process, the nature of political campaigning changed.",
        "C. Reform-minded political leaders played an increasingly important role in national political campaigns.",
        "D. Military heroes played a larger role in politics, while lawyers and statesmen played a diminished role in electoral politics."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "Which of the following developments from the 1820s and 1830s is illustrated by the reading, above?",
        tempAnswers,
        "B"
    ));

    tempAnswers = new String[] {
        "A. Naturalization laws were changed, reducing the amount of time it took for immigrants to attain citizenship.",
        "B. Several important states extended voting rights to women.",
        "C. Civil rights legislation paved the way for large numbers of free African Americans to vote.",
        "D. Most states reduced or eliminated property qualifications for voting."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "Which of the following describes an important reason for the trend illustrated by the above passage?",
        tempAnswers,
        "D"
    ));

    tempAnswers = new String[] {
        "A. the Jacksonian Democrats.",
        "B. temperance reformers.",
        "C. women's suffragists.",
        "D. New England Federalists."
    };
    questionsP2.add(new Question(
        sharedStimulus,
        "The political shifts, evident in the reading, were especially beneficial to",
        tempAnswers,
        "A"
    ));

    sharedStimulus = "\"It is the sentiment around which all their actions, all their arguments, circle, from which all their propositions radiate. " +
"They look upon it as being a moral, social, and political wrong; and while they contemplate it as such, they nevertheless have due regard for its actual existence among us, " +
"and the difficulties of getting rid of it in any satisfactory way and to all the constitutional obligations thrown about it. " +
"Yet, having a due regard for these, they desire a policy in regard to it that looks to its not creating any more danger. " +
"They insist that it should, as far as may be, be treated as a wrong; and one of the methods of treating it as a wrong is to make provision that it shall grow no larger.\"\n\n" +
"Abraham Lincoln, from debate with Stephen Douglas, October 1858";

tempAnswers = new String[] {
    "A. Large-scale immigration from Ireland.",
    "B. The spread of the ideas of Romanticism.",
    "C. Violent slave rebellions in the South.",
    "D. Territorial growth of the United States."
};
questionsP2.add(new Question(
    sharedStimulus,
    "The position of Abraham Lincoln in the above passage emerged most directly in response to which of the following mid-nineteenth century trends?",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. George Fitzhugh's 1857 book, Cannibals All!",
    "B. the Wilmot Proviso, introduced in Congress in 1846, 1847, and 1848.",
    "C. Frederick Douglass's 1852 oration commonly known as, \"What to the slave is the 4th of July?\"",
    "D. John Brown's Last Speech, read in court in 1859."
};
questionsP2.add(new Question(
    sharedStimulus,
    "The logic of the quotation is most consistent with",
    tempAnswers,
    "B"
));

sharedStimulus = "Occupations of Gainfully Employed Irish Immigrants in New York, 1855\n" +
"Occupation                               # Irish-born (% of total)\n" +
"SKILLED\n" +
"Bakers                                   861 (23)\n" +
"Blacksmiths                              1,339 (50)\n" +
"Brewers/Distillers                       52 (14)\n" +
"Carpenters                               2,230 (30)\n" +
"Dressmaker/Seamstress                    4,559 (46)\n" +
"Ironworkers                              150 (56)\n" +
"Machinists                               398 (23)\n" +
"Mason/Bricklayer                         2,203 (61)\n" +
"Merchants                                278 (4)\n" +
"Policemen                                292 (25)\n" +
"Printers                                 519 (25)\n" +
"Retail shopkeepers                       916 (35)\n" +
"Shoemakers                               2,121 (31)\n" +
"Tailors                                  4,171 (33)\n" +
"Wine and liquor dealers                  891 (55)\n" +
"PROFESSIONALS\n" +
"Doctors                                  113 (8)\n" +
"Lawyers                                  40 (4)\n" +
"UNSKILLED\n" +
"Domestic Servants                        23,386 (74)\n" +
"Laundresses                              1,758 (69)\n" +
"Laborers                                 17,426 (86)\n" +
"Drivers/Hackmen/Coachmen                 805 (46)\n\n" +
"Source: Robert Ernst, *Immigrant Life in New York City, 1825–1863* and NY State Census of 1855 (1994)";

tempAnswers = new String[] {
    "A. Great Britain had recently begun using harsh tactics against Irish dissidents, leading to large numbers of dissidents fleeing Ireland.",
    "B. The Irish agriculture sector had recently undergone rapid mechanization, displacing a large percentage of the rural population of Ireland.",
    "C. A large-scale famine in Ireland, caused by the failure of the potato crop, had recently occurred, driving many Irish people to flee the country.",
    "D. New York State had recently passed a religious toleration act, creating a more welcoming atmosphere for Irish Catholic immigrants."
};
questionsP2.add(new Question(
    sharedStimulus,
    "Which of the following factors was an important cause of the immigration trend reflected in the chart?",
    tempAnswers,
    "C"
));

tempAnswers = new String[] {
    "A. Irish immigrants were quickly able to climb the economic ladder of New York City and gain employment in middle-class professions.",
    "B. Irish immigration to New York City in the period before the Civil War did not significantly alter the economic structure of the city.",
    "C. Irish workers played a prominent role in the union movement in New York City in the 1850s.",
    "D. Irish immigrants comprised a majority of the workers in low-paying, unskilled occupations in New York City by the 1850s."
};
questionsP2.add(new Question(
    sharedStimulus,
    "Which of the following conclusions is supported by the evidence in the chart?",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. The federal government implemented the National Origins Act, establishing a quota system to stem the flow of Irish immigrants into the United States.",
    "B. Congress rewrote naturalization laws in order to expand the number of years immigrants must live in the United States before they can attain citizenship and voting rights.",
    "C. The United States and Ireland reached an understanding that President Franklin Pierce would pressure New York State to end discriminatory practices against Irish immigrants, and that Ireland would pass legislation limiting immigration into the United States.",
    "D. A new political party, commonly called the Know-Nothing Party, attracted large numbers of voters in the 1850s with a strong anti-immigrant, anti-Catholic message."
};
questionsP2.add(new Question(
    sharedStimulus,
    "Which of the following describes a significant response to the development reflected in the chart?",
    tempAnswers,
    "D"
));
        // Period 3 (1865 - 1945)
    sharedStimulus = "\"Be it enacted by the Senate and House of Representatives of the United States of America in Congress assembled, " +
"That in all cases where any tribe or band of Indians has been, or shall hereafter be, located upon any reservation created for their use, " +
"either by treaty stipulation or by virtue of an act of Congress or executive order, the President of the United States [is] hereby " +
"authorized, whenever in his opinion any reservation or any part thereof of such Indians is advantageous for agricultural and grazing purposes, " +
"to cause said reservation, or any part thereof, to be surveyed … , and to allot the lands in said reservation in severalty [separate plots of land, " +
"individually owned] to any Indian located thereon in quantities as follows: ...\"\n\n" +
"—Dawes Severalty Act (excerpt), 1887";

tempAnswers = new String[] {
    "A. turn American Indians into property-owning, profit-oriented, individual farmers.",
    "B. keep alive traditional practices and languages.",
    "C. open up American Indian lands in Georgia, South Carolina, and Alabama to mining and cotton production.",
    "D. compensate American Indian tribes for lands that had been taken through fraudulent treaties."
};
questionsP3.add(new Question(
    sharedStimulus,
    "A primary goal of the Dawes Severalty Act (1887) was to",
    tempAnswers,
    "A"
));

tempAnswers = new String[] {
    "A. the Supreme Court decision in the case of Worcester v. Georgia.",
    "B. a nonviolent protest movement against existing policies led by Crazy Horse.",
    "C. the success of the Freedmen's Bureau in addressing the problems of African Americans in the South.",
    "D. the depiction of mistreatment of American Indians in Helen Hunt Jackson's book, *A Century of Dishonor*."
};
questionsP3.add(new Question(
    sharedStimulus,
    "An important impetus for the passage of the Dawes Severalty Act was",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. The formation of the Ghost Dance movement.",
    "B. The establishment of Indian Boarding Schools.",
    "C. The passage of the Indian Reorganization Act.",
    "D. The founding of the American Indian Movement."
};
questionsP3.add(new Question(
    sharedStimulus,
    "Which of the following developments was similar to the Dawes Severalty Act in that they both had the same goal for the future of American Indians?",
    tempAnswers,
    "B"
));
sharedStimulus = "\"This book tells the story of how industrial workers in one American city made sense of an era in our recent history " +
"[the 1930s] when the nation moved from a commitment to welfare capitalism to a welfare state [and] from a determination to resist the " +
"organization of its industrial work force to tolerating it.\"\n\n" +
"—Lizabeth Cohen, *Making a New Deal: Industrial Workers in Chicago, 1919–1939*, 1990";

tempAnswers = new String[] {
    "A. changes in the composition of the Supreme Court.",
    "B. an increase in the power of local and state governments.",
    "C. a renewed commitment to a laissez-faire approach to economic policy.",
    "D. an expansion to the powers of the federal government."
};
questionsP3.add(new Question(
    sharedStimulus,
    "The changes described in the excerpt could best be attributed to",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. Political radicals, such as members of the Communist Party.",
    "B. Organizations advocating on behalf of senior citizens.",
    "C. Civil rights organizations such as the Congress of Racial Equality.",
    "D. Conservatives in Congress and on the Supreme Court."
};
questionsP3.add(new Question(
    sharedStimulus,
    "Which of the following most strongly sought to limit or reverse the changes described in the excerpt?",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. Senator Joseph McCarthy and the anti-communist crusade of the 1950s.",
    "B. the \"Great Society\" agenda of President Lyndon Johnson in the 1960s.",
    "C. the domestic agenda of President Ronald Reagan in the 1980s.",
    "D. Representative Newt Gingrich and the \"Contract with America\" in the 1990s."
};
questionsP3.add(new Question(
    sharedStimulus,
    "The changes described in the excerpt were later reinforced by initiatives associated with",
    tempAnswers,
    "B"
));
sharedStimulus = "\"To cast this case into outlines of racial prejudice, without reference to the real military dangers which were presented, " +
"merely confuses the issue. Korematsu was not excluded from the Military Area because of hostility to him or his race. He was excluded because we are at war " +
"with the Japanese Empire, because the properly constituted military authorities feared an invasion of our West Coast and felt constrained to take proper " +
"security measures, because they decided that the military urgency of the situation demanded that all citizens of Japanese ancestry be segregated from the " +
"West Coast temporarily, and, finally, because Congress, reposing its confidence in this time of war in our military leaders—as inevitably it must—determined " +
"that they should have the power to do just this.\"\n\n" +
"—Justice Hugo Black, writing for the majority opinion of the United States Supreme Court in *Korematsu v. United States*, 1944";

tempAnswers = new String[] {
    "A. Decisions allowing for \"separate but equal\" public facilities, such as Plessy v. Ferguson.",
    "B. Decisions limiting the powers of the executive branch, such as Schechter Poultry Corp. v. United States.",
    "C. Decisions limiting the citizenship rights of certain groups, such as Dred Scott v. Sanford.",
    "D. Decisions limiting civil liberties during times of national emergency, such as Schenck v. United States."
};
questionsP3.add(new Question(
    sharedStimulus,
    "The idea expressed in the excerpt demonstrates continuity with which of the following earlier Supreme Court decisions?",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. The United States military was forced to compensate Japanese Americans for land they had lost during World War II.",
    "B. The United States military was forced to close detention centers for Italian Americans and German Americans who had been living in east coast cities and towns.",
    "C. The United States military was permitted to keep over 100,000 Japanese Americans in internment centers for the duration of World War II.",
    "D. President Franklin D. Roosevelt introduced a proposal to add additional members to the Supreme Court."
};
questionsP3.add(new Question(
    sharedStimulus,
    "Which of the following was the most immediate result of the decision excerpted?",
    tempAnswers,
    "C"
));
sharedStimulus = "\"I am but one of many victims of Rockefeller's colossal combination,\" said Mr. [George] Rice, \"and my story is not essentially different from the rest. . . . " +
"I established what was known as the Ohio Oil Works. . . . I found to my surprise at first, though I afterward understood it perfectly, that the Standard Oil Company was offering " +
"the same quality of oil at much lower prices than I could do—from one to three cents a gallon less than I could possibly sell it for.\n\n" +
"I sought for the reason and found that the railroads were in league with the Standard Oil concern at every point, giving it discriminating rates and privileges of all kinds as against myself and all outside competitors.\"\n\n" +
"Said by George Rice, \"How I Was Ruined by Rockefeller,\" *New York World*, October 16, 1898";

tempAnswers = new String[] {
    "A. global distribution.",
    "B. horizontal integration.",
    "C. regional planning.",
    "D. vertical consolidation."
};
questionsP3.add(new Question(
    sharedStimulus,
    "The business model described by George Rice could best be described as",
    tempAnswers,
    "B"
));

tempAnswers = new String[] {
    "A. were frequently approved by Congress but were stymied by presidential vetoes.",
    "B. were largely successful, as a coalition of reformers, political leaders, and labor leaders collaborated on realigning the American economy.",
    "C. were discussed by radical groups but were rejected by the vast majority of Americans as communistic and 'anti-American.'",
    "D. were often hindered by Supreme Court decisions that upheld the rights of business to operate without excessive government regulation."
};
questionsP3.add(new Question(
    sharedStimulus,
    "Attempts to rein in the power of corporations, such as the Standard Oil Company, in the 1890s and 1900s",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. Herbert Spencer and the ideas of social Darwinism.",
    "B. Henry George's proposal for a 'single tax' on land.",
    "C. the Omaha Platform of the Populist Platform.",
    "D. Upton Sinclair's novel, *The Jungle*."
};
questionsP3.add(new Question(
    sharedStimulus,
    "Defenders of corporate actions, such as the ones described in the passage above, would find support in",
    tempAnswers,
    "A"
));




System.out.println(questionsP3.get(questionsP3.size()-1));
System.out.println(questionsP3.size());

        // period 4 (1945 - present)
sharedStimulus = "\"The pursuit of this widened war has narrowed domestic welfare programs, making the poor, white and Negro, bear the heaviest burdens both at the front and at home. . . . " +
"It is estimated that we spend $322,000 for each enemy we kill, while we spend in the so-called war on poverty in America only about $53.00 for each person classified as 'poor.' . . . " +
"We have escalated the war in Viet Nam and deescalated the skirmish against poverty. It challenges the imagination to contemplate what lives we could transform if we were to cease killing.\"\n\n" +
"by Martin Luther King, Jr., speech, \"The Casualties of War in Vietnam,\" 1967";

tempAnswers = new String[] {
    "A. The refusal of the federal government to desegregate the military.",
    "B. The failure of the Great Society to significantly reduce poverty in the United States.",
    "C. The focus of the Republican Party on international issues at the expense of domestic issues.",
    "D. Frustrations over the inability of the civil rights movement to persuade Congress to pass meaningful civil rights legislation."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The speech was written most directly in response to which of the following",
    tempAnswers,
    "B"
));

tempAnswers = new String[] {
    "A. The growth of the antiwar movement in the 1960s as the Vietnam War escalated.",
    "B. The refusal of protest movements in the 1960s to draw connections between economic and foreign policy issues.",
    "C. The success of anticommunist propaganda in silencing opposition to government policies.",
    "D. The shift in tactics of the civil rights movement from civil disobedience to violent resistance."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The excerpt reflects which of the following trends",
    tempAnswers,
    "A"
));
sharedStimulus = "\"[As] Members of the House of Representatives and as citizens seeking to join that body we propose not just to change its policies, but even more important, to restore the bonds of trust between the people and their elected representatives.\n\n" +
"That is why in this era of official evasion and posturing, we offer instead a detailed agenda for national renewal, a written commitment with no fine print.\n\n" +
"This year's election offers the chance, after four decades of one-party control, to bring to the House a new majority that will transform the way Congress works. That historic change would be the end of government that is too big, too intrusive, and too easy with the public's money. It can be the beginning of a Congress that respects the values and shares the faith of the American family.\n\n" +
"To restore accountability to Congress. To end its cycle of scandal and disgrace. To make us all proud again of the way free people govern themselves.\"\n\n" +
"According to the authors of the 'Contract with America,' 1994";

tempAnswers = new String[] {
    "A. The growth and influence of the conservative movement in the United States in the 1980s and 1990s.",
    "B. The ability of the Democratic Party and the Republican Party to forge alliances in the 1980s and 1990s.",
    "C. The importance of \"third-party\" movements in terms of shaping political debate in the United States in the 1980s and 1990s.",
    "D. The growing importance of social and religious issues, such as gay marriage and abortion, in public discourse."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The writing of the \"Contract with America,\" excerpted, demonstrates which of the following",
    tempAnswers,
    "A"
));

tempAnswers = new String[] {
    "A. The Republican Party experienced electoral setbacks, being shut out from control of the House of Representatives, the Senate, and the White House for the decade after the Contract with America appeared.",
    "B. The Republican Party was able to roll back or eliminate key elements of the Great Society agenda of President Lyndon Johnson.",
    "C. Although Republicans continued to denounce \"big government,\" the size and scope of the federal government continued to grow in the 1990s, as many programs remained popular with voters and difficult to reform or eliminate.",
    "D. Many Congressional Republicans quit the Republican Party and joined the Democratic Party in protest of the divisive tone of the Contract with America."
};
questionsP4.add(new Question(
    sharedStimulus,
    "Which of the following generalizations is illustrated by the impact of the Contract with America",
    tempAnswers,
    "C"
));
sharedStimulus = "\"As citizens of global society, recognizing that the World Trade Organization is unjustly dominated by corporate interests and run for the enrichment of the few at the expense of all others, we demand:\n\n" +
"Representatives from all sectors of society must be included in all levels of trade policy formulations. All global citizens must be democratically represented in the formulation, implementation, and evaluation of all global social and economic policies.\n\n" +
"Global trade and investment must not be ends in themselves, but rather the instruments for achieving equitable and sustainable development including protection for workers and the environment.\n\n" +
"Global trade agreements must not undermine the ability of each nation-state or local community to meet its citizens' social, environmental, cultural or economic needs.\n\n" +
"The World Trade Organization must be replaced by a democratic and transparent body accountable to citizens, not to corporations.\"\n\n" +
"—According to Global Exchange (Seattle), in their \"Declaration for Global Democracy,\" 1999";

tempAnswers = new String[] {
    "A. Opposition to free trade agreements in the late twentieth century.",
    "B. Concerns about punitive steps taken by the United States government as part of the war on international terrorism.",
    "C. The desire of Congressional leaders to expand global trade and to reduce trade barriers.",
    "D. Fears that environmental regulations will impinge upon economic growth."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The \"Declaration for Global Democracy,\" excerpted, reflects",
    tempAnswers,
    "A"
));

tempAnswers = new String[] {
    "A. President Woodrow Wilson's \"Fourteen Points\" document (1918).",
    "B. Agreements at the Bretton Woods (New Hampshire) Conference (1944) that led to the formation of the International Monetary Fund.",
    "C. New Left critiques of the Vietnam War in the 1960s.",
    "D. The Republican Party's \"Contract for America\" (1994)."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The political sentiments reflected in the \"Declaration for Global Democracy,\" are most similar to which of the following",
    tempAnswers,
    "C"
));
sharedStimulus = "\"Now I am going to tell you how we are not going to fight communism. We are not going to transform our fine FBI into a Gestapo secret police. That is what some people would like to do. We are not going to try to control what our people read and say and think. We are not going to turn the United States into a right-wing totalitarian country in order to deal with a left-wing totalitarian threat.\n\n" +
"In short, we are not going to end democracy. We are going to keep the Bill of Rights on the books.\"\n\n" +
"—President Harry Truman, Address at a Dinner of the Federal Bar Association, April 24, 1950";

tempAnswers = new String[] {
    "A. Fears over the spread of communism in Latin America, as outlined in the domino theory",
    "B. The interconnected geopolitical struggle between the United States and its bloc versus the Soviet Union and its bloc",
    "C. The supremacy of civilian rule in which democratically elected politicians, not generals, controlled U.S. policy",
    "D. The preservation of the Monroe Doctrine in the face of challenges not conceived of by the Founding Fathers"
};
questionsP4.add(new Question(
    sharedStimulus,
    "The Cuban Missile Crisis most directly reflected",
    tempAnswers,
    "B"
));

tempAnswers = new String[] {
    "A. The dissolution of the Soviet Union in December 1991",
    "B. The Pentagon Papers revealing that several administrations, including two McNamara served in, lied to Congress",
    "C. The rise of the People's Republic of China in the twenty-first century as a burgeoning superpower",
    "D. The development of the Strategic Defense Initiative (SDI), more popularly known as Star Wars"
};
questionsP4.add(new Question(
    sharedStimulus,
    "Most historians would argue that McNamara's analysis of the potential for nuclear war ceased to carry significant weight due to",
    tempAnswers,
    "A"
));
sharedStimulus = "\"You have heard arguments the other way. They are built on the old belief that 'East is East and West is West and never the twain shall meet;' that we have no business but business interests in Asia; that Europe, not the Far East, is really our proper sphere of interest; that our commitments in Asia are not worth the resources they require; that the ocean is vast, the cultures alien, the languages strange, and the races different; that these really are not our kind of people.\n\n" +
"But all of these arguments . . . have really been found wanting. They do not stand the test of geography—because we are bounded not by one, but by two oceans. And whether by aircraft or ship, by satellite or missile, the Pacific is as crossable as the Atlantic.\"\n\n" +
"—President Lyndon Johnson, Remarks on United States Asian Policy, July 12, 1966";

tempAnswers = new String[] {
    "A. The overthrow of Nikita Khrushchev by Leonid Brezhnev",
    "B. The Kennedy administration's invasion of Cuba at the Bay of Pigs",
    "C. Johnson's escalation of the Vietnam War in order to distance himself from the perceived weakness of the JFK administration",
    "D. The Nixon and Ford administrations' preference for détente over brinksmanship"
};
questionsP4.add(new Question(
    sharedStimulus,
    "The events related in the excerpt most directly foreshadowed which of the following developments?",
    tempAnswers,
    "D"
));

tempAnswers = new String[] {
    "A. The State Department had too much governmental authority.",
    "B. The impoverished were missing out on the postwar economic boom, making them vulnerable to communist recruitment.",
    "C. Known communists were feared to have infiltrated the government and to be directing American foreign policy.",
    "D. Despite America's affluence, the country was in danger of falling to communism."
};
questionsP4.add(new Question(
    sharedStimulus,
    "The excerpt best illustrates which of the following developments?",
    tempAnswers,
    "C"
));

tempAnswers = new String[] {
    "A. Potential economic recession",
    "B. Potential loss of individual civil liberties",
    "C. Potential loss of a free press",
    "D. Potential for another world war"
};
questionsP4.add(new Question(
    sharedStimulus,
    "Which of the following twenty-first century issues represents a continuation of the political issues of the 1950s?",
    tempAnswers,
    "B"
));




        //testing code below

        //questionsP1.add(new Question(null, tempAnswers, "A"));
        //questionsP1.get(questionsP1.size()-1).setSeconds(1);
        
        // int testererer = 12;

        // System.out.println("\n"+questionsP1.get(testererer)+"\n");
        // System.out.println("user input: ");
        // long startTime = System.currentTimeMillis();
        // Scanner testScanner = new Scanner(System.in);
        // String testInput = testScanner.nextLine();

        // long elapsedTime = System.currentTimeMillis() - startTime;
        // long elapsedSeconds = elapsedTime / 1000;
        // boolean correct = questionsP1.get(testererer).isCorrect(testInput);
        // boolean inTime = questionsP1.get(testererer).withinTime(elapsedSeconds);

        // System.out.println(elapsedSeconds + "s elapsed for you to answer\n");
        // questionsP1.get(testererer).result(elapsedSeconds, testInput);

        //sample segment of user attacking boss (what it could look like)
        //segment is the next 10 lines
        // System.out.println("\n"+questionsP1.get(1)+"\n");
        // System.out.println("user input: ");
        // long startTime = System.currentTimeMillis();
        // Scanner testScanner = new Scanner(System.in);
        // String testInput = testScanner.nextLine();
        // long elapsedTime = System.currentTimeMillis() - startTime;
        // long elapsedSeconds = elapsedTime / 1000;
        // boolean correct = Tools.booleanResult(questionsP1.get(1).isCorrect(testInput), questionsP1.get(1).withinTime(elapsedSeconds));
        // allen.attackBoss(rehan, correct);
        // System.out.println(rehan);
    }
}