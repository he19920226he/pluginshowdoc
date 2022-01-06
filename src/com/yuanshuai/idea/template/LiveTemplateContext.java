package com.yuanshuai.idea.template;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class LiveTemplateContext extends TemplateContextType {

    protected LiveTemplateContext() {
        super("PHP", "php");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".php");
    }
}
