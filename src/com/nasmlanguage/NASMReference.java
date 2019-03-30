package com.nasmlanguage;

import com.intellij.codeInsight.lookup.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.nasmlanguage.psi.NASMDefine;
import com.nasmlanguage.psi.NASMDirective;
import com.nasmlanguage.psi.NASMIdentifier;
import com.nasmlanguage.psi.NASMLabel;
import org.jetbrains.annotations.*;

import java.util.*;

public class NASMReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String id;

    public NASMReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        id = element.getText();
    }

    public NASMReference(@NotNull PsiElement element) {
        super(element);
        id = element.getText();
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        // Project project = myElement.getProject();
        PsiFile file = myElement.getContainingFile();
        final List<NASMIdentifier> identifiers = NASMUtil.findIdentifierReferencesByString(file, id);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (NASMIdentifier identifier : identifiers) {
            if (identifier.getParent() instanceof NASMLabel)
                results.add(new PsiElementResolveResult(identifier));
            if (identifier.getParent() instanceof NASMDefine)
                results.add(new PsiElementResolveResult(identifier));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        List<NASMIdentifier> identifiers = NASMUtil.findIdentifierReferencesInProject(myElement.getProject());
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final NASMIdentifier identifier : identifiers) {
            String identifierText = identifier.getId().getText();
            if (identifierText != null && identifierText.length() > 0) {
                variants.add(LookupElementBuilder.create(identifier.getId()).
                        withIcon(NASMIcons.ASM_FILE).
                        withTypeText(identifier.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }

    @Override
    public TextRange getRangeInElement() {
        return TextRange.from(0, getElement().getTextLength());
    }

}
