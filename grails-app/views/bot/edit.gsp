<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment"/>
    <g:set var="entityName" value="${message(code: 'bot.label', default: 'Bot')}"/>
    <title><g:message code="default.edit.label" args="[entityName]"/></title>
</head>

<body>
<div id="edit-bot" class="content scaffold-edit" role="main">
    <h3><g:message code="default.edit.label" args="[entityName]"/></h3>
    <g:if test="${flash.message}">
        <div class="message alert alert-info" role="status">${flash.message}</div>
    </g:if>
    <g:hasErrors bean="${this.bot}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.bot}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
                        error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>
    <div class="row"><br/></div>

    <g:form resource="${this.bot}" method="PUT">
        <g:hiddenField name="version" value="${this.bot?.version}"/>
        <div class="form-group row">
            <label for="name" class="col-sm-3 col-form-label">Name</label>

            <div class="col-sm-9">
                <input name="name" class="form-control" type="text" id="name" value="${this.bot.name}">
            </div>
        </div>

        <div class="form-group row">
            <label for="deploymentDestination" class="col-sm-3 col-form-label">Deployment Destination</label>

            <div class="col-sm-9">
                <input name="deploymentDestination" class="form-control" type="text" id="deploymentDestination"
                       value="${this.bot.deploymentDestination}">
            </div>
        </div>
        <!--
        <fieldset class="form">
        <f:all bean="bot"/>
        </fieldset>-->

        <div class="row"><br/></div>

        <fieldset class="buttons">
            <input class="save btn btn-info" type="submit"
                   value="${message(code: 'default.button.update.label', default: 'Update')}"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>
