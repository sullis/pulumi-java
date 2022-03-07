// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainArgs;
import io.pulumi.awsnative.ec2.outputs.OptionsProperties;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayMulticastDomainTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::TransitGatewayMulticastDomain type
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayMulticastDomain")
public class TransitGatewayMulticastDomain extends io.pulumi.resources.CustomResource {
    /**
     * The time the transit gateway multicast domain was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the transit gateway multicast domain was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The options for the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="options", type=OptionsProperties.class, parameters={})
    private Output</* @Nullable */ OptionsProperties> options;

    /**
     * @return The options for the transit gateway multicast domain.
     * 
     */
    public Output</* @Nullable */ OptionsProperties> getOptions() {
        return this.options;
    }
    /**
     * The state of the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the transit gateway multicast domain.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The tags for the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={TransitGatewayMulticastDomainTag.class})
    private Output</* @Nullable */ List<TransitGatewayMulticastDomainTag>> tags;

    /**
     * @return The tags for the transit gateway multicast domain.
     * 
     */
    public Output</* @Nullable */ List<TransitGatewayMulticastDomainTag>> getTags() {
        return this.tags;
    }
    /**
     * The ID of the transit gateway.
     * 
     */
    @OutputExport(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return The ID of the transit gateway.
     * 
     */
    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="transitGatewayMulticastDomainArn", type=String.class, parameters={})
    private Output<String> transitGatewayMulticastDomainArn;

    /**
     * @return The Amazon Resource Name (ARN) of the transit gateway multicast domain.
     * 
     */
    public Output<String> getTransitGatewayMulticastDomainArn() {
        return this.transitGatewayMulticastDomainArn;
    }
    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="transitGatewayMulticastDomainId", type=String.class, parameters={})
    private Output<String> transitGatewayMulticastDomainId;

    /**
     * @return The ID of the transit gateway multicast domain.
     * 
     */
    public Output<String> getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public interface BuilderApplicator {
        public void apply(TransitGatewayMulticastDomainArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGatewayMulticastDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayMulticastDomain(String name) {
        this(name, TransitGatewayMulticastDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayMulticastDomain(String name, TransitGatewayMulticastDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayMulticastDomain(String name, TransitGatewayMulticastDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastDomain", name, args == null ? TransitGatewayMulticastDomainArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGatewayMulticastDomain(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static TransitGatewayMulticastDomain get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayMulticastDomain(name, id, options);
    }
}