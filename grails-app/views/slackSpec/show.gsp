<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment" />
    <g:set var="entityName" value="${message(code: 'slackSpec.label', default: 'SlackSpec')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>

<div id="show-slackSpec" class="content scaffold-show" role="main">
    <h1>Slack Configuration for
        <g:link controller="bot" action="show" id="${this.slackSpec.bot.id}">
            ${this.slackSpec.bot.name}
        </g:link>
    </h1>

    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <div class="row">
        <div class="col-sm-3">
            <b>Platform:</b>
        </div>

        <div class="col-sm-9">
            ${this.slackSpec.platformName}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-3">
            <b>Username:</b>
        </div>

        <div class="col-sm-9">
            ${this.slackSpec.userName}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-3">
            <b>Access Token:</b>
        </div>

        <div class="col-sm-9">
            ${this.slackSpec.accessToken}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-3">
            <b>Client ID:</b>
        </div>

        <div class="col-sm-9">
            ${this.slackSpec.clientId}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-3">
            <b>Client Secret:</b>
        </div>

        <div class="col-sm-9">
            ${this.slackSpec.clientSecret}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-12">
            <g:form resource="${this.slackSpec}" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="edit btn btn-info" action="edit" resource="${this.slackSpec}"><g:message
                            code="default.button.edit.label" default="Edit" role="button"/></g:link>
                    <input class="delete btn btn-danger" type="submit"
                           value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                           onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/>
                </fieldset>
            </g:form>
        </div>
    </div>
</div>
</body>
</html>
