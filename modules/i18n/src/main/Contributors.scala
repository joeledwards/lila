package lila.i18n

private[i18n] object Contributors {

  val all = Map(
    "fr" -> List("Thibault Duplessis", "Calinou"),
    "ru" -> List("Nikita Milovanov", "Alex Bagirov"),
    "de" -> List("Patrick Gawliczek", "Kurt Keller (DE)"),
    "tr" -> List("Yakup Ipek", "Usolando"),
    "sr" -> List("Nenad Nikolić"),
    "lv" -> List("Anonymous"),
    "bs" -> List("Jacikka"),
    "da" -> List("Henrik Bjornskov", "Kurt Keller (DE)"),
    "es" -> List("FennecFoxz"),
    "ro" -> List("Cristian Niţă"),
    "it" -> List("Marco Barberis, Danilo Di Moia"),
    "fi" -> List("Juuso Vallius"),
    "uk" -> List("alterionisto"),
    "pt" -> List("Arthur Braz", "Eugênio Vázquez", "backdoorman"),
    "pl" -> List("M3n747", "Kurt Keller (DE)"),
    "nl" -> List("Kintaro"),
    "vi" -> List("Xiblack"),
    "sv" -> List("nizleib", "Kurt Keller (DE)", "RocketBabe"),
    "cs" -> List("Martin", "Claymes"),
    "sk" -> List("taiga", "Kurt Keller (DE)"),
    "hu" -> List("LTBakemono"),
    "ca" -> List("AI8"),
    "sl" -> List("Klemen Grm"),
    "az" -> List("elçin məmmədzadə", "amil isgəndərov"),
    "nn" -> List("Peropaal"),
    "eo" -> List("LaPingvino", "Timwi", "Ksobox3"),
    "tp" -> List("jan Mimoku"),
    "el" -> List("Tzortzakos Fivos", "Γιάννης Ανθυμίδης"),
    "fp" -> List("Alex"),
    "lt" -> List("Anonymous"),
    "nb" -> List("sundaune", "Tobias V. Langhoff"),
    "et" -> List("Anonymous"),
    "hy" -> List("Network.am"),
    "af" -> List("secreteagle"),
    "hi" -> List("Samarth Karia", "saksham", "ADG1089"),
    "ar" -> List("Ziad Dabash"),
    "zh" -> List("神爱", "Unihedron"),
    "gl" -> List("José Manuel Castroagudín Silva"),
    "hr" -> List("Betyárcsimbók", "Icosagon"),
    "mk" -> List("Давид и Стефан Тимовски"),
    "id" -> List("Night1301"),
    "ja" -> List("ネイサン　アイブス", "Unihedron"),
    "bg" -> List("Anonymous", "Пламен Димов."),
    "th" -> List("มาโนชญ์ สมศักดิ์"),
    "fa" -> List("saeid monajiane"),
    "he" -> List("Tangelo777", " Tornado"),
    "mr" -> List("Rahul"),
    "mn" -> List("Tsbarsaa", "mungunbayar"),
    "cy" -> List("cavejohnson"),
    "gd" -> List("GunChleoc"),
    "ga" -> List("Anonymous"),
    "sq" -> List("Indrit Bleta", "Xhevat Klaiqi"),
    "be" -> List("Palenik Siarhei"),
    "ka" -> List("Giorgi Javakhidze"),
    "sw" -> List("Anonymous"),
    "ps" -> List("Eimal Dorani"),
    "is" -> List("Sir Gizmo Gunn Myr Basque", "cyberpunk"),
    "kk" -> List("Arsakay Madi"),
    "io" -> List("Fabian Mokross"),
    "gu" -> List("Anonymous"),
    "fo" -> List("Anonymous"),
    "eu" -> List("Anonymous"),
    "bn" -> List("Ankit Peet"),
    "id" -> List("KenXeiko"),
    "la" -> List("3_1415maldaumen", "Orsi"),
    "jv" -> List("errorfilename"),
    "ky" -> List("tmed"),
    "pi" -> List("novalis78"),
    "as" -> List("BMDR-Tahmeed", "milwac"),
    "le" -> List("yPass.net", "Unihedron"),
    "ta" -> List("பெரியண்ணன் சந்திரசேகரன்"),
    "sa" -> List("संस्कृत"),
    "ml" -> List("സുദേവ് "),
    "kn" -> List("preetam"),
    "ko" -> List("Xnuk"),
    "mg" -> List("RAZAFIMAHEFA Aina"),
    "kb" -> List("skafis"),
    "zu" -> List("Dragon135"),
    "ur" -> List("alleey"),
    "yo" -> List("Mikhail04"),
    "tl" -> List("Curlaub"),
    "fy" -> List("FishingCat"),
    "jb" -> List("username05"))

  def apply(code: String): List[String] = ~(all get code)
}
