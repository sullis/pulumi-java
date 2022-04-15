// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.refactorspaces.ServiceArgs;
import io.pulumi.awsnative.refactorspaces.enums.ServiceEndpointType;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceLambdaEndpointInput;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceTag;
import io.pulumi.awsnative.refactorspaces.outputs.ServiceUrlEndpointInput;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::RefactorSpaces::Service Resource Type
 * 
 */
@ResourceType(type="aws-native:refactorspaces:Service")
public class Service extends io.pulumi.resources.CustomResource {
    @Export(name="applicationIdentifier", type=String.class, parameters={})
    private Output<String> applicationIdentifier;

    public Output<String> applicationIdentifier() {
        return this.applicationIdentifier;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    @Export(name="endpointType", type=ServiceEndpointType.class, parameters={})
    private Output</* @Nullable */ ServiceEndpointType> endpointType;

    public Output</* @Nullable */ ServiceEndpointType> endpointType() {
        return this.endpointType;
    }
    @Export(name="environmentIdentifier", type=String.class, parameters={})
    private Output<String> environmentIdentifier;

    public Output<String> environmentIdentifier() {
        return this.environmentIdentifier;
    }
    @Export(name="lambdaEndpoint", type=ServiceLambdaEndpointInput.class, parameters={})
    private Output</* @Nullable */ ServiceLambdaEndpointInput> lambdaEndpoint;

    public Output</* @Nullable */ ServiceLambdaEndpointInput> lambdaEndpoint() {
        return this.lambdaEndpoint;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    @Export(name="serviceIdentifier", type=String.class, parameters={})
    private Output<String> serviceIdentifier;

    public Output<String> serviceIdentifier() {
        return this.serviceIdentifier;
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ServiceTag.class})
    private Output</* @Nullable */ List<ServiceTag>> tags;

    /**
     * @return Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public Output</* @Nullable */ List<ServiceTag>> tags() {
        return this.tags;
    }
    @Export(name="urlEndpoint", type=ServiceUrlEndpointInput.class, parameters={})
    private Output</* @Nullable */ ServiceUrlEndpointInput> urlEndpoint;

    public Output</* @Nullable */ ServiceUrlEndpointInput> urlEndpoint() {
        return this.urlEndpoint;
    }
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    public Output</* @Nullable */ String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:refactorspaces:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Service get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
