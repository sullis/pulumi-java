// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.DatabaseArgs;
import io.pulumi.azurenative.cache.outputs.ModuleResponse;
import io.pulumi.azurenative.cache.outputs.PersistenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a database on the RedisEnterprise cluster
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:Database cache1/default /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/redisEnterprise/cache1/databases/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted.
     * 
     */
    @OutputExport(name="clientProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientProtocol;

    /**
     * @return Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted.
     * 
     */
    public Output</* @Nullable */ String> getClientProtocol() {
        return this.clientProtocol;
    }
    /**
     * Clustering policy - default is OSSCluster. Specified at create time.
     * 
     */
    @OutputExport(name="clusteringPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusteringPolicy;

    /**
     * @return Clustering policy - default is OSSCluster. Specified at create time.
     * 
     */
    public Output</* @Nullable */ String> getClusteringPolicy() {
        return this.clusteringPolicy;
    }
    /**
     * Redis eviction policy - default is VolatileLRU
     * 
     */
    @OutputExport(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return Redis eviction policy - default is VolatileLRU
     * 
     */
    public Output</* @Nullable */ String> getEvictionPolicy() {
        return this.evictionPolicy;
    }
    /**
     * Optional set of redis modules to enable in this database - modules can only be added at creation time.
     * 
     */
    @OutputExport(name="modules", type=List.class, parameters={ModuleResponse.class})
    private Output</* @Nullable */ List<ModuleResponse>> modules;

    /**
     * @return Optional set of redis modules to enable in this database - modules can only be added at creation time.
     * 
     */
    public Output</* @Nullable */ List<ModuleResponse>> getModules() {
        return this.modules;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Persistence settings
     * 
     */
    @OutputExport(name="persistence", type=PersistenceResponse.class, parameters={})
    private Output</* @Nullable */ PersistenceResponse> persistence;

    /**
     * @return Persistence settings
     * 
     */
    public Output</* @Nullable */ PersistenceResponse> getPersistence() {
        return this.persistence;
    }
    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return TCP port of the database endpoint. Specified at create time. Defaults to an available port.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * Current provisioning status of the database
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning status of the database
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Current resource status of the database
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Current resource status of the database
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.cache.DatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cache.DatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Database(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cache/v20201001preview:Database").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210201preview:Database").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210301:Database").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210801:Database").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20220101:Database").build())
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
    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}