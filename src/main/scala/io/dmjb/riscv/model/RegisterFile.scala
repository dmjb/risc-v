package io.dmjb.riscv.model

trait RegisterFile

class DefaultRegisterFile extends RegisterFile {
  val regs: Array[Int] = new Array[Int](32)
  val pc: Long = 0L
}
