object Partridge {

  val input : List[String] = List("PearTree", "Chat", "Partridge","Dan", "Toblerone", "Lynn", "Alphapapa", "Nomad")
  val some = "Mine's a Pint!"
  val none = "Lynn, I've Pierced my foot on a spike!!"


  def partridge(terms : List[String]) : String =
    terms.count(x => input.contains(x)) match {
  case 0 => "Lynn, I've pierced my foot on a spike!!"
  case x => "Mine's a Pint" + "!" * x

  }
}



//
//    if (terms.exists(input.contains(_))) {
//      "Mine's a Pint!"
//    } else {
//      "Lynn, I've pierced my foot on a spike!!"
//    }
//  }

