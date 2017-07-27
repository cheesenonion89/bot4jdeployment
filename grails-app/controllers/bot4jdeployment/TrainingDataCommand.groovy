package bot4jdeployment

import grails.validation.Validateable
import org.springframework.web.multipart.MultipartFile

/*
 * Utility class to create a mulitpart file that can be sent to the CNN Server
 */
class TrainingDataCommand implements Validateable{
    MultipartFile trainingDataFile
    Long id
    Integer version

    static constraints = {
        trainingDataFile validator: { val, obj ->
            if(val == null || val.empty){
                return false
            }

            ['zip', 'rar', '7z', 'tar', 'gz'].any { extension ->
                val.originalFilename?.toLowerCase()?.endsWith(extension)
            }
        }
    }


}
