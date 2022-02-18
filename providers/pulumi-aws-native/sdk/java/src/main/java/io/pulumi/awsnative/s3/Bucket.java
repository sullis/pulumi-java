// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.BucketArgs;
import io.pulumi.awsnative.s3.enums.BucketAccessControl;
import io.pulumi.awsnative.s3.outputs.BucketAccelerateConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketAnalyticsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketCorsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketEncryption;
import io.pulumi.awsnative.s3.outputs.BucketIntelligentTieringConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketInventoryConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLifecycleConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLoggingConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketMetricsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketNotificationConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketObjectLockConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketOwnershipControls;
import io.pulumi.awsnative.s3.outputs.BucketPublicAccessBlockConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketReplicationConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketTag;
import io.pulumi.awsnative.s3.outputs.BucketVersioningConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketWebsiteConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::S3::Bucket
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:s3:Bucket")
public class Bucket extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for the transfer acceleration state.
     * 
     */
    @OutputExport(name="accelerateConfiguration", type=BucketAccelerateConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketAccelerateConfiguration> accelerateConfiguration;

    /**
     * @return Configuration for the transfer acceleration state.
     * 
     */
    public Output</* @Nullable */ BucketAccelerateConfiguration> getAccelerateConfiguration() {
        return this.accelerateConfiguration;
    }
    /**
     * A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    @OutputExport(name="accessControl", type=BucketAccessControl.class, parameters={})
    private Output</* @Nullable */ BucketAccessControl> accessControl;

    /**
     * @return A canned access control list (ACL) that grants predefined permissions to the bucket.
     * 
     */
    public Output</* @Nullable */ BucketAccessControl> getAccessControl() {
        return this.accessControl;
    }
    /**
     * The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    @OutputExport(name="analyticsConfigurations", type=List.class, parameters={BucketAnalyticsConfiguration.class})
    private Output</* @Nullable */ List<BucketAnalyticsConfiguration>> analyticsConfigurations;

    /**
     * @return The configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     * 
     */
    public Output</* @Nullable */ List<BucketAnalyticsConfiguration>> getAnalyticsConfigurations() {
        return this.analyticsConfigurations;
    }
    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="bucketEncryption", type=BucketEncryption.class, parameters={})
    private Output</* @Nullable */ BucketEncryption> bucketEncryption;

    public Output</* @Nullable */ BucketEncryption> getBucketEncryption() {
        return this.bucketEncryption;
    }
    /**
     * A name for the bucket. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
     * 
     */
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output</* @Nullable */ String> bucketName;

    /**
     * @return A name for the bucket. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name.
     * 
     */
    public Output</* @Nullable */ String> getBucketName() {
        return this.bucketName;
    }
    /**
     * Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    @OutputExport(name="corsConfiguration", type=BucketCorsConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketCorsConfiguration> corsConfiguration;

    /**
     * @return Rules that define cross-origin resource sharing of objects in this bucket.
     * 
     */
    public Output</* @Nullable */ BucketCorsConfiguration> getCorsConfiguration() {
        return this.corsConfiguration;
    }
    /**
     * The IPv4 DNS name of the specified bucket.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The IPv4 DNS name of the specified bucket.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    /**
     * The IPv6 DNS name of the specified bucket. For more information about dual-stack endpoints, see [Using Amazon S3 Dual-Stack Endpoints](https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html).
     * 
     */
    @OutputExport(name="dualStackDomainName", type=String.class, parameters={})
    private Output<String> dualStackDomainName;

    /**
     * @return The IPv6 DNS name of the specified bucket. For more information about dual-stack endpoints, see [Using Amazon S3 Dual-Stack Endpoints](https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html).
     * 
     */
    public Output<String> getDualStackDomainName() {
        return this.dualStackDomainName;
    }
    /**
     * Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    @OutputExport(name="intelligentTieringConfigurations", type=List.class, parameters={BucketIntelligentTieringConfiguration.class})
    private Output</* @Nullable */ List<BucketIntelligentTieringConfiguration>> intelligentTieringConfigurations;

    /**
     * @return Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.
     * 
     */
    public Output</* @Nullable */ List<BucketIntelligentTieringConfiguration>> getIntelligentTieringConfigurations() {
        return this.intelligentTieringConfigurations;
    }
    /**
     * The inventory configuration for an Amazon S3 bucket.
     * 
     */
    @OutputExport(name="inventoryConfigurations", type=List.class, parameters={BucketInventoryConfiguration.class})
    private Output</* @Nullable */ List<BucketInventoryConfiguration>> inventoryConfigurations;

    /**
     * @return The inventory configuration for an Amazon S3 bucket.
     * 
     */
    public Output</* @Nullable */ List<BucketInventoryConfiguration>> getInventoryConfigurations() {
        return this.inventoryConfigurations;
    }
    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    @OutputExport(name="lifecycleConfiguration", type=BucketLifecycleConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketLifecycleConfiguration> lifecycleConfiguration;

    /**
     * @return Rules that define how Amazon S3 manages objects during their lifetime.
     * 
     */
    public Output</* @Nullable */ BucketLifecycleConfiguration> getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }
    /**
     * Settings that define where logs are stored.
     * 
     */
    @OutputExport(name="loggingConfiguration", type=BucketLoggingConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketLoggingConfiguration> loggingConfiguration;

    /**
     * @return Settings that define where logs are stored.
     * 
     */
    public Output</* @Nullable */ BucketLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }
    /**
     * Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    @OutputExport(name="metricsConfigurations", type=List.class, parameters={BucketMetricsConfiguration.class})
    private Output</* @Nullable */ List<BucketMetricsConfiguration>> metricsConfigurations;

    /**
     * @return Settings that define a metrics configuration for the CloudWatch request metrics from the bucket.
     * 
     */
    public Output</* @Nullable */ List<BucketMetricsConfiguration>> getMetricsConfigurations() {
        return this.metricsConfigurations;
    }
    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    @OutputExport(name="notificationConfiguration", type=BucketNotificationConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketNotificationConfiguration> notificationConfiguration;

    /**
     * @return Configuration that defines how Amazon S3 handles bucket notifications.
     * 
     */
    public Output</* @Nullable */ BucketNotificationConfiguration> getNotificationConfiguration() {
        return this.notificationConfiguration;
    }
    /**
     * Places an Object Lock configuration on the specified bucket.
     * 
     */
    @OutputExport(name="objectLockConfiguration", type=BucketObjectLockConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketObjectLockConfiguration> objectLockConfiguration;

    /**
     * @return Places an Object Lock configuration on the specified bucket.
     * 
     */
    public Output</* @Nullable */ BucketObjectLockConfiguration> getObjectLockConfiguration() {
        return this.objectLockConfiguration;
    }
    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     * 
     */
    @OutputExport(name="objectLockEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> objectLockEnabled;

    /**
     * @return Indicates whether this bucket has an Object Lock configuration enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getObjectLockEnabled() {
        return this.objectLockEnabled;
    }
    /**
     * Specifies the container element for object ownership rules.
     * 
     */
    @OutputExport(name="ownershipControls", type=BucketOwnershipControls.class, parameters={})
    private Output</* @Nullable */ BucketOwnershipControls> ownershipControls;

    /**
     * @return Specifies the container element for object ownership rules.
     * 
     */
    public Output</* @Nullable */ BucketOwnershipControls> getOwnershipControls() {
        return this.ownershipControls;
    }
    @OutputExport(name="publicAccessBlockConfiguration", type=BucketPublicAccessBlockConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketPublicAccessBlockConfiguration> publicAccessBlockConfiguration;

    public Output</* @Nullable */ BucketPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }
    /**
     * Returns the regional domain name of the specified bucket.
     * 
     */
    @OutputExport(name="regionalDomainName", type=String.class, parameters={})
    private Output<String> regionalDomainName;

    /**
     * @return Returns the regional domain name of the specified bucket.
     * 
     */
    public Output<String> getRegionalDomainName() {
        return this.regionalDomainName;
    }
    /**
     * Configuration for replicating objects in an S3 bucket.
     * 
     */
    @OutputExport(name="replicationConfiguration", type=BucketReplicationConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketReplicationConfiguration> replicationConfiguration;

    /**
     * @return Configuration for replicating objects in an S3 bucket.
     * 
     */
    public Output</* @Nullable */ BucketReplicationConfiguration> getReplicationConfiguration() {
        return this.replicationConfiguration;
    }
    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={BucketTag.class})
    private Output</* @Nullable */ List<BucketTag>> tags;

    /**
     * @return An arbitrary set of tags (key-value pairs) for this S3 bucket.
     * 
     */
    public Output</* @Nullable */ List<BucketTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="versioningConfiguration", type=BucketVersioningConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketVersioningConfiguration> versioningConfiguration;

    public Output</* @Nullable */ BucketVersioningConfiguration> getVersioningConfiguration() {
        return this.versioningConfiguration;
    }
    @OutputExport(name="websiteConfiguration", type=BucketWebsiteConfiguration.class, parameters={})
    private Output</* @Nullable */ BucketWebsiteConfiguration> websiteConfiguration;

    public Output</* @Nullable */ BucketWebsiteConfiguration> getWebsiteConfiguration() {
        return this.websiteConfiguration;
    }
    /**
     * The Amazon S3 website endpoint for the specified bucket.
     * 
     */
    @OutputExport(name="websiteURL", type=String.class, parameters={})
    private Output<String> websiteURL;

    /**
     * @return The Amazon S3 website endpoint for the specified bucket.
     * 
     */
    public Output<String> getWebsiteURL() {
        return this.websiteURL;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(String name, @Nullable BucketArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:Bucket", name, args == null ? BucketArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Bucket(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:Bucket", name, null, makeResourceOptions(options, id));
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
    public static Bucket get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, options);
    }
}
