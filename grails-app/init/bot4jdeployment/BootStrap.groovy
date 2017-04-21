package bot4jdeployment

class BootStrap {

    def init = { servletContext ->
        new Bot(name: 'TestBot', deploymentDestination: 'http://test.destinati.on/testBot').save()
    }
    def destroy = {
    }
}
