// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMSegmentAddress extends NASMExpr {

  @Nullable
  NASMLabelDef getLabelDef();

  @Nullable
  NASMLabelDefMacro getLabelDefMacro();

  @Nullable
  NASMMacroCall getMacroCall();

  @Nullable
  PsiElement getHexadecimal();

  @Nullable
  PsiElement getId();

  @Nullable
  PsiElement getLbl();

  @Nullable
  PsiElement getSegmentAddrL();

  @Nullable
  PsiElement getZeroes();

}
