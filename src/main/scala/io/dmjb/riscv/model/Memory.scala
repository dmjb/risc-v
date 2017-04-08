package io.dmjb.riscv.model

trait Memory

class DefaultMemory extends Memory {
  val addr: Array[Byte] = new Array[Byte](1024 * 1024)
}
