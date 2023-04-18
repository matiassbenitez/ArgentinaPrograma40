
package sator;

import Servicio.Utilidades;

public class Sator {

    public static void main(String[] args) {
        String [] db = {"aboya","aboyá","abran","abras","abrás","abría","acles","acoja","acojo","acres","actas","actos","actúo","acuna","acune","acuno","acuná","acuné","acunó","acuso","acusó","acuña","acuñe","acuño",
            "acuñá","acuñé","acuñó","afeas","afeás","afijo","aguda","agudo","alajú","Aland","albas","albos","alces","alcés","Aldea","aleja","alejá","algas","aliás","almas","alojo","alojá","alojó","altar","altas","altos","alías",
            "amina","aminá","ancas","andas","andes","andés","anear","anima","animo","animá","animó","aojar","aojas","aojos","aojás","apees","apeés","apoda","apodo","apodá","apodó","aptas","aptás","apuré","arces",
            "arcos","ardan","ardas","ardes","ardás","ardés","arias","arios","arlas","arlos","arlás","armes","armés","arpas","artes","Aruba","aruñe","aruño","aruñé","aruñó","aréis","asate","ascos","asees","aseos","asida",
            "asido","asiló","asiré","asnos","asolo","aspee","aspeé","aséis","asían","asías","atoja","atojo","atojá","atojó","autos","avale","avara","ayudá","azoté","aérea","añoro","añoró","babeo","bacán","bagas","bagás",
            "bajas","bajes","bajos","bajás","bajés","balas","bales","balás","balés","bares","barre","barrá","barré","basca","bascá","baste","bastá","basté","batas","bates","bateá","batás","batís","bayas","bañas","bañes",
            "Baños","baños","bañés","bebed","bebes","bebés","Benín","besen","beses","besos","besés","betas","bizco","bizcó","bodas","bogad","bogas","bogue","bogué","bogás","bojar","bojas","bojos","bojás","bolar",
            "bollá","bondi","bonos","borre","borré","boses","bosés","botad","botan","botas","boten","botes","botás","botés","boyas","boyás","bozos","bramo","bramó","Bruno","bruta","bruño","bruñó","bríos","bulas","bulos",
            "buscá","buscó","buses","Bután","cabrá","caceo","caces","cachó","cacés","cafés","cagas","cagás","cajas","calce","calcé","calcó","cales","callo","calló","calme","calmo","calmé","calmó","calés","campó","canas",
            "canes","canos","cansa","cansá","canta","cantó","capas","capen","capes","cappa","capta","capto","captá","captó","capás","capés","cargá","cargó","Carla","caros","casad","casan","casas","casca","cascá",
            "cascó","casen","cases","casos","casás","casés","Catar","catas","catás","cause","causé","cavas","cavos","cazad","cazan","cazas","cazos","caída","caído","cañas","cañeo","caños","cañás","cañís","cebos",
            "cedan","cedas","ceded","ceden","cedes","cedás","cedés","cefos","cejas","cejás","celes","Celia","celta","cenas","cepas","ceras","cercá","cercó","cerdo","ceros","cerrá","cerró","chefs","Chile","China","chiís",
            "chocó","chuzá","ciega","cimas","cimás","cines","citas","citás","clamo","clamó","Clara","clava","clavá","clavé","clavó","clubs","coces","cocés","codeo","codos","coged","cogen","coger","coges","cogés","cogía",
            "cojan","cojas","cojos","cojás","colas","coles","colma","colmá","colás","colón","coman","comas","combó","comed","comes","comás","comés","conos","copas","copos","copta","copás","coral","coras","Corea",
            "corea","coreá","corra","corre","corro","corré","corrí","corsa","cosas","coses","costó","cosás","cosés","coños","crasa","creas","crees","creme","cremo","cremé","cremó","creés","croar","cruje","críen","cubas",
            "cubos","cucas","cucos","cucás","cuida","cuide","cuidá","cuidé","culos","culta","cunas","cunás","cupos","cural","curas","curdo","cures","curio","curró","cursó","curás","curés","cuñas","cuñás","dados","dagas",
            "dance","dancé","dando","danos","Darío","datos","dañes","daños","dañés","debas","debed","deben","debes","debés","dedos","dejas","dejás","densa","deseo","dices","dijes","diles","divas","divos","doblé",
            "dolos","doman","domas","domes","domos","domás","domés","donan","donas","donen","dones","donás","donés","dores","doria","dorio","dotas","dotes","dotás","dotés","doñas","drunk","drupa","Dubai","Dubái",
            "dudan","dunas","dures","duros","durés","díver","dúhos","echas","eches","echos","echés","edita","editá","eleve","elevé","ellos","emana","emaná","emoji","emoyi","emula","emule","emulo","emulá","emulé",
            "emuló","emúes","enoja","enojo","enojá","entes","envío","erizo","errar","erres","errés","espiá","espía","estad","estas","euros","evita","evitá","expía","falle","fallé","falos","faltá","ferio","fetos","ficad","ficas",
            "ficás","fijas","fijás","filas","files","filás","filín","finco","fincó","fines","fique","fiqué","firmé","floto","focos","folia","foliá","folla","follo","folló","fomes","forcé","forme","formo","formá","formé","formó","fosos","fotos",
            "Frida","frita","fritá","frías","fugas","fugue","fugué","fugás","fumes","fumés","fúsil","Gabón","gafas","galas","Gales","Galia","galos","ganes","ganás","ganés","gases","gastó","gatos","genes","gerbo","Ghana",
            "gimen","gimes","giras","giros","girás","godas","godos","goles","gorda","gorra","grabe","grabé","grave","gravé","grite","gritá","grité","gritó","groar","grúas","gurús","güera","habas","habed","hablá","habrá",
            "habré","había","hacen","haces","hacha","hacés","hacía","hagan","hagas","hagás","Haití","halan","halas","hallo","hallá","halos","halás","harte","harán","harás","haría","hayan","hayas","hayás","heces",
            "hecha","hecho","hemos","hiero","higos","hijas","hijos","hilan","hilos","hinca","hinco","hincó","hipos","hitos","hoces","hocés","hojas","horne","horné","huera","huero","hunas","hunos","hurgo","husos",
            "ibais","ideas","ideás","iglús","India","infle","inflé","intis","iréis","irían","irías","isbas","islas","Ivana","Jabes","jadee","jadeo","jades","jadeé","Jairo","jalan","jalón","Japón","jefes","jemal","jemes","jerbo","jerga",
            "Jesús","jodas","jodes","jodás","jodés","jonia","joyas","joyel","jugos","jujeo","Julio","jures","jurés","Kabul","kanes","Kenia","kunas","kurda","labes","labia","labra","labre","labrá","labré","lacra","lacta","lactá",
            "lados","ladro","ladró","Lagos","lagos","lamas","lamen","lames","lamió","lamás","lamés","lancé","lapas","larga","latas","latás","laves","lavés","laxas","laxos","laxás","lazan","lazos","legas","legos","lejos","lemas",
            "lenta","levas","leves","levás","levés","leyes","leías","Libia","libia","libré","libró","licua","licuá","licúa","lides","limas","linda","liras","lises","locas","locha","locos","locus","logró","lomos","lores","loros","losas",
            "losás","loteo","lotes","lozas","luces","luche","lucho","luchá","luché","luchó","lulos","lunas","lusas","lusos","líber","Macao","maceo","magos","Maine","malas","males","malos","Malta","malís","mamas","mamás",
            "manas","manca","mancá","mancó","manda","mandó","mangó","manos","manás","mapas","marcó","mares","marro","Marín","masco","mascó","mases","masés","matas","mates","matás","matés","mayas",
            "mayás","mazos","mañas","meaba","mecen","meces","mecés","mediá","memes","menes","mentá","menés","menús","meras","merco","mercó","mermo","mermó","meros","merás","mesas","mesen","meses",
            "mesás","mesés","metas","metes","metás","mezas","mezás","micas","midas","midás","migro","miles","minas","mines","Minsk","minás","minés","miras","miren","mires","mirás","mirés","misad","misas","misma",
            "mista","mistá","misás","mitos","mitro","mitró","mocos","modas","modos","mofas","mofes","mofás","mofés","mojan","mojar","mojas","mojen","mojos","mojás","molas","moles","molás","molés","monas","monos",
            "monté","montó","mopas","moras","mores","moros","morro","morás","morés","Moscú","motas","motes","moved","mozas","moños","mucas","mucos","mudas","mudos","mudás","mueve","mugen","muges","mugid",
            "mugió","mugís","mujan","mujas","mulas","mulos","multe","multá","multé","muros","musas","musás","mutar","mutas","nabos","naces","nacés","nadas","nades","nadés","narre","narré","natas","natos","Nauru",
            "Naurú","naves","nazca","nazis","necia","necio","Nepal","netos","nexos","niños","nomos","notas","notes","notás","notés","nubes","nucas","nudas","nudos","nulas","nulos","Níger","obras","odias","odios","odiás",
            "odres","ogros","ollas","omaní","ombús","ondas","onzas","opera","operá","optas","optás","orbes","orcas","orden","oriná","ornan","ornee","orneé","ortos","oseas","oseás","osito","otras","ovulo","ovuló","oírte",
            "pacas","pacen","pacta","pactá","pactó","pacés","pagan","pague","pagué","pajas","pajes","palas","palme","palmá","palmé","palos","palpa","panes","papúa","papús","paras","parda","Pardo","paree","paren",
            "pares","pareé","parta","partí","parás","paría","París","parís","pasas","pasen","pases","paseó","pasás","pasés","patas","patea","pateá","patos","patés","pavos","pañal","pecas","peces","pecio","pedos","pegas",
            "pegue","pelis","pelos","penan","penas","penda","pende","penen","penes","pensá","pensé","penás","penés","peras","perdí","peros","pesad","pesas","pescá","pesen","peses","pesos","pesás","pesés","petas",
            "petos","petás","peáis","peñas","pican","picas","pichá","picos","picás","pidas","pides","pidás","pifie","pines","pipas","pisad","piscó","pises","pitan","pitos","pizco","pizcó","playá","plena","pleno","pobló","pocas",
            "pocos","podas","poded","poder","podes","podrá","podré","podás","podés","podía","polos","poned","ponen","poner","pones","ponga","ponés","ponía","porfa","poros","posas","posee","posen","poses","poseé",
            "posos","posás","posés","potos","poyas","poyás","pozos","Prada","prado","prevé","preña","preño","preñá","preñó","primó","probó","pueda","puede","puedo","pujan","pujas","pujen","pujás","pulen","pulsa",
            "pulsá","pumas","puras","purgá","puros","putas","Qatar","quede","quedé","queme","quemo","quemá","quemé","quemó","quepa","queré","quise","quiso","Quito","quito","quitó","rabeo","rabiá","rabos","rabón",
            "ralbe","ralbé","ramos","ranas","rapas","rapás","raras","raros","rasas","rasco","rascá","raspá","rasás","ratas","ratos","razas","razás","raéis","reces","recia","recio","recés","redes","regia","regía","reinó","rejas",
            "remas","remes","remos","remás","remés","renos","rento","rentá","rentó","reses","reste","resté","restó","retes","retos","retés","reyes","rezan","rezas","rezás","reíos","reúna","rices","rifas","rimas","rimen","rimes",
            "rimás","rimés","rinda","ritos","roban","robes","robés","rocas","rodas","rodás","rojas","rojos","roles","rolla","rollá","rolló","romas","romos","rompa","rompe","rompé","rondó","rones","rotas","rotos","rotás","royas",
            "royos","royás","rubís","rudos","rueis","rugen","ruges","rugió","rugís","rujan","rulos","runas","rusas","Rusia","rusos","rutas","ruéis","ruñas","ruñás","sabia","sabía","sacan","sacas","sacos","sacra","sacás","sajón",
            "sakes","saldó","salga","salgo","salgá","salgó","salta","saltá","saltó","salud","salva","salve","salvá","salvé","salvó","salís","Samoa","sanad","sanas","sanos","santa","sanás","sapos","saudí","sañas","sebos",
            "secan","sedad","sedan","sedas","seden","sedes","sedás","sedés","sentá","senté","sentó","sepas","sepás","seres","seria","seriá","serró","serán","serás","sería","setas","setos","sexos","señás","siega","siego",
            "sigan","Siria","siria","siseo","sitúo","soban","sobas","sobes","sobré","sobés","sogas","Solas","solas","soles","solos","solés","solía","somos","sonad","sonar","sondá","sonás","sopas","soplo","sopló","sopás",
            "sorbe","sorbé","soñad","soñar","soñás","soñés","subas","subes","sucia","sucre","sudan","sudar","sudas","sudes","Sudán","sudás","sudés","suela","suele","suena","suene","sueno","sueña","sueñe","sueño",
            "Suiza","suiza","sumas","sumás","supón","suras","sushi","sáxeo","súper","tabas","tabús","tacos","talas","tales","talás","talés","tapas","tapen","tapes","tapás","tapés","tardé","Tegus","Tejas","tejas","telas",
            "temas","temen","temes","temás","temés","tened","tenga","tengo","tenia","tensa","tensá","tensó","tenés","tenía","terca","tersa","terse","tersá","tersé","tersó","testo","testá","testó","tetar","tetas","tetás","Texas",
            "teñía","tiene","times","timés","tipos","tiras","tiros","tirás","tisús","titán","tocás","todas","todos","togas","togás","tomad","toman","tomas","tomes","tomás","tomés","Tonga","tonos","tonta","topas","topos","topás",
            "toqué","torpe","tosed","toses","traed","traen","traer","traes","tragá","trajo","tramá","trató","traés","traía","trinó","trocó","tronó","troté","tríos","tubos","Tulio","tumbá","tunas","tunás","tólar","Túnez","untes","unías",
            "urbes","urdas","Uribe","urnas","usaos","usate","uséis","uñoso","vacan","vacas","vados","vagas","vagos","vague","vagué","vagás","vales","valga","valgo","valsa","valse","valsá","valsé","valés","vamos","vanos",
            "vasca","vasos","vasta","vates","vayan","vayas","vayás","veces","vecés","vedas","velas","velen","veles","velos","velás","velés","vemos","venas","vendé","vengo","vengó","vente","venté","Verde","veros","verás",
            "vería","vetas","vetos","veían","veías","viajé","vidas","viene","viera","vigas","viles","vinos","vires","visco","viste","vivás","voces","volar","volví","volás","votad","votan","votar","votas","voten","votes","votos","votás",
            "votés","vudús","vídeo","wikis","wones","yates","yemas","Yemen","yendo","yenes","yesca","yogur","yugos","zacas","zarca","zares","zedas","zetas","zonas","zorro","zulús","zurda","zurro","ácida","ácido","ácima",
            "ácimo","áfila","áfilo","ámbar","ánima","ápoda","ápodo","árabe","árbol","árida","árido","ásate","ática","ático","átomo","átona","átono","áurea","áureo","ávara","ávaro","ávida","ávido","Ébola","émula","émulo",
            "épale","épica","épico","época","ética","ético","éxito","ícono","ígnea","ígneo","ñames","ñatas","ñatos","ñutas","ñutos","ñutás","óbolo","ócrea","ópera","ópimo","órale","óseas","óseos","ótica","ótico","óvida","óvido",
            "óvolo","újule","única","único","úrica","úrico","úsate","úsese"};
        
        //dar vuelta palabra
        //buscar palabra y agregarla en otro array
        String palabra = "Hola";
        System.out.println(Utilidades.invertir(palabra));
    }

}
