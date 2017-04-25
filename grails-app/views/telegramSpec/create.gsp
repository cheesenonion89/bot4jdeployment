<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment"/>
    <g:set var="entityName" value="${message(code: 'telegramSpec.label', default: 'TelegramSpec')}"/>
    <title><g:message code="default.create.label" args="[entityName]"/></title>
</head>

<body>
<div id="create-telegramSpec" class="content scaffold-create" role="main">
    <h1>Add a new Telegram Configuration for
        <g:link controller="bot" action="show" id="${this.telegramSpec.bot.id}">
            ${this.telegramSpec.bot.name}
        </g:link>
    </h1>

    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <g:hasErrors bean="${this.telegramSpec}">
        <ul class="errors" role="alert">
            <g:eachError bean="${this.telegramSpec}" var="error">
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
                       value="${this.telegramSpec.platformName}" readonly>
            </div>
        </div>

        <div class="form-group row">
            <label for="bot.id" class="col-sm-3 col-form-label">Bot</label>

            <div class="col-sm-9">
                <input name="bot" class="form-control" type="text" id="bot.id" value="${this.telegramSpec.bot.id}"
                       readonly>
            </div>
        </div>

        <div class="form-group row">
            <label for="accessToken" class="col-sm-3 col-form-label">Access Token</label>

            <div class="col-sm-9">
                <input name="accessToken" class="form-control" type="text" id="accessToken">
            </div>
        </div>

        <div class="form-group row">
            <label for="webhookUrl" class="col-sm-3 col-form-label">Webhook URL</label>

            <div class="col-sm-9">
                <input name="webhookUrl" class="form-control" type="text" id="webhookUrl">
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
