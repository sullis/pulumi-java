// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiSchemaArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema Contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiSchema ec12520d-9d48-4e7b-8f39-698ca2ac63f1 /subscriptions/subid/resourcegroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/59d6bb8f1f7fab13dc67ec9b/schemas/ec12520d-9d48-4e7b-8f39-698ca2ac63f1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiSchema")
public class ApiSchema extends io.pulumi.resources.CustomResource {
    /**
     * Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). </br> - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` </br> - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` </br> - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` </br> - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). </br> - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` </br> - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` </br> - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` </br> - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    @OutputExport(name="definitions", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> definitions;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    public Output</* @Nullable */ Object> getDefinitions() {
        return this.definitions;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiSchema(String name, ApiSchemaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, args == null ? ApiSchemaArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiSchema(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiSchema", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiSchema").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiSchema").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiSchema get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiSchema(name, id, options);
    }
}
