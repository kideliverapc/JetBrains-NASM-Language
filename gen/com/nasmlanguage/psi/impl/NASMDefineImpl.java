// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.nasmlanguage.psi.NASMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.nasmlanguage.psi.*;

public class NASMDefineImpl extends ASTWrapperPsiElement implements NASMDefine {

  public NASMDefineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitDefine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMAddress getAddress() {
    return findChildByClass(NASMAddress.class);
  }

  @Override
  @NotNull
  public List<NASMMacroCall> getMacroCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMMacroCall.class);
  }

  @Override
  @NotNull
  public PsiElement getDefineTag() {
    return findNotNullChildByType(DEFINE_TAG);
  }

  public String getDefineIdentifier() {
    return NASMPsiImplUtil.getDefineIdentifier(this);
  }

}
