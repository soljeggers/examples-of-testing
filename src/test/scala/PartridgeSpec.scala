import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" must  {

    "return 'Lynn, I've pierced my foot on a spike!!'" in {
      Partridge.partridge(List.empty) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }

    "return 'Mine's a Pint!'" in {
      Partridge.partridge(List ("PearTree") ) mustEqual "Mine's a Pint!"
    }





  }
}
