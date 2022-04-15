// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.s3.MultiRegionAccessPointArgs;
import io.pulumi.awsnative.s3.outputs.MultiRegionAccessPointPublicAccessBlockConfiguration;
import io.pulumi.awsnative.s3.outputs.MultiRegionAccessPointRegion;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS::S3::MultiRegionAccessPoint is an Amazon S3 resource type that dynamically routes S3 requests to easily satisfy geographic compliance requirements based on customer-defined routing policies.
 * 
 */
@ResourceType(type="aws-native:s3:MultiRegionAccessPoint")
public class MultiRegionAccessPoint extends io.pulumi.resources.CustomResource {
    /**
     * The alias is a unique identifier to, and is part of the public DNS name for this Multi Region Access Point
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The alias is a unique identifier to, and is part of the public DNS name for this Multi Region Access Point
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * The timestamp of the when the Multi Region Access Point is created
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The timestamp of the when the Multi Region Access Point is created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The name you want to assign to this Multi Region Access Point.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name you want to assign to this Multi Region Access Point.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi Region Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status 'The Meaning of Public' in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Export(name="publicAccessBlockConfiguration", type=MultiRegionAccessPointPublicAccessBlockConfiguration.class, parameters={})
    private Output</* @Nullable */ MultiRegionAccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration;

    /**
     * @return The PublicAccessBlock configuration that you want to apply to this Multi Region Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status 'The Meaning of Public' in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Output</* @Nullable */ MultiRegionAccessPointPublicAccessBlockConfiguration> publicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }
    /**
     * The list of buckets that you want to associate this Multi Region Access Point with.
     * 
     */
    @Export(name="regions", type=List.class, parameters={MultiRegionAccessPointRegion.class})
    private Output<List<MultiRegionAccessPointRegion>> regions;

    /**
     * @return The list of buckets that you want to associate this Multi Region Access Point with.
     * 
     */
    public Output<List<MultiRegionAccessPointRegion>> regions() {
        return this.regions;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MultiRegionAccessPoint(String name) {
        this(name, MultiRegionAccessPointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MultiRegionAccessPoint(String name, MultiRegionAccessPointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MultiRegionAccessPoint(String name, MultiRegionAccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPoint", name, args == null ? MultiRegionAccessPointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MultiRegionAccessPoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:s3:MultiRegionAccessPoint", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MultiRegionAccessPoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MultiRegionAccessPoint(name, id, options);
    }
}
