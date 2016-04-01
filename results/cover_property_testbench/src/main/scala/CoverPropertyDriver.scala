package ChiselDriver

import Chisel._
import CoveragePropertyDSL._

class ChiselDriver extends Module {
  val io = new Bundle { 
    val out = UInt(OUTPUT, 8)
  }
  val testWire = UInt(1)
  val a = new StartSequence(testWire === UInt(1))
  io.out := UInt(42)
}

class ChiselDriverTests(c: ChiselDriver) extends Tester(c) {
  step(1)
  expect(c.io.out, 42)
}

object ChiselDriver {
  def main(args: Array[String]): Unit = {
    val tutArgs = args.slice(1, args.length)
    CoverProperty.testFunc()
    chiselMainTest(tutArgs, () => Module(new ChiselDriver())) {
      c => new ChiselDriverTests(c) }
  }
}
