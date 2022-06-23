/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "fake_classname_test", description = "the fake_classname_test API")
public interface FakeClassnameTestApi {

    default FakeClassnameTestApiDelegate getDelegate() {
        return new FakeClassnameTestApiDelegate() {};
    }

    /**
     * PATCH /fake_classname_test : To test class name in snake case
     * To test class name in snake case
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "testClassname",
        summary = "To test class name in snake case",
        tags = { "fake_classname_tags 123#$%^" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))
            })
        },
        security = {
            @SecurityRequirement(name = "api_key_query")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/fake_classname_test",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Client> testClassname(
        @Parameter(name = "body", description = "client model", required = true) @Valid @RequestBody Client body
    ) {
        return getDelegate().testClassname(body);
    }

}
