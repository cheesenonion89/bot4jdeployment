package bot4jdeployment

abstract class PlatformSpec {

    String platformName;
    String accessToken

    static belongsTo = [bot:Bot]

    static constraints = {
        platformName editable : false
    }
}
