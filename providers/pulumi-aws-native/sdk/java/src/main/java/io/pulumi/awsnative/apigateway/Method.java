// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.MethodArgs;
import io.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import io.pulumi.awsnative.apigateway.outputs.MethodIntegration;
import io.pulumi.awsnative.apigateway.outputs.MethodResponse;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:apigateway:Method")
public class Method extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiKeyRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    public Output</* @Nullable */ Boolean> getApiKeyRequired() {
        return this.apiKeyRequired;
    }
    @OutputExport(name="authorizationScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationScopes;

    public Output</* @Nullable */ List<String>> getAuthorizationScopes() {
        return this.authorizationScopes;
    }
    @OutputExport(name="authorizationType", type=MethodAuthorizationType.class, parameters={})
    private Output</* @Nullable */ MethodAuthorizationType> authorizationType;

    public Output</* @Nullable */ MethodAuthorizationType> getAuthorizationType() {
        return this.authorizationType;
    }
    @OutputExport(name="authorizerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerId;

    public Output</* @Nullable */ String> getAuthorizerId() {
        return this.authorizerId;
    }
    @OutputExport(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }
    @OutputExport(name="integration", type=MethodIntegration.class, parameters={})
    private Output</* @Nullable */ MethodIntegration> integration;

    public Output</* @Nullable */ MethodIntegration> getIntegration() {
        return this.integration;
    }
    @OutputExport(name="methodResponses", type=List.class, parameters={MethodResponse.class})
    private Output</* @Nullable */ List<MethodResponse>> methodResponses;

    public Output</* @Nullable */ List<MethodResponse>> getMethodResponses() {
        return this.methodResponses;
    }
    @OutputExport(name="operationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationName;

    public Output</* @Nullable */ String> getOperationName() {
        return this.operationName;
    }
    @OutputExport(name="requestModels", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestModels;

    public Output</* @Nullable */ Object> getRequestModels() {
        return this.requestModels;
    }
    @OutputExport(name="requestParameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestParameters;

    public Output</* @Nullable */ Object> getRequestParameters() {
        return this.requestParameters;
    }
    @OutputExport(name="requestValidatorId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestValidatorId;

    public Output</* @Nullable */ String> getRequestValidatorId() {
        return this.requestValidatorId;
    }
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public Method(String name, MethodArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, args == null ? MethodArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Method(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Method get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Method(name, id, options);
    }
}
