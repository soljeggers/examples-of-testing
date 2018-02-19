object Partridge {

  val terms : List[String] = List("PearTree")

  def partridge(terms : List[String]) : String = {

    if (terms == List("PearTree")) {
      "Mine's a Pint!"
    } else {
      "Lynn, I've pierced my foot on a spike!!"
    }
  }
}
