package com.scala.study.packageTest

package launch {
  class Booster3
}

package bobsrocket {
  package navigation {
    package launch {
      class Booster1
    }
    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new _root_.com.scala.study.packageTest.bobsrocket.launch.Booster2
      val booster3 = new _root_.com.scala.study.packageTest.launch.Booster3
    }
  }
  package launch {
    class Booster2
  }
}
