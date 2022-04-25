// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiSchemaArgs Empty = new ApiSchemaArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    @Import(name="definitions")
    private @Nullable Output<Object> definitions;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    public Optional<Output<Object>> definitions() {
        return Optional.ofNullable(this.definitions);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="schemaId")
    private @Nullable Output<String> schemaId;

    /**
     * @return Schema identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> schemaId() {
        return Optional.ofNullable(this.schemaId);
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApiSchemaArgs() {}

    private ApiSchemaArgs(ApiSchemaArgs $) {
        this.apiId = $.apiId;
        this.contentType = $.contentType;
        this.definitions = $.definitions;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaId = $.schemaId;
        this.serviceName = $.serviceName;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiSchemaArgs $;

        public Builder() {
            $ = new ApiSchemaArgs();
        }

        public Builder(ApiSchemaArgs defaults) {
            $ = new ApiSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param contentType Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). &lt;/br&gt; - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` &lt;/br&gt; - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` &lt;/br&gt; - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` &lt;/br&gt; - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param definitions Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
         * 
         * @return builder
         * 
         */
        public Builder definitions(@Nullable Output<Object> definitions) {
            $.definitions = definitions;
            return this;
        }

        /**
         * @param definitions Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
         * 
         * @return builder
         * 
         */
        public Builder definitions(Object definitions) {
            return definitions(Output.of(definitions));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaId Schema identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(@Nullable Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        /**
         * @param schemaId Schema identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param value Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApiSchemaArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
