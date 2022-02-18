// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.efs.AccessPointArgs;
import io.pulumi.awsnative.efs.outputs.AccessPointPosixUser;
import io.pulumi.awsnative.efs.outputs.AccessPointRootDirectory;
import io.pulumi.awsnative.efs.outputs.AccessPointTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EFS::AccessPoint
 * 
 */
@ResourceType(type="aws-native:efs:AccessPoint")
public class AccessPoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessPointId", type=String.class, parameters={})
    private Output<String> accessPointId;

    public Output<String> getAccessPointId() {
        return this.accessPointId;
    }
    @OutputExport(name="accessPointTags", type=List.class, parameters={AccessPointTag.class})
    private Output</* @Nullable */ List<AccessPointTag>> accessPointTags;

    public Output</* @Nullable */ List<AccessPointTag>> getAccessPointTags() {
        return this.accessPointTags;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * (optional) A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * 
     */
    @OutputExport(name="clientToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientToken;

    /**
     * @return (optional) A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * 
     */
    public Output</* @Nullable */ String> getClientToken() {
        return this.clientToken;
    }
    /**
     * The ID of the EFS file system that the access point provides access to.
     * 
     */
    @OutputExport(name="fileSystemId", type=String.class, parameters={})
    private Output<String> fileSystemId;

    /**
     * @return The ID of the EFS file system that the access point provides access to.
     * 
     */
    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The operating system user and group applied to all file system requests made using the access point.
     * 
     */
    @OutputExport(name="posixUser", type=AccessPointPosixUser.class, parameters={})
    private Output</* @Nullable */ AccessPointPosixUser> posixUser;

    /**
     * @return The operating system user and group applied to all file system requests made using the access point.
     * 
     */
    public Output</* @Nullable */ AccessPointPosixUser> getPosixUser() {
        return this.posixUser;
    }
    /**
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory>Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
     * 
     */
    @OutputExport(name="rootDirectory", type=AccessPointRootDirectory.class, parameters={})
    private Output</* @Nullable */ AccessPointRootDirectory> rootDirectory;

    /**
     * @return Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory>Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
     * 
     */
    public Output</* @Nullable */ AccessPointRootDirectory> getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessPoint(String name, AccessPointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:AccessPoint", name, args == null ? AccessPointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessPoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:efs:AccessPoint", name, null, makeResourceOptions(options, id));
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
    public static AccessPoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessPoint(name, id, options);
    }
}
