<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment"/>
    <g:set var="entityName" value="${message(code: 'slackSpec.label', default: 'SlackSpec')}"/>
    <title><g:message code="default.create.label" args="[entityName]"/></title>
</head>

<body>
<div id="create-slackSpec" class="content scaffold-create" role="main">
    <h1>Add a new Slack Configuration</h1>

    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <g:hasErrors bean="${this.slackSpec}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.slackSpec}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
                        error="${error}"/></li>
            </g:eachError>
        </ul>
    </g:hasErrors>

    <g:form action="save">
        <div class="form-group row">
            <label for="platformName" class="col-sm-3 col-form-label">Platform</label>

            <div class="col-sm-9">
                <input name="platformName" class="form-control" type="text" id="platformName"
                       value="${this.slackSpec.platformName}" readonly>
            </div>
        </div>

        <div class="form-group row">
            <label for="bot.id" class="col-sm-3 col-form-label">Bot</label>

            <div class="col-sm-9">
                <input name="bot" class="form-control" type="text" id="bot.id" value="${this.slackSpec.bot.id}"
                       readonly>
            </div>
        </div>

        <div class="form-group row">
            <label for="userName" class="col-sm-3 col-form-label">Username</label>

            <div class="col-sm-9">
                <input name="userName" class="form-control" type="text" id="userName">
            </div>
        </div>

        <div class="form-group row">
            <label for="accessToken" class="col-sm-3 col-form-label">Access Token</label>

            <div class="col-sm-9">
                <input name="accessToken" class="form-control" type="text" id="accessToken">
            </div>
        </div>

        <div class="form-group row">
            <label for="clientId" class="col-sm-3 col-form-label">Client ID</label>

            <div class="col-sm-9">
                <input name="clientId" class="form-control" type="text" id="clientId">
            </div>
        </div>

        <div class="form-group row">
            <label for="clientSecret" class="col-sm-3 col-form-label">Client Secret</label>

            <div class="col-sm-9">
                <input name="clientSecret" class="form-control" type="text" id="clientSecret">
            </div>
        </div>

        <fieldset class="buttons">
            <g:submitButton name="create" class="save btn"
                            value="${message(code: 'default.button.create.label', default: 'Create')}"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>
