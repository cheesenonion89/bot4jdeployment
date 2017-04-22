package bot4jdeployment

import grails.test.mixin.*
import spock.lang.*

@TestFor(TelegramSpecController)
@Mock(TelegramSpec)
class TelegramSpecControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null

        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
        assert false, "TODO: Provide a populateValidParams() implementation for this generated test suite"
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.telegramSpecList
            model.telegramSpecCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.telegramSpec!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def telegramSpec = new TelegramSpec()
            telegramSpec.validate()
            controller.save(telegramSpec)

        then:"The create view is rendered again with the correct model"
            model.telegramSpec!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            telegramSpec = new TelegramSpec(params)

            controller.save(telegramSpec)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/telegramSpec/show/1'
            controller.flash.message != null
            TelegramSpec.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def telegramSpec = new TelegramSpec(params)
            controller.show(telegramSpec)

        then:"A model is populated containing the domain instance"
            model.telegramSpec == telegramSpec
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def telegramSpec = new TelegramSpec(params)
            controller.edit(telegramSpec)

        then:"A model is populated containing the domain instance"
            model.telegramSpec == telegramSpec
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/telegramSpec/index'
            flash.message != null

        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def telegramSpec = new TelegramSpec()
            telegramSpec.validate()
            controller.update(telegramSpec)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.telegramSpec == telegramSpec

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            telegramSpec = new TelegramSpec(params).save(flush: true)
            controller.update(telegramSpec)

        then:"A redirect is issued to the show action"
            telegramSpec != null
            response.redirectedUrl == "/telegramSpec/show/$telegramSpec.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/telegramSpec/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def telegramSpec = new TelegramSpec(params).save(flush: true)

        then:"It exists"
            TelegramSpec.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(telegramSpec)

        then:"The instance is deleted"
            TelegramSpec.count() == 0
            response.redirectedUrl == '/telegramSpec/index'
            flash.message != null
    }
}
