package bot4jdeployment

class BootStrap {

    def init = { servletContext ->
        def fbSpec = new FacebookSpec(accessToken: 'abc').save()
        def bot = new Bot(name: 'TestBot', deploymentDestination: 'http://test.destinati.on/testBot', platformSpecs: fbSpec).save()
        //bot.addToPlatformSpecs(fbSpec)
        bot.save()
    }
    def destroy = {
    }
}
