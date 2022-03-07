// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.BucketACLArgs;
import io.pulumi.gcp.storage.inputs.BucketACLState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Authoritatively manages a bucket's ACLs in Google cloud storage service (GCS). For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls).
 * 
 * Bucket ACLs can be managed non authoritatively using the `storage_bucket_access_control` resource. Do not use these two resources in conjunction to manage the same bucket.
 * 
 * Permissions can be granted either by ACLs or Cloud IAM policies. In general, permissions granted by Cloud IAM policies do not appear in ACLs, and permissions granted by ACLs do not appear in Cloud IAM policies. The only exception is for ACLs applied directly on a bucket and certain bucket-level Cloud IAM policies, as described in [Cloud IAM relation to ACLs](https://cloud.google.com/storage/docs/access-control/iam#acls).
 * 
 * **NOTE** This resource will not remove the `project-owners-<project_id>` entity from the `OWNER` role.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:storage/bucketACL:BucketACL")
public class BucketACL extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket it applies to.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket it applies to.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Configure this ACL to be the default ACL.
     * 
     */
    @OutputExport(name="defaultAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAcl;

    /**
     * @return Configure this ACL to be the default ACL.
     * 
     */
    public Output</* @Nullable */ String> getDefaultAcl() {
        return this.defaultAcl;
    }
    /**
     * The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @OutputExport(name="predefinedAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> predefinedAcl;

    /**
     * @return The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    public Output</* @Nullable */ String> getPredefinedAcl() {
        return this.predefinedAcl;
    }
    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    @OutputExport(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    /**
     * @return List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    public Output<List<String>> getRoleEntities() {
        return this.roleEntities;
    }

    public interface BuilderApplicator {
        public void apply(BucketACLArgs.Builder a);
    }
    private static io.pulumi.gcp.storage.BucketACLArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.storage.BucketACLArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketACL(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketACL(String name) {
        this(name, BucketACLArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketACL(String name, BucketACLArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketACL(String name, BucketACLArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketACL:BucketACL", name, args == null ? BucketACLArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BucketACL(String name, Input<String> id, @Nullable BucketACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucketACL:BucketACL", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BucketACL get(String name, Input<String> id, @Nullable BucketACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketACL(name, id, state, options);
    }
}