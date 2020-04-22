package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-01T18:31:17.078Z")

@Controller
public class ApiVersionsApiController implements ApiVersionsApi {

    private static final Logger log = LoggerFactory.getLogger(ApiVersionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiVersionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> apiVersionsGet(@ApiParam(value = "Version of the API requested to use when responding to this request. " ) @RequestHeader(value="Version", required=false) String version) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"apiVersions\" : [ {    \"isDeprecated\" : true,    \"retirementDate\" : \"\",    \"version\" : \"version\"  }, {    \"isDeprecated\" : true,    \"retirementDate\" : \"\",    \"version\" : \"version\"  } ],  \"uriPrefix\" : \"uriPrefix\"}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

	@Override
	public ObjectMapper getObjectMapper() {
		// TODO Auto-generated method stub
		return null;
	}

}
