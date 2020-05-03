<#-- @ftlvariable name="t" type="hr.ja.webo.form.TextBox" -->
<div class="form-group">
    <label for="${t.name}">Email address</label>
    <input type="text" class="form-control" id="${t.name}" name="${t.name}">
    <#if t.helpText?has_content>
        <small class="form-text text-muted">${t.helpText}</small>
    </#if>
</div>