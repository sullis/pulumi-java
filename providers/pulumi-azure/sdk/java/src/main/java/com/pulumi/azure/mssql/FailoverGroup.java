// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.FailoverGroupArgs;
import com.pulumi.azure.mssql.inputs.FailoverGroupState;
import com.pulumi.azure.mssql.outputs.FailoverGroupPartnerServer;
import com.pulumi.azure.mssql.outputs.FailoverGroupReadWriteEndpointFailoverPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Microsoft Azure SQL Failover Group.
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
 *         var primary = new Server(&#34;primary&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;missadministrator&#34;)
 *             .administratorLoginPassword(&#34;thisIsKat11&#34;)
 *             .build());
 * 
 *         var secondary = new Server(&#34;secondary&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;missadministrator&#34;)
 *             .administratorLoginPassword(&#34;thisIsKat12&#34;)
 *             .build());
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .serverId(primary.getId())
 *             .skuName(&#34;S1&#34;)
 *             .collation(&#34;SQL_Latin1_General_CP1_CI_AS&#34;)
 *             .maxSizeGb(&#34;200&#34;)
 *             .build());
 * 
 *         var exampleFailoverGroup = new FailoverGroup(&#34;exampleFailoverGroup&#34;, FailoverGroupArgs.builder()        
 *             .serverId(primary.getId())
 *             .databases(exampleDatabase.getId())
 *             .partnerServers(FailoverGroupPartnerServer.builder()
 *                 .id(secondary.getId())
 *                 .build())
 *             .readWriteEndpointFailoverPolicy(FailoverGroupReadWriteEndpointFailoverPolicy.builder()
 *                 .mode(&#34;Automatic&#34;)
 *                 .graceMinutes(80)
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;environment&#34;, &#34;prod&#34;),
 *                 Map.entry(&#34;database&#34;, &#34;example&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Failover Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/failoverGroup:FailoverGroup example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Sql/servers/server1/failoverGroups/failoverGroup1
 * ```
 * 
 */
@ResourceType(type="azure:mssql/failoverGroup:FailoverGroup")
public class FailoverGroup extends com.pulumi.resources.CustomResource {
    /**
     * A set of database names to include in the failover group.
     * 
     */
    @Export(name="databases", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> databases;

    /**
     * @return A set of database names to include in the failover group.
     * 
     */
    public Output<Optional<List<String>>> databases() {
        return Codegen.optional(this.databases);
    }
    /**
     * The name of the Failover Group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Failover Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `partner_server` block as defined below.
     * 
     */
    @Export(name="partnerServers", type=List.class, parameters={FailoverGroupPartnerServer.class})
    private Output<List<FailoverGroupPartnerServer>> partnerServers;

    /**
     * @return A `partner_server` block as defined below.
     * 
     */
    public Output<List<FailoverGroupPartnerServer>> partnerServers() {
        return this.partnerServers;
    }
    /**
     * A `read_write_endpoint_failover_policy` block as defined below.
     * 
     */
    @Export(name="readWriteEndpointFailoverPolicy", type=FailoverGroupReadWriteEndpointFailoverPolicy.class, parameters={})
    private Output<FailoverGroupReadWriteEndpointFailoverPolicy> readWriteEndpointFailoverPolicy;

    /**
     * @return A `read_write_endpoint_failover_policy` block as defined below.
     * 
     */
    public Output<FailoverGroupReadWriteEndpointFailoverPolicy> readWriteEndpointFailoverPolicy() {
        return this.readWriteEndpointFailoverPolicy;
    }
    /**
     * Whether failover is enabled for the readonly endpoint. Defaults to `false`.
     * 
     */
    @Export(name="readonlyEndpointFailoverPolicyEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> readonlyEndpointFailoverPolicyEnabled;

    /**
     * @return Whether failover is enabled for the readonly endpoint. Defaults to `false`.
     * 
     */
    public Output<Boolean> readonlyEndpointFailoverPolicyEnabled() {
        return this.readonlyEndpointFailoverPolicyEnabled;
    }
    /**
     * The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The ID of the primary SQL Server on which to create the failover group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FailoverGroup(String name) {
        this(name, FailoverGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FailoverGroup(String name, FailoverGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FailoverGroup(String name, FailoverGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/failoverGroup:FailoverGroup", name, args == null ? FailoverGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FailoverGroup(String name, Output<String> id, @Nullable FailoverGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/failoverGroup:FailoverGroup", name, state, makeResourceOptions(options, id));
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
    public static FailoverGroup get(String name, Output<String> id, @Nullable FailoverGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FailoverGroup(name, id, state, options);
    }
}
