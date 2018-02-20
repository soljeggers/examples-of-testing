object Cypher {

  def apply(input: String, key: Int): List[Int] = {

    val initialNumbers: List[Int] = input.map(char => letterToNumber(char)).toList

    val zipped = initialNumbers.zip(splitKeys(key))

    zipped.map(x => x._1 + x._2)

  }

  def letterToNumber(input: Char): Int = input.toInt - 96

  def splitKeys(key: Int): List[Int] =
    key.toString.map(x => x.asDigit).toList

  def expandKeys(keys: List[Int], length: Int): List[Int] = {
    val keyLength = keys.length

    val timesToRepeat = length / keyLength

    ???
  }
}