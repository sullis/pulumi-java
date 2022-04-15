// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediapackage.AssetArgs;
import io.pulumi.awsnative.mediapackage.outputs.AssetEgressEndpoint;
import io.pulumi.awsnative.mediapackage.outputs.AssetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::MediaPackage::Asset
 * 
 */
@ResourceType(type="aws-native:mediapackage:Asset")
public class Asset extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Asset.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Asset.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The time the Asset was initially submitted for Ingest.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the Asset was initially submitted for Ingest.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The list of egress endpoints available for the Asset.
     * 
     */
    @Export(name="egressEndpoints", type=List.class, parameters={AssetEgressEndpoint.class})
    private Output<List<AssetEgressEndpoint>> egressEndpoints;

    /**
     * @return The list of egress endpoints available for the Asset.
     * 
     */
    public Output<List<AssetEgressEndpoint>> egressEndpoints() {
        return this.egressEndpoints;
    }
    /**
     * The ID of the PackagingGroup for the Asset.
     * 
     */
    @Export(name="packagingGroupId", type=String.class, parameters={})
    private Output<String> packagingGroupId;

    /**
     * @return The ID of the PackagingGroup for the Asset.
     * 
     */
    public Output<String> packagingGroupId() {
        return this.packagingGroupId;
    }
    /**
     * The resource ID to include in SPEKE key requests.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The resource ID to include in SPEKE key requests.
     * 
     */
    public Output</* @Nullable */ String> resourceId() {
        return this.resourceId;
    }
    /**
     * ARN of the source object in S3.
     * 
     */
    @Export(name="sourceArn", type=String.class, parameters={})
    private Output<String> sourceArn;

    /**
     * @return ARN of the source object in S3.
     * 
     */
    public Output<String> sourceArn() {
        return this.sourceArn;
    }
    /**
     * The IAM role_arn used to access the source S3 bucket.
     * 
     */
    @Export(name="sourceRoleArn", type=String.class, parameters={})
    private Output<String> sourceRoleArn;

    /**
     * @return The IAM role_arn used to access the source S3 bucket.
     * 
     */
    public Output<String> sourceRoleArn() {
        return this.sourceRoleArn;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={AssetTag.class})
    private Output</* @Nullable */ List<AssetTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output</* @Nullable */ List<AssetTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Asset(String name) {
        this(name, AssetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Asset(String name, AssetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Asset(String name, AssetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:Asset", name, args == null ? AssetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Asset(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:Asset", name, null, makeResourceOptions(options, id));
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
    public static Asset get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Asset(name, id, options);
    }
}
