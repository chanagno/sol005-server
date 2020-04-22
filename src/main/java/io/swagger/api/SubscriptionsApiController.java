package io.swagger.api;

import io.swagger.model.Body4;
import io.swagger.model.InlineResponse2002;
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
public class SubscriptionsApiController implements SubscriptionsApi {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SubscriptionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<InlineResponse2002>> subscriptionsGet(@ApiParam(value = "Version of the API requested to use when responding to this request. " ,required=true) @RequestHeader(value="Version", required=true) String version,@ApiParam(value = "Content-Types that are acceptable for the response. Reference: IETF RFC 7231 " ,required=true) @RequestHeader(value="Accept", required=true) String accept,@ApiParam(value = "The authorization token for the request. Reference: IETF RFC 7235. " ) @RequestHeader(value="Authorization", required=false) String authorization,@ApiParam(value = "Attribute-based filtering expression according to clause 5.2 of ETSI GS NFV SOL 013. The NFVO shall support receiving this filtering parameter as part of the URI query string. The OSS/BSS may supply this filtering parameter. All attribute names that appear in the PkgmSubscription and in data types referenced from it shall be supported by the NFVO in the filtering expression ") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "Marker to obtain the next page of a paged response. Shall be supported by the NFVO if the NFVO supports alternative 2 (paging) according to clause 5.4.2.1 of ETSI GS NFV-SOL 013 for this resource. ") @Valid @RequestParam(value = "nextpage_opaque_marker", required = false) String nextpageOpaqueMarker) {
        String a = request.getHeader("Accept");
        if (a != null && a.contains("application/json")) {
            try {
                return new ResponseEntity<List<InlineResponse2002>>(objectMapper.readValue("[ {  \"filter\" : {    \"vnfProductsFromProviders\" : [ {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    }, {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    } ],    \"notificationTypes\" : \"VnfPackageOnboardingNotification\"  },  \"_links\" : {    \"self\" : {      \"href\" : \"http://example.com/aeiou\"    }  },  \"callbackUri\" : \"http://example.com/aeiou\",  \"id\" : \"http://example.com/aeiou\"}, {  \"filter\" : {    \"vnfProductsFromProviders\" : [ {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    }, {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    } ],    \"notificationTypes\" : \"VnfPackageOnboardingNotification\"  },  \"_links\" : {    \"self\" : {      \"href\" : \"http://example.com/aeiou\"    }  },  \"callbackUri\" : \"http://example.com/aeiou\",  \"id\" : \"http://example.com/aeiou\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InlineResponse2002>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InlineResponse2002>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> subscriptionsPost(@ApiParam(value = "Version of the API requested to use when responding to this request. " ,required=true) @RequestHeader(value="Version", required=true) String version,@ApiParam(value = "Content-Types that are acceptable for the response. Reference: IETF RFC 7231 " ,required=true) @RequestHeader(value="Accept", required=true) String accept,@ApiParam(value = "The MIME type of the body of the request. Reference: IETF RFC 7231 " ,required=true) @RequestHeader(value="Content-Type", required=true) String contentType,@ApiParam(value = "Details of the subscription to be created. " ,required=true )  @Valid @RequestBody Body4 body,@ApiParam(value = "The authorization token for the request. Reference: IETF RFC 7235. " ) @RequestHeader(value="Authorization", required=false) String authorization) {
        String a = request.getHeader("Accept");
        if (a!= null && a.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{  \"filter\" : {    \"vnfProductsFromProviders\" : [ {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    }, {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    } ],    \"notificationTypes\" : \"VnfPackageOnboardingNotification\"  },  \"_links\" : {    \"self\" : {      \"href\" : \"http://example.com/aeiou\"    }  },  \"callbackUri\" : \"http://example.com/aeiou\",  \"id\" : \"http://example.com/aeiou\"}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> subscriptionsSubscriptionIdDelete(@ApiParam(value = "Identifier of this subscription. This identifier can be retrieved from the resource referenced by the \"Location\" HTTP header in the response to a POST request creating a new subscription resource. It can also be retrieved from the \"id\" attribute in the payload body of that response. ",required=true) @PathVariable("subscriptionId") String subscriptionId,@ApiParam(value = "Version of the API requested to use when responding to this request. " ,required=true) @RequestHeader(value="Version", required=true) String version,@ApiParam(value = "The authorization token for the request. Reference: IETF RFC 7235. " ) @RequestHeader(value="Authorization", required=false) String authorization) {
        String a = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2002> subscriptionsSubscriptionIdGet(@ApiParam(value = "Identifier of this subscription. This identifier can be retrieved from the resource referenced by the \"Location\" HTTP header in the response to a POST request creating a new subscription resource. It can also be retrieved from the \"id\" attribute in the payload body of that response. ",required=true) @PathVariable("subscriptionId") String subscriptionId,@ApiParam(value = "Version of the API requested to use when responding to this request. " ,required=true) @RequestHeader(value="Version", required=true) String version,@ApiParam(value = "Content-Types that are acceptable for the response. Reference: IETF RFC 7231 " ,required=true) @RequestHeader(value="Accept", required=true) String accept,@ApiParam(value = "The authorization token for the request. Reference: IETF RFC 7235. " ) @RequestHeader(value="Authorization", required=false) String authorization) {
        String a = request.getHeader("Accept");
        if (a != null && a.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{  \"filter\" : {    \"vnfProductsFromProviders\" : [ {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    }, {      \"vnfProducts\" : [ {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      }, {        \"vnfProductName\" : \"vnfProductName\",        \"versions\" : [ {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        }, {          \"vnfSoftwareVersion\" : \"vnfSoftwareVersion\",          \"vnfdVersions\" : [ \"vnfdVersions\", \"vnfdVersions\" ]        } ]      } ],      \"usageState\" : [ \"IN_USE\", \"IN_USE\" ],      \"vnfProvider\" : \"vnfProvider\",      \"vnfmInfo\" : [ \"vnfmInfo\", \"vnfmInfo\" ],      \"vnfPkgId\" : [ \"vnfPkgId\", \"vnfPkgId\" ],      \"vnfdId\" : [ \"vnfdId\", \"vnfdId\" ],      \"operationalState\" : [ \"ENABLED\", \"ENABLED\" ]    } ],    \"notificationTypes\" : \"VnfPackageOnboardingNotification\"  },  \"_links\" : {    \"self\" : {      \"href\" : \"http://example.com/aeiou\"    }  },  \"callbackUri\" : \"http://example.com/aeiou\",  \"id\" : \"http://example.com/aeiou\"}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

	@Override
	public ObjectMapper getObjectMapper() {
		// TODO Auto-generated method stub
		return null;
	}

}
