// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.redshift.EndpointAuthorizationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a cluster across AWS accounts.
 * 
 */
@ResourceType(type="aws-native:redshift:EndpointAuthorization")
public class EndpointAuthorization extends io.pulumi.resources.CustomResource {
    /**
     * The target AWS account ID to grant or revoke access for.
     * 
     */
    @OutputExport(name="account", type=String.class, parameters={})
    private Output<String> account;

    /**
     * @return The target AWS account ID to grant or revoke access for.
     * 
     */
    public Output<String> getAccount() {
        return this.account;
    }
    /**
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * 
     */
    @OutputExport(name="allowedAllVPCs", type=Boolean.class, parameters={})
    private Output<Boolean> allowedAllVPCs;

    /**
     * @return Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * 
     */
    public Output<Boolean> getAllowedAllVPCs() {
        return this.allowedAllVPCs;
    }
    /**
     * The VPCs allowed access to the cluster.
     * 
     */
    @OutputExport(name="allowedVPCs", type=List.class, parameters={String.class})
    private Output<List<String>> allowedVPCs;

    /**
     * @return The VPCs allowed access to the cluster.
     * 
     */
    public Output<List<String>> getAllowedVPCs() {
        return this.allowedVPCs;
    }
    /**
     * The time (UTC) when the authorization was created.
     * 
     */
    @OutputExport(name="authorizeTime", type=String.class, parameters={})
    private Output<String> authorizeTime;

    /**
     * @return The time (UTC) when the authorization was created.
     * 
     */
    public Output<String> getAuthorizeTime() {
        return this.authorizeTime;
    }
    /**
     * The cluster identifier.
     * 
     */
    @OutputExport(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The status of the cluster.
     * 
     */
    @OutputExport(name="clusterStatus", type=String.class, parameters={})
    private Output<String> clusterStatus;

    /**
     * @return The status of the cluster.
     * 
     */
    public Output<String> getClusterStatus() {
        return this.clusterStatus;
    }
    /**
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * 
     */
    @OutputExport(name="endpointCount", type=Integer.class, parameters={})
    private Output<Integer> endpointCount;

    /**
     * @return The number of Redshift-managed VPC endpoints created for the authorization.
     * 
     */
    public Output<Integer> getEndpointCount() {
        return this.endpointCount;
    }
    /**
     *  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
     * 
     */
    @OutputExport(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return  Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
     * 
     */
    public Output</* @Nullable */ Boolean> getForce() {
        return this.force;
    }
    /**
     * The AWS account ID of the grantee of the cluster.
     * 
     */
    @OutputExport(name="grantee", type=String.class, parameters={})
    private Output<String> grantee;

    /**
     * @return The AWS account ID of the grantee of the cluster.
     * 
     */
    public Output<String> getGrantee() {
        return this.grantee;
    }
    /**
     * The AWS account ID of the cluster owner.
     * 
     */
    @OutputExport(name="grantor", type=String.class, parameters={})
    private Output<String> grantor;

    /**
     * @return The AWS account ID of the cluster owner.
     * 
     */
    public Output<String> getGrantor() {
        return this.grantor;
    }
    /**
     * The status of the authorization action.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the authorization action.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
     */
    @OutputExport(name="vpcIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpcIds;

    /**
     * @return The virtual private cloud (VPC) identifiers to grant or revoke access to.
     * 
     */
    public Output</* @Nullable */ List<String>> getVpcIds() {
        return this.vpcIds;
    }

    public interface BuilderApplicator {
        public void apply(EndpointAuthorizationArgs.Builder a);
    }
    private static io.pulumi.awsnative.redshift.EndpointAuthorizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.redshift.EndpointAuthorizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EndpointAuthorization(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointAuthorization(String name) {
        this(name, EndpointAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointAuthorization(String name, EndpointAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointAuthorization(String name, EndpointAuthorizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:EndpointAuthorization", name, args == null ? EndpointAuthorizationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EndpointAuthorization(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:redshift:EndpointAuthorization", name, null, makeResourceOptions(options, id));
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
    public static EndpointAuthorization get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EndpointAuthorization(name, id, options);
    }
}