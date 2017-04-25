<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment" />
    <g:set var="entityName" value="${message(code: 'slackSpec.label', default: 'SlackSpec')}" />
    <title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>
<body>
<div id="edit-slackSpec" class="content scaffold-edit" role="main">
    <h1>Edit Slack Configuration for
        <g:link controller="bot" action="show" id="${this.slackSpec.bot.id}">
            ${this.slackSpec.bot.name}
        </g:link>
    </h1>

    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <g:hasErrors bean="${this.slackSpec}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.slackSpec}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>

    <div class="row"><br/></div>

    <g:form resource="${this.slackSpec}" method="PUT">
        <g:hiddenField name="version" value="${this.slackSpec?.version}" />
        <div class="form-group row">
            <label for="platformName" class="col-sm-3 col-form-label">Platform</label>

            <div class="col-sm-9">
                <input name="platformName" class="form-control" type="text" id="platformName" value="${this.slackSpec.platformName}" readonly>
            </div>
        </div>
        <div class="form-group row">
            <label for="bot.id" class="col-sm-3 col-form-label">Bot</label>

            <div class="col-sm-9">
                <input name="bot.id" class="form-control" type="text" id="bot.id" value="${this.slackSpec.bot.id}" readonly>
            </div>
        </div>
        <div class="form-group row">
            <label for="userName" class="col-sm-3 col-form-label">User Name</label>

            <div class="col-sm-9">
                <input name="userName" class="form-control" type="text" id="userName" value="${this.slackSpec.userName}" >
            </div>
        </div>
        <div class="form-group row">
            <label for="accessToken" class="col-sm-3 col-form-label">Access Token</label>

            <div class="col-sm-9">
                <input name="accessToken" class="form-control" type="text" id="accessToken" value="${this.slackSpec.accessToken}" >
            </div>
        </div>
        <div class="form-group row">
            <label for="clientId" class="col-sm-3 col-form-label">Client Id</label>

            <div class="col-sm-9">
                <input name="clientId" class="form-control" type="text" id="clientId" value="${this.slackSpec.clientId}" >
            </div>
        </div>
        <div class="form-group row">
            <label for="clientSecret" class="col-sm-3 col-form-label">Client Secret</label>

            <div class="col-sm-9">
                <input name="clientSecret" class="form-control" type="text" id="clientSecret" value="${this.slackSpec.clientSecret}" >
            </div>
        </div>

        <div class="row"><br/></div>

        <fieldset class="buttons">
            <input class="save btn btn-info" type="submit" value="${message(code: 'default.button.update.label', default: 'Update')}" />
        </fieldset>
    </g:form>
</div>
</body>
</html>
