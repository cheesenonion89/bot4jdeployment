<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="bot4jdeployment"/>
    <g:set var="entityName" value="${message(code: 'bot.label', default: 'Bot')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>
<div id="show-bot" class="content scaffold-show" role="main">
    <h3>${this.bot.name} Details</h3>
    <g:if test="${flash.message}">
        <div class="message alert alert-info" role="status">${flash.message}</div>
    </g:if>
<!--<f:display bean="bot"/>-->
    <div class="row">
        <div class="col-sm-3">
            <b>Name:</b>
        </div>

        <div class="col-sm-9">
            ${this.bot.name}
        </div>

        <div class="col-sm-3">
            <b>Deployment Destination:</b>
        </div>

        <div class="col-sm-9">
            ${this.bot.deploymentDestination}
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-12">

            <g:form resource="${this.bot}" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="uploadTrainingData btn btn-info" action="uploadTrainingData"
                            resource="${this.bot}">Upload Training Data...</g:link>
                </fieldset>
            </g:form>
        </div>
    </div>

    <div class="row"><br/></div>

    <div class="row">
        <div class="col-sm-12">
            <g:form resource="${this.bot}" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="edit btn btn-info" action="edit" resource="${this.bot}"><g:message
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
