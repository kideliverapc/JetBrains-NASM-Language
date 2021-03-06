// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMConditional extends PsiElement {

  @NotNull
  List<NASMConstant> getConstantList();

  @NotNull
  List<NASMData> getDataList();

  @NotNull
  List<NASMDirective> getDirectiveList();

  @NotNull
  List<NASMExpr> getExprList();

  @NotNull
  List<NASMInstruction> getInstructionList();

  @NotNull
  List<NASMLabel> getLabelList();

  @NotNull
  List<NASMPreprocessor> getPreprocessorList();

  @NotNull
  List<NASMStructure> getStructureList();

  @NotNull
  PsiElement getEndifTag();

  @Nullable
  PsiElement getIfmacroTag();

  @Nullable
  PsiElement getIfTag();

  @Nullable
  PsiElement getRegister();

  @Nullable
  PsiElement getString();

}
