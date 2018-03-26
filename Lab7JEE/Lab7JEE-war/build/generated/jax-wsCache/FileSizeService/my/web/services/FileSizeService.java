
package my.web.services;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FileSizeService", targetNamespace = "http://services.web.my/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileSizeService {


    /**
     * 
     * @param fileContents
     * @return
     *     returns javax.xml.ws.Response<my.web.services.FileSizeResponse>
     */
    @WebMethod(operationName = "fileSize")
    @RequestWrapper(localName = "fileSize", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSize")
    @ResponseWrapper(localName = "fileSizeResponse", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSizeResponse")
    public Response<FileSizeResponse> fileSizeAsync(
        @WebParam(name = "fileContents", targetNamespace = "")
        byte[] fileContents);

    /**
     * 
     * @param fileContents
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "fileSize")
    @RequestWrapper(localName = "fileSize", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSize")
    @ResponseWrapper(localName = "fileSizeResponse", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSizeResponse")
    public Future<?> fileSizeAsync(
        @WebParam(name = "fileContents", targetNamespace = "")
        byte[] fileContents,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<FileSizeResponse> asyncHandler);

    /**
     * 
     * @param fileContents
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fileSize", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSize")
    @ResponseWrapper(localName = "fileSizeResponse", targetNamespace = "http://services.web.my/", className = "my.web.services.FileSizeResponse")
    @Action(input = "http://services.web.my/FileSizeService/fileSizeRequest", output = "http://services.web.my/FileSizeService/fileSizeResponse")
    public int fileSize(
        @WebParam(name = "fileContents", targetNamespace = "")
        byte[] fileContents);

}
