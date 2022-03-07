// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.PoolArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Capacity pool resource
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:Pool account1/pool1 /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:Pool")
public class Pool extends io.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * UUID v4 used to identify the Pool
     * 
     */
    @OutputExport(name="poolId", type=String.class, parameters={})
    private Output<String> poolId;

    /**
     * @return UUID v4 used to identify the Pool
     * 
     */
    public Output<String> getPoolId() {
        return this.poolId;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The qos type of the pool
     * 
     */
    @OutputExport(name="qosType", type=String.class, parameters={})
    private Output</* @Nullable */ String> qosType;

    /**
     * @return The qos type of the pool
     * 
     */
    public Output</* @Nullable */ String> getQosType() {
        return this.qosType;
    }
    /**
     * The service level of the file system
     * 
     */
    @OutputExport(name="serviceLevel", type=String.class, parameters={})
    private Output<String> serviceLevel;

    /**
     * @return The service level of the file system
     * 
     */
    public Output<String> getServiceLevel() {
        return this.serviceLevel;
    }
    /**
     * Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    @OutputExport(name="size", type=Double.class, parameters={})
    private Output<Double> size;

    /**
     * @return Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be multiply of 4398046511104).
     * 
     */
    public Output<Double> getSize() {
        return this.size;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Total throughput of pool in Mibps
     * 
     */
    @OutputExport(name="totalThroughputMibps", type=Double.class, parameters={})
    private Output<Double> totalThroughputMibps;

    /**
     * @return Total throughput of pool in Mibps
     * 
     */
    public Output<Double> getTotalThroughputMibps() {
        return this.totalThroughputMibps;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Utilized throughput of pool in Mibps
     * 
     */
    @OutputExport(name="utilizedThroughputMibps", type=Double.class, parameters={})
    private Output<Double> utilizedThroughputMibps;

    /**
     * @return Utilized throughput of pool in Mibps
     * 
     */
    public Output<Double> getUtilizedThroughputMibps() {
        return this.utilizedThroughputMibps;
    }

    public interface BuilderApplicator {
        public void apply(PoolArgs.Builder a);
    }
    private static io.pulumi.azurenative.netapp.PoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.netapp.PoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Pool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Pool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Pool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:netapp/v20170815:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190501:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190601:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190701:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190801:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20191001:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20191101:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200201:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200301:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200501:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200601:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200701:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200801:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200901:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201101:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201201:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210201:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401preview:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210601:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210801:Pool").build())
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
    public static Pool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, options);
    }
}