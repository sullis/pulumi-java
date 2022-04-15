// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ProxyEndpointArgs;
import io.pulumi.aws.rds.inputs.ProxyEndpointState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB proxy endpoint resource. For additional information, see the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html#rds-proxy-endpoints).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DB proxy endpoints can be imported using the `DB-PROXY-NAME/DB-PROXY-ENDPOINT-NAME`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/proxyEndpoint:ProxyEndpoint example example/example
 * ```
 * 
 */
@ResourceType(type="aws:rds/proxyEndpoint:ProxyEndpoint")
public class ProxyEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the proxy endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the proxy endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Export(name="dbProxyEndpointName", type=String.class, parameters={})
    private Output<String> dbProxyEndpointName;

    /**
     * @return The identifier for the proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    public Output<String> dbProxyEndpointName() {
        return this.dbProxyEndpointName;
    }
    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    @Export(name="dbProxyName", type=String.class, parameters={})
    private Output<String> dbProxyName;

    /**
     * @return The name of the DB proxy associated with the DB proxy endpoint that you create.
     * 
     */
    public Output<String> dbProxyName() {
        return this.dbProxyName;
    }
    /**
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * Indicates whether this endpoint is the default endpoint for the associated DB proxy.
     * 
     */
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return Indicates whether this endpoint is the default endpoint for the associated DB proxy.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    @Export(name="targetRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetRole;

    /**
     * @return Indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The default is `READ_WRITE`. Valid values are `READ_WRITE` and `READ_ONLY`.
     * 
     */
    public Output</* @Nullable */ String> targetRole() {
        return this.targetRole;
    }
    /**
     * The VPC ID of the DB proxy endpoint.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID of the DB proxy endpoint.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSubnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSubnetIds;

    /**
     * @return One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProxyEndpoint(String name) {
        this(name, ProxyEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProxyEndpoint(String name, ProxyEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProxyEndpoint(String name, ProxyEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyEndpoint:ProxyEndpoint", name, args == null ? ProxyEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProxyEndpoint(String name, Output<String> id, @Nullable ProxyEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyEndpoint:ProxyEndpoint", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProxyEndpoint get(String name, Output<String> id, @Nullable ProxyEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProxyEndpoint(name, id, state, options);
    }
}
