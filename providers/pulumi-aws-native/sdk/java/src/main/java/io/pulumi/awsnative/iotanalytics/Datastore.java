// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotanalytics.DatastoreArgs;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreFileFormatConfiguration;
import io.pulumi.awsnative.iotanalytics.outputs.DatastorePartitions;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreStorage;
import io.pulumi.awsnative.iotanalytics.outputs.DatastoreTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IoTAnalytics::Datastore
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotanalytics:Datastore")
public class Datastore extends io.pulumi.resources.CustomResource {
    @OutputExport(name="datastoreName", type=String.class, parameters={})
    private Output</* @Nullable */ String> datastoreName;

    public Output</* @Nullable */ String> getDatastoreName() {
        return this.datastoreName;
    }
    @OutputExport(name="datastorePartitions", type=DatastorePartitions.class, parameters={})
    private Output</* @Nullable */ DatastorePartitions> datastorePartitions;

    public Output</* @Nullable */ DatastorePartitions> getDatastorePartitions() {
        return this.datastorePartitions;
    }
    @OutputExport(name="datastoreStorage", type=DatastoreStorage.class, parameters={})
    private Output</* @Nullable */ DatastoreStorage> datastoreStorage;

    public Output</* @Nullable */ DatastoreStorage> getDatastoreStorage() {
        return this.datastoreStorage;
    }
    @OutputExport(name="fileFormatConfiguration", type=DatastoreFileFormatConfiguration.class, parameters={})
    private Output</* @Nullable */ DatastoreFileFormatConfiguration> fileFormatConfiguration;

    public Output</* @Nullable */ DatastoreFileFormatConfiguration> getFileFormatConfiguration() {
        return this.fileFormatConfiguration;
    }
    @OutputExport(name="retentionPeriod", type=DatastoreRetentionPeriod.class, parameters={})
    private Output</* @Nullable */ DatastoreRetentionPeriod> retentionPeriod;

    public Output</* @Nullable */ DatastoreRetentionPeriod> getRetentionPeriod() {
        return this.retentionPeriod;
    }
    @OutputExport(name="tags", type=List.class, parameters={DatastoreTag.class})
    private Output</* @Nullable */ List<DatastoreTag>> tags;

    public Output</* @Nullable */ List<DatastoreTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Datastore(String name, @Nullable DatastoreArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Datastore", name, args == null ? DatastoreArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Datastore(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotanalytics:Datastore", name, null, makeResourceOptions(options, id));
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
    public static Datastore get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Datastore(name, id, options);
    }
}
