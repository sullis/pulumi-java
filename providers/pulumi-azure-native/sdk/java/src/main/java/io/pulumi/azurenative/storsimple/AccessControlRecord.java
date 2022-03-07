// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.AccessControlRecordArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The access control record.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:AccessControlRecord ACRForTest /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/accessControlRecords/ACRForTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:AccessControlRecord")
public class AccessControlRecord extends io.pulumi.resources.CustomResource {
    /**
     * The iSCSI initiator name (IQN).
     * 
     */
    @OutputExport(name="initiatorName", type=String.class, parameters={})
    private Output<String> initiatorName;

    /**
     * @return The iSCSI initiator name (IQN).
     * 
     */
    public Output<String> getInitiatorName() {
        return this.initiatorName;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The name of the object.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The number of volumes using the access control record.
     * 
     */
    @OutputExport(name="volumeCount", type=Integer.class, parameters={})
    private Output<Integer> volumeCount;

    /**
     * @return The number of volumes using the access control record.
     * 
     */
    public Output<Integer> getVolumeCount() {
        return this.volumeCount;
    }

    public interface BuilderApplicator {
        public void apply(AccessControlRecordArgs.Builder a);
    }
    private static io.pulumi.azurenative.storsimple.AccessControlRecordArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storsimple.AccessControlRecordArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessControlRecord(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessControlRecord(String name) {
        this(name, AccessControlRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessControlRecord(String name, AccessControlRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessControlRecord(String name, AccessControlRecordArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:AccessControlRecord", name, args == null ? AccessControlRecordArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessControlRecord(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:AccessControlRecord", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20161001:AccessControlRecord").build()),
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:AccessControlRecord").build())
            ))
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
    public static AccessControlRecord get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessControlRecord(name, id, options);
    }
}