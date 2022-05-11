// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.redis.EnterpriseDatabaseArgs;
import com.pulumi.azure.redis.inputs.EnterpriseDatabaseState;
import com.pulumi.azure.redis.outputs.EnterpriseDatabaseModule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Redis Enterprise Database.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleEnterpriseCluster = new EnterpriseCluster(&#34;exampleEnterpriseCluster&#34;, EnterpriseClusterArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .skuName(&#34;Enterprise_E20-4&#34;)
 *             .build());
 * 
 *         var example1 = new EnterpriseCluster(&#34;example1&#34;, EnterpriseClusterArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .skuName(&#34;Enterprise_E20-4&#34;)
 *             .build());
 * 
 *         var exampleEnterpriseDatabase = new EnterpriseDatabase(&#34;exampleEnterpriseDatabase&#34;, EnterpriseDatabaseArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .clusterId(exampleEnterpriseCluster.getId())
 *             .clientProtocol(&#34;Encrypted&#34;)
 *             .clusteringPolicy(&#34;EnterpriseCluster&#34;)
 *             .evictionPolicy(&#34;NoEviction&#34;)
 *             .port(10000)
 *             .linkedDatabaseIds(            
 *                 exampleEnterpriseCluster.getId().apply(id -&gt; String.format(&#34;%s/databases/default&#34;, id)),
 *                 example1.getId().apply(id -&gt; String.format(&#34;%s/databases/default&#34;, id)))
 *             .linkedDatabaseGroupNickname(&#34;tftestGeoGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redis Enterprise Databases can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:redis/enterpriseDatabase:EnterpriseDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Cache/redisEnterprise/cluster1/databases/database1
 * ```
 * 
 */
@ResourceType(type="azure:redis/enterpriseDatabase:EnterpriseDatabase")
public class EnterpriseDatabase extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="clientProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientProtocol;

    /**
     * @return Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<Optional<String>> clientProtocol() {
        return Codegen.optional(this.clientProtocol);
    }
    /**
     * The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="clusteringPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusteringPolicy;

    /**
     * @return Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<Optional<String>> clusteringPolicy() {
        return Codegen.optional(this.clusteringPolicy);
    }
    /**
     * Redis eviction policy - default is VolatileLRU. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Defaults to `VolatileLRU`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return Redis eviction policy - default is VolatileLRU. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Defaults to `VolatileLRU`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<Optional<String>> evictionPolicy() {
        return Codegen.optional(this.evictionPolicy);
    }
    /**
     * Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     * 
     */
    @Export(name="linkedDatabaseGroupNickname", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedDatabaseGroupNickname;

    /**
     * @return Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     * 
     */
    public Output<Optional<String>> linkedDatabaseGroupNickname() {
        return Codegen.optional(this.linkedDatabaseGroupNickname);
    }
    /**
     * A list of database resources to link with this database with a maximum of 5.
     * 
     */
    @Export(name="linkedDatabaseIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> linkedDatabaseIds;

    /**
     * @return A list of database resources to link with this database with a maximum of 5.
     * 
     */
    public Output<Optional<List<String>>> linkedDatabaseIds() {
        return Codegen.optional(this.linkedDatabaseIds);
    }
    /**
     * A `module` block as defined below.
     * 
     */
    @Export(name="modules", type=List.class, parameters={EnterpriseDatabaseModule.class})
    private Output</* @Nullable */ List<EnterpriseDatabaseModule>> modules;

    /**
     * @return A `module` block as defined below.
     * 
     */
    public Output<Optional<List<EnterpriseDatabaseModule>>> modules() {
        return Codegen.optional(this.modules);
    }
    /**
     * The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The Primary Access Key for the Redis Enterprise Database Instance.
     * 
     */
    @Export(name="primaryAccessKey", type=String.class, parameters={})
    private Output<String> primaryAccessKey;

    /**
     * @return The Primary Access Key for the Redis Enterprise Database Instance.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
     * 
     * @deprecated
     * This field is no longer used and will be removed in the next major version of the Azure Provider
     * 
     */
    @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Secondary Access Key for the Redis Enterprise Database Instance.
     * 
     */
    @Export(name="secondaryAccessKey", type=String.class, parameters={})
    private Output<String> secondaryAccessKey;

    /**
     * @return The Secondary Access Key for the Redis Enterprise Database Instance.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseDatabase(String name) {
        this(name, EnterpriseDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseDatabase(String name, EnterpriseDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseDatabase(String name, EnterpriseDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:redis/enterpriseDatabase:EnterpriseDatabase", name, args == null ? EnterpriseDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseDatabase(String name, Output<String> id, @Nullable EnterpriseDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:redis/enterpriseDatabase:EnterpriseDatabase", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnterpriseDatabase get(String name, Output<String> id, @Nullable EnterpriseDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseDatabase(name, id, state, options);
    }
}
