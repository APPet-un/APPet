import grails.rest.RestfulController
import grails.transaction.Transactional
import org.springframework.web.multipart.MultipartHttpServletRequest
import org.springframework.web.multipart.commons.CommonsMultipartFile
import org.springframework.web.multipart.MultipartFile
import org.codehaus.groovy.grails.web.context.ServletContextHolder

class UploadController  extends RestfulController  {

    static allowedMethods = [save: "POST", delete: "DELETE", get:"GET"]

    static responseFormats = ['json', 'xml']


    FileUploadService fileUploadService



    @Transactional
    def save() {

        def avatarImage = request.getFile('file')
        if (!avatarImage.isEmpty())
        {
            def random = Math.abs(new Random().nextInt() % 100000000) + 1
            def fileName = "pet-" + (String) random
            def response = fileUploadService.uploadFile(avatarImage ,fileName, "petImages")
            render(status: 200, text: response)
        }
        else
        {
            render render(status: 503, text: 'Failed to update picture')

        }

    }


}
