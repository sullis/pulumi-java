// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.NatAddressArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a NAT address. The address is created in the RESERVED state and a static external IP address will be provisioned. At this time, the instance will not use this IP address for Internet egress traffic. The address can be activated for use once any required firewall IP whitelisting has been completed. **Note:** Not supported for Apigee hybrid.
 * 
 */
@ResourceType(type="google-native:apigee/v1:NatAddress")
public class NatAddress extends io.pulumi.resources.CustomResource {
    /**
     * The static IPV4 address.
     * 
     */
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The static IPV4 address.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Resource ID of the NAT address.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource ID of the NAT address.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the nat address.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the nat address.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(NatAddressArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.NatAddressArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.NatAddressArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NatAddress(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatAddress(String name) {
        this(name, NatAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatAddress(String name, NatAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatAddress(String name, NatAddressArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:NatAddress", name, args == null ? NatAddressArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NatAddress(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:NatAddress", name, null, makeResourceOptions(options, id));
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
    public static NatAddress get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NatAddress(name, id, options);
    }
}