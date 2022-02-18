// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.MetricsSourceArgs;
import io.pulumi.azurenative.logz.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.MonitorPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logz:MetricsSource myMonitor /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/monitors/myMonitor/metricsSource/MetricsSource1 
 * ```
 * 
 */
@ResourceType(type="azure-native:logz:MetricsSource")
public class MetricsSource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of the monitor resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the monitor resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties specific to the monitor resource.
     * 
     */
    @OutputExport(name="properties", type=MonitorPropertiesResponse.class, parameters={})
    private Output<MonitorPropertiesResponse> properties;

    /**
     * @return Properties specific to the monitor resource.
     * 
     */
    public Output<MonitorPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the monitor resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the monitor resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricsSource(String name, MetricsSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logz:MetricsSource", name, args == null ? MetricsSourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MetricsSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logz:MetricsSource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logz/v20220101preview:MetricsSource").build())
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
    public static MetricsSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricsSource(name, id, options);
    }
}
