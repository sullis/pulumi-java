// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.ResolverQueryLoggingConfigArgs;
import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigShareStatus;
import io.pulumi.awsnative.route53resolver.enums.ResolverQueryLoggingConfigStatus;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::ResolverQueryLoggingConfig.
 * 
 */
@ResourceType(type="aws-native:route53resolver:ResolverQueryLoggingConfig")
public class ResolverQueryLoggingConfig extends io.pulumi.resources.CustomResource {
    /**
     * Arn
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Arn
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Count
     * 
     */
    @OutputExport(name="associationCount", type=Integer.class, parameters={})
    private Output<Integer> associationCount;

    /**
     * @return Count
     * 
     */
    public Output<Integer> getAssociationCount() {
        return this.associationCount;
    }
    /**
     * Rfc3339TimeString
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Rfc3339TimeString
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The id of the creator request.
     * 
     */
    @OutputExport(name="creatorRequestId", type=String.class, parameters={})
    private Output<String> creatorRequestId;

    /**
     * @return The id of the creator request.
     * 
     */
    public Output<String> getCreatorRequestId() {
        return this.creatorRequestId;
    }
    /**
     * destination arn
     * 
     */
    @OutputExport(name="destinationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> destinationArn;

    /**
     * @return destination arn
     * 
     */
    public Output</* @Nullable */ String> getDestinationArn() {
        return this.destinationArn;
    }
    /**
     * ResolverQueryLogConfigName
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return ResolverQueryLogConfigName
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * AccountId
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AccountId
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    @OutputExport(name="shareStatus", type=ResolverQueryLoggingConfigShareStatus.class, parameters={})
    private Output<ResolverQueryLoggingConfigShareStatus> shareStatus;

    /**
     * @return ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    public Output<ResolverQueryLoggingConfigShareStatus> getShareStatus() {
        return this.shareStatus;
    }
    /**
     * ResolverQueryLogConfigStatus, possible values are CREATING, CREATED, DELETED AND FAILED.
     * 
     */
    @OutputExport(name="status", type=ResolverQueryLoggingConfigStatus.class, parameters={})
    private Output<ResolverQueryLoggingConfigStatus> status;

    /**
     * @return ResolverQueryLogConfigStatus, possible values are CREATING, CREATED, DELETED AND FAILED.
     * 
     */
    public Output<ResolverQueryLoggingConfigStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverQueryLoggingConfig(String name, @Nullable ResolverQueryLoggingConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverQueryLoggingConfig", name, args == null ? ResolverQueryLoggingConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverQueryLoggingConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverQueryLoggingConfig", name, null, makeResourceOptions(options, id));
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
    public static ResolverQueryLoggingConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverQueryLoggingConfig(name, id, options);
    }
}
