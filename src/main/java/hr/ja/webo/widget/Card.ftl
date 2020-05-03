<#-- @ftlvariable name="model" type="hr.ja.webo.widget.Card" -->
<div class="card card-primary card-outline">
    <div class="card-header">
        <h5 class="m-0">${ model.header.html()}</h5>
    </div>
    <div class="card-body">
        <#if model.body?? >
            ${model.body.html()}
        </#if>
        <@test />
    </div>
    <div class="card-footer">
    </div>
</div>