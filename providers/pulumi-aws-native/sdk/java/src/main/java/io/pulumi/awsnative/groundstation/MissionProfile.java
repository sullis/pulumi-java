// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.groundstation.MissionProfileArgs;
import io.pulumi.awsnative.groundstation.outputs.MissionProfileDataflowEdge;
import io.pulumi.awsnative.groundstation.outputs.MissionProfileTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS Ground Station Mission Profile resource type for CloudFormation.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:groundstation:MissionProfile")
public class MissionProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Post-pass time needed after the contact.
     * 
     */
    @OutputExport(name="contactPostPassDurationSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> contactPostPassDurationSeconds;

    /**
     * @return Post-pass time needed after the contact.
     * 
     */
    public Output</* @Nullable */ Integer> getContactPostPassDurationSeconds() {
        return this.contactPostPassDurationSeconds;
    }
    /**
     * Pre-pass time needed before the contact.
     * 
     */
    @OutputExport(name="contactPrePassDurationSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> contactPrePassDurationSeconds;

    /**
     * @return Pre-pass time needed before the contact.
     * 
     */
    public Output</* @Nullable */ Integer> getContactPrePassDurationSeconds() {
        return this.contactPrePassDurationSeconds;
    }
    @OutputExport(name="dataflowEdges", type=List.class, parameters={MissionProfileDataflowEdge.class})
    private Output<List<MissionProfileDataflowEdge>> dataflowEdges;

    public Output<List<MissionProfileDataflowEdge>> getDataflowEdges() {
        return this.dataflowEdges;
    }
    /**
     * Visibilities with shorter duration than the specified minimum viable contact duration will be ignored when searching for available contacts.
     * 
     */
    @OutputExport(name="minimumViableContactDurationSeconds", type=Integer.class, parameters={})
    private Output<Integer> minimumViableContactDurationSeconds;

    /**
     * @return Visibilities with shorter duration than the specified minimum viable contact duration will be ignored when searching for available contacts.
     * 
     */
    public Output<Integer> getMinimumViableContactDurationSeconds() {
        return this.minimumViableContactDurationSeconds;
    }
    /**
     * A name used to identify a mission profile.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name used to identify a mission profile.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="tags", type=List.class, parameters={MissionProfileTag.class})
    private Output</* @Nullable */ List<MissionProfileTag>> tags;

    public Output</* @Nullable */ List<MissionProfileTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="trackingConfigArn", type=String.class, parameters={})
    private Output<String> trackingConfigArn;

    public Output<String> getTrackingConfigArn() {
        return this.trackingConfigArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MissionProfile(String name, MissionProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:MissionProfile", name, args == null ? MissionProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MissionProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:MissionProfile", name, null, makeResourceOptions(options, id));
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
    public static MissionProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MissionProfile(name, id, options);
    }
}
