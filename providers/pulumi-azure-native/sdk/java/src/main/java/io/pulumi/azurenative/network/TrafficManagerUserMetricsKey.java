// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.TrafficManagerUserMetricsKeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing Traffic Manager User Metrics.
 * API Version: 2018-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:TrafficManagerUserMetricsKey default /providers/Microsoft.Network/trafficManagerUserMetricsKeys/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:TrafficManagerUserMetricsKey")
public class TrafficManagerUserMetricsKey extends io.pulumi.resources.CustomResource {
    /**
     * The key returned by the User Metrics operation.
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output</* @Nullable */ String> key;

    /**
     * @return The key returned by the User Metrics operation.
     * 
     */
    public Output</* @Nullable */ String> getKey() {
        return this.key;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficManagerUserMetricsKey(String name, @Nullable TrafficManagerUserMetricsKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:TrafficManagerUserMetricsKey", name, args == null ? TrafficManagerUserMetricsKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TrafficManagerUserMetricsKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:TrafficManagerUserMetricsKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180401:TrafficManagerUserMetricsKey").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:TrafficManagerUserMetricsKey").build())
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
    public static TrafficManagerUserMetricsKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TrafficManagerUserMetricsKey(name, id, options);
    }
}
