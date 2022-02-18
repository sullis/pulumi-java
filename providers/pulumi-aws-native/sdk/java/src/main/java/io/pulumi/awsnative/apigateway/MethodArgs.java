// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import io.pulumi.awsnative.apigateway.inputs.MethodIntegrationArgs;
import io.pulumi.awsnative.apigateway.inputs.MethodResponseArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    @InputImport(name="apiKeyRequired")
    private final @Nullable Input<Boolean> apiKeyRequired;

    public Input<Boolean> getApiKeyRequired() {
        return this.apiKeyRequired == null ? Input.empty() : this.apiKeyRequired;
    }

    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    @InputImport(name="authorizationScopes")
    private final @Nullable Input<List<String>> authorizationScopes;

    public Input<List<String>> getAuthorizationScopes() {
        return this.authorizationScopes == null ? Input.empty() : this.authorizationScopes;
    }

    /**
     * The method's authorization type.
     * 
     */
    @InputImport(name="authorizationType")
    private final @Nullable Input<MethodAuthorizationType> authorizationType;

    public Input<MethodAuthorizationType> getAuthorizationType() {
        return this.authorizationType == null ? Input.empty() : this.authorizationType;
    }

    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    @InputImport(name="authorizerId")
    private final @Nullable Input<String> authorizerId;

    public Input<String> getAuthorizerId() {
        return this.authorizerId == null ? Input.empty() : this.authorizerId;
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final Input<String> httpMethod;

    public Input<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @InputImport(name="integration")
    private final @Nullable Input<MethodIntegrationArgs> integration;

    public Input<MethodIntegrationArgs> getIntegration() {
        return this.integration == null ? Input.empty() : this.integration;
    }

    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    @InputImport(name="methodResponses")
    private final @Nullable Input<List<MethodResponseArgs>> methodResponses;

    public Input<List<MethodResponseArgs>> getMethodResponses() {
        return this.methodResponses == null ? Input.empty() : this.methodResponses;
    }

    /**
     * A friendly operation name for the method.
     * 
     */
    @InputImport(name="operationName")
    private final @Nullable Input<String> operationName;

    public Input<String> getOperationName() {
        return this.operationName == null ? Input.empty() : this.operationName;
    }

    /**
     * The resources that are used for the request's content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    @InputImport(name="requestModels")
    private final @Nullable Input<Object> requestModels;

    public Input<Object> getRequestModels() {
        return this.requestModels == null ? Input.empty() : this.requestModels;
    }

    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    @InputImport(name="requestParameters")
    private final @Nullable Input<Object> requestParameters;

    public Input<Object> getRequestParameters() {
        return this.requestParameters == null ? Input.empty() : this.requestParameters;
    }

    /**
     * The ID of the associated request validator.
     * 
     */
    @InputImport(name="requestValidatorId")
    private final @Nullable Input<String> requestValidatorId;

    public Input<String> getRequestValidatorId() {
        return this.requestValidatorId == null ? Input.empty() : this.requestValidatorId;
    }

    /**
     * The ID of an API Gateway resource.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @InputImport(name="restApiId", required=true)
    private final Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId;
    }

    public MethodArgs(
        @Nullable Input<Boolean> apiKeyRequired,
        @Nullable Input<List<String>> authorizationScopes,
        @Nullable Input<MethodAuthorizationType> authorizationType,
        @Nullable Input<String> authorizerId,
        Input<String> httpMethod,
        @Nullable Input<MethodIntegrationArgs> integration,
        @Nullable Input<List<MethodResponseArgs>> methodResponses,
        @Nullable Input<String> operationName,
        @Nullable Input<Object> requestModels,
        @Nullable Input<Object> requestParameters,
        @Nullable Input<String> requestValidatorId,
        Input<String> resourceId,
        Input<String> restApiId) {
        this.apiKeyRequired = apiKeyRequired;
        this.authorizationScopes = authorizationScopes;
        this.authorizationType = authorizationType;
        this.authorizerId = authorizerId;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.integration = integration;
        this.methodResponses = methodResponses;
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.requestValidatorId = requestValidatorId;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private MethodArgs() {
        this.apiKeyRequired = Input.empty();
        this.authorizationScopes = Input.empty();
        this.authorizationType = Input.empty();
        this.authorizerId = Input.empty();
        this.httpMethod = Input.empty();
        this.integration = Input.empty();
        this.methodResponses = Input.empty();
        this.operationName = Input.empty();
        this.requestModels = Input.empty();
        this.requestParameters = Input.empty();
        this.requestValidatorId = Input.empty();
        this.resourceId = Input.empty();
        this.restApiId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> apiKeyRequired;
        private @Nullable Input<List<String>> authorizationScopes;
        private @Nullable Input<MethodAuthorizationType> authorizationType;
        private @Nullable Input<String> authorizerId;
        private Input<String> httpMethod;
        private @Nullable Input<MethodIntegrationArgs> integration;
        private @Nullable Input<List<MethodResponseArgs>> methodResponses;
        private @Nullable Input<String> operationName;
        private @Nullable Input<Object> requestModels;
        private @Nullable Input<Object> requestParameters;
        private @Nullable Input<String> requestValidatorId;
        private Input<String> resourceId;
        private Input<String> restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizationType = defaults.authorizationType;
    	      this.authorizerId = defaults.authorizerId;
    	      this.httpMethod = defaults.httpMethod;
    	      this.integration = defaults.integration;
    	      this.methodResponses = defaults.methodResponses;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.resourceId = defaults.resourceId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setApiKeyRequired(@Nullable Input<Boolean> apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }

        public Builder setApiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = Input.ofNullable(apiKeyRequired);
            return this;
        }

        public Builder setAuthorizationScopes(@Nullable Input<List<String>> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }

        public Builder setAuthorizationScopes(@Nullable List<String> authorizationScopes) {
            this.authorizationScopes = Input.ofNullable(authorizationScopes);
            return this;
        }

        public Builder setAuthorizationType(@Nullable Input<MethodAuthorizationType> authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        public Builder setAuthorizationType(@Nullable MethodAuthorizationType authorizationType) {
            this.authorizationType = Input.ofNullable(authorizationType);
            return this;
        }

        public Builder setAuthorizerId(@Nullable Input<String> authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        public Builder setAuthorizerId(@Nullable String authorizerId) {
            this.authorizerId = Input.ofNullable(authorizerId);
            return this;
        }

        public Builder setHttpMethod(Input<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setIntegration(@Nullable Input<MethodIntegrationArgs> integration) {
            this.integration = integration;
            return this;
        }

        public Builder setIntegration(@Nullable MethodIntegrationArgs integration) {
            this.integration = Input.ofNullable(integration);
            return this;
        }

        public Builder setMethodResponses(@Nullable Input<List<MethodResponseArgs>> methodResponses) {
            this.methodResponses = methodResponses;
            return this;
        }

        public Builder setMethodResponses(@Nullable List<MethodResponseArgs> methodResponses) {
            this.methodResponses = Input.ofNullable(methodResponses);
            return this;
        }

        public Builder setOperationName(@Nullable Input<String> operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder setOperationName(@Nullable String operationName) {
            this.operationName = Input.ofNullable(operationName);
            return this;
        }

        public Builder setRequestModels(@Nullable Input<Object> requestModels) {
            this.requestModels = requestModels;
            return this;
        }

        public Builder setRequestModels(@Nullable Object requestModels) {
            this.requestModels = Input.ofNullable(requestModels);
            return this;
        }

        public Builder setRequestParameters(@Nullable Input<Object> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder setRequestParameters(@Nullable Object requestParameters) {
            this.requestParameters = Input.ofNullable(requestParameters);
            return this;
        }

        public Builder setRequestValidatorId(@Nullable Input<String> requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }

        public Builder setRequestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = Input.ofNullable(requestValidatorId);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setRestApiId(Input<String> restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Input.of(Objects.requireNonNull(restApiId));
            return this;
        }

        public MethodArgs build() {
            return new MethodArgs(apiKeyRequired, authorizationScopes, authorizationType, authorizerId, httpMethod, integration, methodResponses, operationName, requestModels, requestParameters, requestValidatorId, resourceId, restApiId);
        }
    }
}
