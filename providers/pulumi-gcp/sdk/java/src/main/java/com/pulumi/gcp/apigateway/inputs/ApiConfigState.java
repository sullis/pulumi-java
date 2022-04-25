// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigGetArgs;
import com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConfigState extends com.pulumi.resources.ResourceArgs {

    public static final ApiConfigState Empty = new ApiConfigState();

    /**
     * The API to attach the config to.
     * 
     */
    @Import(name="api")
    private @Nullable Output<String> api;

    /**
     * @return The API to attach the config to.
     * 
     */
    public Optional<Output<String>> api() {
        return Optional.ofNullable(this.api);
    }

    /**
     * Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    @Import(name="apiConfigId")
    private @Nullable Output<String> apiConfigId;

    /**
     * @return Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    public Optional<Output<String>> apiConfigId() {
        return Optional.ofNullable(this.apiConfigId);
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    @Import(name="apiConfigIdPrefix")
    private @Nullable Output<String> apiConfigIdPrefix;

    /**
     * @return Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    public Optional<Output<String>> apiConfigIdPrefix() {
        return Optional.ofNullable(this.apiConfigIdPrefix);
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-visible name for the API.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    @Import(name="gatewayConfig")
    private @Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig;

    /**
     * @return Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    public Optional<Output<ApiConfigGatewayConfigGetArgs>> gatewayConfig() {
        return Optional.ofNullable(this.gatewayConfig);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource name of the API Config.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the API Config.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    @Import(name="openapiDocuments")
    private @Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments;

    /**
     * @return An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ApiConfigOpenapiDocumentGetArgs>>> openapiDocuments() {
        return Optional.ofNullable(this.openapiDocuments);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @Import(name="serviceConfigId")
    private @Nullable Output<String> serviceConfigId;

    /**
     * @return The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    public Optional<Output<String>> serviceConfigId() {
        return Optional.ofNullable(this.serviceConfigId);
    }

    private ApiConfigState() {}

    private ApiConfigState(ApiConfigState $) {
        this.api = $.api;
        this.apiConfigId = $.apiConfigId;
        this.apiConfigIdPrefix = $.apiConfigIdPrefix;
        this.displayName = $.displayName;
        this.gatewayConfig = $.gatewayConfig;
        this.labels = $.labels;
        this.name = $.name;
        this.openapiDocuments = $.openapiDocuments;
        this.project = $.project;
        this.serviceConfigId = $.serviceConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigState $;

        public Builder() {
            $ = new ApiConfigState();
        }

        public Builder(ApiConfigState defaults) {
            $ = new ApiConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param api The API to attach the config to.
         * 
         * @return builder
         * 
         */
        public Builder api(@Nullable Output<String> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api The API to attach the config to.
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            return api(Output.of(api));
        }

        /**
         * @param apiConfigId Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
         * 
         * @return builder
         * 
         */
        public Builder apiConfigId(@Nullable Output<String> apiConfigId) {
            $.apiConfigId = apiConfigId;
            return this;
        }

        /**
         * @param apiConfigId Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
         * 
         * @return builder
         * 
         */
        public Builder apiConfigId(String apiConfigId) {
            return apiConfigId(Output.of(apiConfigId));
        }

        /**
         * @param apiConfigIdPrefix Creates a unique name beginning with the
         * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
         * 
         * @return builder
         * 
         */
        public Builder apiConfigIdPrefix(@Nullable Output<String> apiConfigIdPrefix) {
            $.apiConfigIdPrefix = apiConfigIdPrefix;
            return this;
        }

        /**
         * @param apiConfigIdPrefix Creates a unique name beginning with the
         * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
         * 
         * @return builder
         * 
         */
        public Builder apiConfigIdPrefix(String apiConfigIdPrefix) {
            return apiConfigIdPrefix(Output.of(apiConfigIdPrefix));
        }

        /**
         * @param displayName A user-visible name for the API.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-visible name for the API.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gatewayConfig Immutable. Gateway specific configuration.
         * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gatewayConfig(@Nullable Output<ApiConfigGatewayConfigGetArgs> gatewayConfig) {
            $.gatewayConfig = gatewayConfig;
            return this;
        }

        /**
         * @param gatewayConfig Immutable. Gateway specific configuration.
         * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gatewayConfig(ApiConfigGatewayConfigGetArgs gatewayConfig) {
            return gatewayConfig(Output.of(gatewayConfig));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The resource name of the API Config.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the API Config.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openapiDocuments An OpenAPI Specification Document describing an API.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder openapiDocuments(@Nullable Output<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments) {
            $.openapiDocuments = openapiDocuments;
            return this;
        }

        /**
         * @param openapiDocuments An OpenAPI Specification Document describing an API.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder openapiDocuments(List<ApiConfigOpenapiDocumentGetArgs> openapiDocuments) {
            return openapiDocuments(Output.of(openapiDocuments));
        }

        /**
         * @param openapiDocuments An OpenAPI Specification Document describing an API.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder openapiDocuments(ApiConfigOpenapiDocumentGetArgs... openapiDocuments) {
            return openapiDocuments(List.of(openapiDocuments));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param serviceConfigId The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
         * 
         * @return builder
         * 
         */
        public Builder serviceConfigId(@Nullable Output<String> serviceConfigId) {
            $.serviceConfigId = serviceConfigId;
            return this;
        }

        /**
         * @param serviceConfigId The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
         * 
         * @return builder
         * 
         */
        public Builder serviceConfigId(String serviceConfigId) {
            return serviceConfigId(Output.of(serviceConfigId));
        }

        public ApiConfigState build() {
            return $;
        }
    }

}
