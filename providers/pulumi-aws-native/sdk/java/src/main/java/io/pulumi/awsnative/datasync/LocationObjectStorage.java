// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.LocationObjectStorageArgs;
import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.outputs.LocationObjectStorageTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationObjectStorage.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:datasync:LocationObjectStorage")
public class LocationObjectStorage extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The access key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    @OutputExport(name="accessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessKey;

    /**
     * @return Optional. The access key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    public Output</* @Nullable */ String> getAccessKey() {
        return this.accessKey;
    }
    /**
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
     */
    @OutputExport(name="agentArns", type=List.class, parameters={String.class})
    private Output<List<String>> agentArns;

    /**
     * @return The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * 
     */
    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }
    /**
     * The name of the bucket on the self-managed object storage server.
     * 
     */
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return The name of the bucket on the self-managed object storage server.
     * 
     */
    public Output<String> getBucketName() {
        return this.bucketName;
    }
    /**
     * The Amazon Resource Name (ARN) of the location that is created.
     * 
     */
    @OutputExport(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the location that is created.
     * 
     */
    public Output<String> getLocationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the object storage location that was described.
     * 
     */
    @OutputExport(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the object storage location that was described.
     * 
     */
    public Output<String> getLocationUri() {
        return this.locationUri;
    }
    /**
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    @OutputExport(name="secretKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretKey;

    /**
     * @return Optional. The secret key is used if credentials are required to access the self-managed object storage server.
     * 
     */
    public Output</* @Nullable */ String> getSecretKey() {
        return this.secretKey;
    }
    /**
     * The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server.
     * 
     */
    @OutputExport(name="serverHostname", type=String.class, parameters={})
    private Output<String> serverHostname;

    /**
     * @return The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server.
     * 
     */
    public Output<String> getServerHostname() {
        return this.serverHostname;
    }
    /**
     * The port that your self-managed server accepts inbound network traffic on.
     * 
     */
    @OutputExport(name="serverPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> serverPort;

    /**
     * @return The port that your self-managed server accepts inbound network traffic on.
     * 
     */
    public Output</* @Nullable */ Integer> getServerPort() {
        return this.serverPort;
    }
    /**
     * The protocol that the object storage server uses to communicate.
     * 
     */
    @OutputExport(name="serverProtocol", type=LocationObjectStorageServerProtocol.class, parameters={})
    private Output</* @Nullable */ LocationObjectStorageServerProtocol> serverProtocol;

    /**
     * @return The protocol that the object storage server uses to communicate.
     * 
     */
    public Output</* @Nullable */ LocationObjectStorageServerProtocol> getServerProtocol() {
        return this.serverProtocol;
    }
    /**
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * 
     */
    @OutputExport(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return The subdirectory in the self-managed object storage server that is used to read data from.
     * 
     */
    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={LocationObjectStorageTag.class})
    private Output</* @Nullable */ List<LocationObjectStorageTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<LocationObjectStorageTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationObjectStorage(String name, LocationObjectStorageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationObjectStorage", name, args == null ? LocationObjectStorageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocationObjectStorage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationObjectStorage", name, null, makeResourceOptions(options, id));
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
    public static LocationObjectStorage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocationObjectStorage(name, id, options);
    }
}
