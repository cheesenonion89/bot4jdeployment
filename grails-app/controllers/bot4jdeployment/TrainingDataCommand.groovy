package bot4jdeployment

import grails.validation.Validateable
import org.springframework.web.multipart.MultipartFile

/**
 * Created by Markus on 20.04.2017.
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
