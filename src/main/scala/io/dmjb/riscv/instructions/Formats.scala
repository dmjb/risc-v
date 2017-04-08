package io.dmjb.riscv.instructions

sealed trait InstructionFormat

case class RFormat() extends InstructionFormat
case class IFormat() extends InstructionFormat
case class SFormat() extends InstructionFormat
case class UFormat() extends InstructionFormat
case class SBFormat() extends InstructionFormat
case class UJFormat() extends InstructionFormat

sealed trait State

sealed trait Instruction {
  //def execute(state: State): State
}

case class LoadByte() extends IFormat with Instruction
case class LoadHalfword() extends IFormat with Instruction
case class LoadWord() extends IFormat with Instruction
case class LoadByteUnsigned() extends IFormat with Instruction
case class LoadHalfUnsigned() extends IFormat with Instruction

case class StoreByte() extends SFormat with Instruction
case class StoreHalfword() extends SFormat with Instruction
case class StoreWord() extends SFormat with Instruction

case class ShiftLeft() extends RFormat with Instruction
case class ShiftLeftImmediate() extends IFormat with Instruction
case class ShiftRight() extends RFormat with Instruction
case class ShiftRightImmediate() extends IFormat with Instruction
case class ShiftRightArithmetic() extends RFormat with Instruction
case class ShiftRightArithImm() extends IFormat with Instruction

case class Add() extends RFormat with Instruction
case class AddImmediate() extends IFormat with Instruction
case class Subtract() extends RFormat with Instruction
case class LoadUpperImm() extends UFormat with Instruction
case class AddUpperImmToPc() extends UFormat with Instruction

case class SetLt() extends RFormat with Instruction
case class SetLtImmediate() extends IFormat with Instruction
case class SetLtUnsigned() extends RFormat with Instruction
case class SetLtImmUnsigned() extends IFormat with Instruction

case class BranchEq() extends SBFormat with Instruction
case class BranchNe() extends SBFormat with Instruction
case class BranchLt() extends SBFormat with Instruction
case class BranchGte() extends SBFormat with Instruction
case class BranchLtUnsigned() extends SBFormat with Instruction
case class BranchGteUnsigned() extends SBFormat with Instruction

case class JumpLink() extends UJFormat with Instruction
case class JumpLinkRegister() extends UJFormat with Instruction

case class SynchThread() extends IFormat with Instruction
case class SynchInstrData() extends IFormat with Instruction

case class SystemCall() extends IFormat with Instruction
case class SystemBreak() extends IFormat with Instruction

case class ReadCycle() extends IFormat with Instruction
case class ReadCycleUpperHalf() extends IFormat with Instruction
case class ReadTime() extends IFormat with Instruction
case class ReadTimeUpperHalf() extends IFormat with Instruction
case class ReadInstrRetired() extends IFormat with Instruction
case class ReadInstrUpperHalf() extends IFormat with Instruction
