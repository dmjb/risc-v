package io.dmjb.riscv.instructions

import io.dmjb.riscv.model.State

sealed trait Instruction {
  def execute(state: State): State
}

case class LoadByte(rs1: Int, imm: Int, rd: Int) extends IFormat with Instruction {
  override def execute(state: State): State = {
    
  }
}

case class LoadHalfword() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class LoadWord() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class LoadByteUnsigned() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class LoadHalfUnsigned() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class StoreByte() extends SFormat with Instruction {
  override def execute(state: State): State = ???
}

case class StoreHalfword() extends SFormat with Instruction {
  override def execute(state: State): State = ???
}

case class StoreWord() extends SFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftLeft() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftLeftImmediate() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftRight() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftRightImmediate() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftRightArithmetic() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ShiftRightArithImm() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class Add() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class AddImmediate() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class Subtract() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class LoadUpperImm() extends UFormat with Instruction {
  override def execute(state: State): State = ???
}

case class AddUpperImmToPc() extends UFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SetLt() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SetLtImmediate() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SetLtUnsigned() extends RFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SetLtImmUnsigned() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchEq() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchNe() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchLt() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchGte() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchLtUnsigned() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class BranchGteUnsigned() extends SBFormat with Instruction {
  override def execute(state: State): State = ???
}

case class JumpLink() extends UJFormat with Instruction {
  override def execute(state: State): State = ???
}

case class JumpLinkRegister() extends UJFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SynchThread() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SynchInstrData() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SystemCall() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class SystemBreak() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadCycle() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadCycleUpperHalf() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadTime() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadTimeUpperHalf() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadInstrRetired() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}

case class ReadInstrUpperHalf() extends IFormat with Instruction {
  override def execute(state: State): State = ???
}
