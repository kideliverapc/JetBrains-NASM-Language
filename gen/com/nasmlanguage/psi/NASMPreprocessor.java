// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMPreprocessor extends PsiElement {

  @Nullable
  NASMAssign getAssign();

  @Nullable
  NASMConditional getConditional();

  @Nullable
  NASMDefine getDefine();

  @Nullable
  NASMError getError();

  @NotNull
  List<NASMExpr> getExprList();

  @Nullable
  NASMInclude getInclude();

  @Nullable
  NASMMacro getMacro();

  @Nullable
  NASMStrlen getStrlen();

  @Nullable
  NASMUndef getUndef();

  @Nullable
  PsiElement getPreprocessorOp();

}
