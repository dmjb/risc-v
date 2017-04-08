package io.dmjb.riscv.instructions

sealed trait InstructionFormat

trait RFormat extends InstructionFormat {
  def rs1: Int
  def rs2: Int
  def rd: Int
}

trait IFormat extends InstructionFormat {
  def rs1: Int
  def imm: Int
  def rd: Int
}

trait SFormat extends InstructionFormat {
  def rs1: Int
  def rs2: Int
  def imm: Int
}

trait UFormat extends InstructionFormat {
  def imm: Int
  def rd: Int
}

trait SBFormat extends InstructionFormat {
  def rs1: Int
  def rs2: Int
  def imm: Int
}

trait UJFormat extends InstructionFormat {
  def imm: Int
  def rd: Int
}

