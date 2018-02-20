import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must {

    "return 'Lynn, I've pierced my foot on a spike!!' if empty list" in {
      Partridge.partridge(List.empty) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }

    "return 'Mine's a Pint!' if term matches" in {
      Partridge.partridge(List("PearTree")) mustEqual "Mine's a Pint!"
    }

    "return 'Lynn, I've pierced my foot on a spike!! if only incorrect terms in list" in {
      Partridge.partridge(List("Turkey")) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }

    "return 'Mine's a Pint!' If two terms match" in {
      Partridge.partridge(List("PearTree", "Toblerone")) mustEqual "Mine's a Pint!!"
    }
    "return' Mine's a Pint!!!!!!' If six terms match" in {
      Partridge.partridge(List("PearTree", "Chat", "Partridge","Dan", "Toblerone", "Lynn")) mustEqual "Mine's a Pint!!!!!!"
    }
  }
}