// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.DiskArgs;
import io.pulumi.awsnative.lightsail.outputs.DiskAddOn;
import io.pulumi.awsnative.lightsail.outputs.DiskLocation;
import io.pulumi.awsnative.lightsail.outputs.DiskTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lightsail::Disk
 * 
 */
@ResourceType(type="aws-native:lightsail:Disk")
public class Disk extends io.pulumi.resources.CustomResource {
    /**
     * An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    @Export(name="addOns", type=List.class, parameters={DiskAddOn.class})
    private Output</* @Nullable */ List<DiskAddOn>> addOns;

    /**
     * @return An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    public Output</* @Nullable */ List<DiskAddOn>> addOns() {
        return this.addOns;
    }
    /**
     * Name of the attached Lightsail Instance
     * 
     */
    @Export(name="attachedTo", type=String.class, parameters={})
    private Output<String> attachedTo;

    /**
     * @return Name of the attached Lightsail Instance
     * 
     */
    public Output<String> attachedTo() {
        return this.attachedTo;
    }
    /**
     * Attachment State of the Lightsail disk
     * 
     */
    @Export(name="attachmentState", type=String.class, parameters={})
    private Output<String> attachmentState;

    /**
     * @return Attachment State of the Lightsail disk
     * 
     */
    public Output<String> attachmentState() {
        return this.attachmentState;
    }
    /**
     * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). Be sure to add the include Availability Zones parameter to your request.
     * 
     */
    public Output</* @Nullable */ String> availabilityZone() {
        return this.availabilityZone;
    }
    @Export(name="diskArn", type=String.class, parameters={})
    private Output<String> diskArn;

    public Output<String> diskArn() {
        return this.diskArn;
    }
    /**
     * The names to use for your new Lightsail disk.
     * 
     */
    @Export(name="diskName", type=String.class, parameters={})
    private Output<String> diskName;

    /**
     * @return The names to use for your new Lightsail disk.
     * 
     */
    public Output<String> diskName() {
        return this.diskName;
    }
    /**
     * Iops of the Lightsail disk
     * 
     */
    @Export(name="iops", type=Integer.class, parameters={})
    private Output<Integer> iops;

    /**
     * @return Iops of the Lightsail disk
     * 
     */
    public Output<Integer> iops() {
        return this.iops;
    }
    /**
     * Check is Disk is attached state
     * 
     */
    @Export(name="isAttached", type=Boolean.class, parameters={})
    private Output<Boolean> isAttached;

    /**
     * @return Check is Disk is attached state
     * 
     */
    public Output<Boolean> isAttached() {
        return this.isAttached;
    }
    @Export(name="location", type=DiskLocation.class, parameters={})
    private Output<DiskLocation> location;

    public Output<DiskLocation> location() {
        return this.location;
    }
    /**
     * Path of the  attached Disk
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output<String> path;

    /**
     * @return Path of the  attached Disk
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * Resource type of Lightsail instance.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return Resource type of Lightsail instance.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * Size of the Lightsail disk
     * 
     */
    @Export(name="sizeInGb", type=Integer.class, parameters={})
    private Output<Integer> sizeInGb;

    /**
     * @return Size of the Lightsail disk
     * 
     */
    public Output<Integer> sizeInGb() {
        return this.sizeInGb;
    }
    /**
     * State of the Lightsail disk
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the Lightsail disk
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Support code to help identify any issues
     * 
     */
    @Export(name="supportCode", type=String.class, parameters={})
    private Output<String> supportCode;

    /**
     * @return Support code to help identify any issues
     * 
     */
    public Output<String> supportCode() {
        return this.supportCode;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DiskTag.class})
    private Output</* @Nullable */ List<DiskTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<DiskTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Disk(String name) {
        this(name, DiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Disk(String name, DiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Disk(String name, DiskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Disk", name, args == null ? DiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Disk(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Disk", name, null, makeResourceOptions(options, id));
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
    public static Disk get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Disk(name, id, options);
    }
}
