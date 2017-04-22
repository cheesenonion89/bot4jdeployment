package bot4jdeployment

class Bot {

    String name
    String deploymentDestination

    static hasMany = [platformSpecs : PlatformSpec]

    static constraints = {
    }
}
