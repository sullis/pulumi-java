// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.ServiceArgs;
import io.pulumi.awsnative.refactorspaces.enums.ServiceEndpointType;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceLambdaEndpointInput;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceTag;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceUrlEndpointInput;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:refactorspaces:Service")
public class Service extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="endpointType", type=ServiceEndpointType.class, parameters={})
    private Output</* @Nullable */ ServiceEndpointType> endpointType;

    public Output</* @Nullable */ ServiceEndpointType> getEndpointType() {
        return this.endpointType;
    }
    @OutputExport(name="environmentIdentifier", type=String.class, parameters={})
    private Output<String> environmentIdentifier;

    public Output<String> getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }
    @OutputExport(name="lambdaEndpoint", type=ServiceLambdaEndpointInput.class, parameters={})
    private Output</* @Nullable */ ServiceLambdaEndpointInput> lambdaEndpoint;

    public Output</* @Nullable */ ServiceLambdaEndpointInput> getLambdaEndpoint() {
        return this.lambdaEndpoint;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="serviceIdentifier", type=String.class, parameters={})
    private Output<String> serviceIdentifier;

    public Output<String> getServiceIdentifier() {
        return this.serviceIdentifier;
    }
    @OutputExport(name="tags", type=List.class, parameters={ServiceTag.class})
    private Output</* @Nullable */ List<ServiceTag>> tags;

    public Output</* @Nullable */ List<ServiceTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="urlEndpoint", type=ServiceUrlEndpointInput.class, parameters={})
    private Output</* @Nullable */ ServiceUrlEndpointInput> urlEndpoint;

    public Output</* @Nullable */ ServiceUrlEndpointInput> getUrlEndpoint() {
        return this.urlEndpoint;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    public Output</* @Nullable */ String> getVpcId() {
        return this.vpcId;
    }

    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Service get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
