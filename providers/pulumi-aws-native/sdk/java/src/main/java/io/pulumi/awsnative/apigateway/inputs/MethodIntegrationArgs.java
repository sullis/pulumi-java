// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.awsnative.apigateway.enums.MethodIntegrationConnectionType;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationContentHandling;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationPassthroughBehavior;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationType;
import io.pulumi.awsnative.apigateway.inputs.MethodIntegrationResponseArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodIntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodIntegrationArgs Empty = new MethodIntegrationArgs();

    @InputImport(name="cacheKeyParameters")
    private final @Nullable Input<List<String>> cacheKeyParameters;

    public Input<List<String>> getCacheKeyParameters() {
        return this.cacheKeyParameters == null ? Input.empty() : this.cacheKeyParameters;
    }

    @InputImport(name="cacheNamespace")
    private final @Nullable Input<String> cacheNamespace;

    public Input<String> getCacheNamespace() {
        return this.cacheNamespace == null ? Input.empty() : this.cacheNamespace;
    }

    @InputImport(name="connectionId")
    private final @Nullable Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId == null ? Input.empty() : this.connectionId;
    }

    @InputImport(name="connectionType")
    private final @Nullable Input<MethodIntegrationConnectionType> connectionType;

    public Input<MethodIntegrationConnectionType> getConnectionType() {
        return this.connectionType == null ? Input.empty() : this.connectionType;
    }

    @InputImport(name="contentHandling")
    private final @Nullable Input<MethodIntegrationContentHandling> contentHandling;

    public Input<MethodIntegrationContentHandling> getContentHandling() {
        return this.contentHandling == null ? Input.empty() : this.contentHandling;
    }

    @InputImport(name="credentials")
    private final @Nullable Input<String> credentials;

    public Input<String> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    @InputImport(name="integrationHttpMethod")
    private final @Nullable Input<String> integrationHttpMethod;

    public Input<String> getIntegrationHttpMethod() {
        return this.integrationHttpMethod == null ? Input.empty() : this.integrationHttpMethod;
    }

    @InputImport(name="integrationResponses")
    private final @Nullable Input<List<MethodIntegrationResponseArgs>> integrationResponses;

    public Input<List<MethodIntegrationResponseArgs>> getIntegrationResponses() {
        return this.integrationResponses == null ? Input.empty() : this.integrationResponses;
    }

    @InputImport(name="passthroughBehavior")
    private final @Nullable Input<MethodIntegrationPassthroughBehavior> passthroughBehavior;

    public Input<MethodIntegrationPassthroughBehavior> getPassthroughBehavior() {
        return this.passthroughBehavior == null ? Input.empty() : this.passthroughBehavior;
    }

    @InputImport(name="requestParameters")
    private final @Nullable Input<Object> requestParameters;

    public Input<Object> getRequestParameters() {
        return this.requestParameters == null ? Input.empty() : this.requestParameters;
    }

    @InputImport(name="requestTemplates")
    private final @Nullable Input<Object> requestTemplates;

    public Input<Object> getRequestTemplates() {
        return this.requestTemplates == null ? Input.empty() : this.requestTemplates;
    }

    @InputImport(name="timeoutInMillis")
    private final @Nullable Input<Integer> timeoutInMillis;

    public Input<Integer> getTimeoutInMillis() {
        return this.timeoutInMillis == null ? Input.empty() : this.timeoutInMillis;
    }

    @InputImport(name="type", required=true)
    private final Input<MethodIntegrationType> type;

    public Input<MethodIntegrationType> getType() {
        return this.type;
    }

    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public MethodIntegrationArgs(
        @Nullable Input<List<String>> cacheKeyParameters,
        @Nullable Input<String> cacheNamespace,
        @Nullable Input<String> connectionId,
        @Nullable Input<MethodIntegrationConnectionType> connectionType,
        @Nullable Input<MethodIntegrationContentHandling> contentHandling,
        @Nullable Input<String> credentials,
        @Nullable Input<String> integrationHttpMethod,
        @Nullable Input<List<MethodIntegrationResponseArgs>> integrationResponses,
        @Nullable Input<MethodIntegrationPassthroughBehavior> passthroughBehavior,
        @Nullable Input<Object> requestParameters,
        @Nullable Input<Object> requestTemplates,
        @Nullable Input<Integer> timeoutInMillis,
        Input<MethodIntegrationType> type,
        @Nullable Input<String> uri) {
        this.cacheKeyParameters = cacheKeyParameters;
        this.cacheNamespace = cacheNamespace;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandling = contentHandling;
        this.credentials = credentials;
        this.integrationHttpMethod = integrationHttpMethod;
        this.integrationResponses = integrationResponses;
        this.passthroughBehavior = passthroughBehavior;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.timeoutInMillis = timeoutInMillis;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = uri;
    }

    private MethodIntegrationArgs() {
        this.cacheKeyParameters = Input.empty();
        this.cacheNamespace = Input.empty();
        this.connectionId = Input.empty();
        this.connectionType = Input.empty();
        this.contentHandling = Input.empty();
        this.credentials = Input.empty();
        this.integrationHttpMethod = Input.empty();
        this.integrationResponses = Input.empty();
        this.passthroughBehavior = Input.empty();
        this.requestParameters = Input.empty();
        this.requestTemplates = Input.empty();
        this.timeoutInMillis = Input.empty();
        this.type = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cacheKeyParameters;
        private @Nullable Input<String> cacheNamespace;
        private @Nullable Input<String> connectionId;
        private @Nullable Input<MethodIntegrationConnectionType> connectionType;
        private @Nullable Input<MethodIntegrationContentHandling> contentHandling;
        private @Nullable Input<String> credentials;
        private @Nullable Input<String> integrationHttpMethod;
        private @Nullable Input<List<MethodIntegrationResponseArgs>> integrationResponses;
        private @Nullable Input<MethodIntegrationPassthroughBehavior> passthroughBehavior;
        private @Nullable Input<Object> requestParameters;
        private @Nullable Input<Object> requestTemplates;
        private @Nullable Input<Integer> timeoutInMillis;
        private Input<MethodIntegrationType> type;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodIntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyParameters = defaults.cacheKeyParameters;
    	      this.cacheNamespace = defaults.cacheNamespace;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandling = defaults.contentHandling;
    	      this.credentials = defaults.credentials;
    	      this.integrationHttpMethod = defaults.integrationHttpMethod;
    	      this.integrationResponses = defaults.integrationResponses;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.timeoutInMillis = defaults.timeoutInMillis;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setCacheKeyParameters(@Nullable Input<List<String>> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }

        public Builder setCacheKeyParameters(@Nullable List<String> cacheKeyParameters) {
            this.cacheKeyParameters = Input.ofNullable(cacheKeyParameters);
            return this;
        }

        public Builder setCacheNamespace(@Nullable Input<String> cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }

        public Builder setCacheNamespace(@Nullable String cacheNamespace) {
            this.cacheNamespace = Input.ofNullable(cacheNamespace);
            return this;
        }

        public Builder setConnectionId(@Nullable Input<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder setConnectionId(@Nullable String connectionId) {
            this.connectionId = Input.ofNullable(connectionId);
            return this;
        }

        public Builder setConnectionType(@Nullable Input<MethodIntegrationConnectionType> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder setConnectionType(@Nullable MethodIntegrationConnectionType connectionType) {
            this.connectionType = Input.ofNullable(connectionType);
            return this;
        }

        public Builder setContentHandling(@Nullable Input<MethodIntegrationContentHandling> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        public Builder setContentHandling(@Nullable MethodIntegrationContentHandling contentHandling) {
            this.contentHandling = Input.ofNullable(contentHandling);
            return this;
        }

        public Builder setCredentials(@Nullable Input<String> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable String credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setIntegrationHttpMethod(@Nullable Input<String> integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }

        public Builder setIntegrationHttpMethod(@Nullable String integrationHttpMethod) {
            this.integrationHttpMethod = Input.ofNullable(integrationHttpMethod);
            return this;
        }

        public Builder setIntegrationResponses(@Nullable Input<List<MethodIntegrationResponseArgs>> integrationResponses) {
            this.integrationResponses = integrationResponses;
            return this;
        }

        public Builder setIntegrationResponses(@Nullable List<MethodIntegrationResponseArgs> integrationResponses) {
            this.integrationResponses = Input.ofNullable(integrationResponses);
            return this;
        }

        public Builder setPassthroughBehavior(@Nullable Input<MethodIntegrationPassthroughBehavior> passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        public Builder setPassthroughBehavior(@Nullable MethodIntegrationPassthroughBehavior passthroughBehavior) {
            this.passthroughBehavior = Input.ofNullable(passthroughBehavior);
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

        public Builder setRequestTemplates(@Nullable Input<Object> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        public Builder setRequestTemplates(@Nullable Object requestTemplates) {
            this.requestTemplates = Input.ofNullable(requestTemplates);
            return this;
        }

        public Builder setTimeoutInMillis(@Nullable Input<Integer> timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            return this;
        }

        public Builder setTimeoutInMillis(@Nullable Integer timeoutInMillis) {
            this.timeoutInMillis = Input.ofNullable(timeoutInMillis);
            return this;
        }

        public Builder setType(Input<MethodIntegrationType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(MethodIntegrationType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public MethodIntegrationArgs build() {
            return new MethodIntegrationArgs(cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, integrationHttpMethod, integrationResponses, passthroughBehavior, requestParameters, requestTemplates, timeoutInMillis, type, uri);
        }
    }
}
