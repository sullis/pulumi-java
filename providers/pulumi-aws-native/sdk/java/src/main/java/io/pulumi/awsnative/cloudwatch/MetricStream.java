// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudwatch.MetricStreamArgs;
import io.pulumi.awsnative.cloudwatch.outputs.MetricStreamFilter;
import io.pulumi.awsnative.cloudwatch.outputs.MetricStreamTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for Metric Stream
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:cloudwatch:MetricStream")
public class MetricStream extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the metric stream.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the metric stream.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The date of creation of the metric stream.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date of creation of the metric stream.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * Define which metrics will be not streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    @OutputExport(name="excludeFilters", type=List.class, parameters={MetricStreamFilter.class})
    private Output</* @Nullable */ List<MetricStreamFilter>> excludeFilters;

    /**
     * @return Define which metrics will be not streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    public Output</* @Nullable */ List<MetricStreamFilter>> getExcludeFilters() {
        return this.excludeFilters;
    }
    /**
     * The ARN of the Kinesis Firehose where to stream the data.
     * 
     */
    @OutputExport(name="firehoseArn", type=String.class, parameters={})
    private Output<String> firehoseArn;

    /**
     * @return The ARN of the Kinesis Firehose where to stream the data.
     * 
     */
    public Output<String> getFirehoseArn() {
        return this.firehoseArn;
    }
    /**
     * Define which metrics will be streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    @OutputExport(name="includeFilters", type=List.class, parameters={MetricStreamFilter.class})
    private Output</* @Nullable */ List<MetricStreamFilter>> includeFilters;

    /**
     * @return Define which metrics will be streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    public Output</* @Nullable */ List<MetricStreamFilter>> getIncludeFilters() {
        return this.includeFilters;
    }
    /**
     * The date of the last update of the metric stream.
     * 
     */
    @OutputExport(name="lastUpdateDate", type=String.class, parameters={})
    private Output<String> lastUpdateDate;

    /**
     * @return The date of the last update of the metric stream.
     * 
     */
    public Output<String> getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    /**
     * Name of the metric stream.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the metric stream.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The output format of the data streamed to the Kinesis Firehose.
     * 
     */
    @OutputExport(name="outputFormat", type=String.class, parameters={})
    private Output<String> outputFormat;

    /**
     * @return The output format of the data streamed to the Kinesis Firehose.
     * 
     */
    public Output<String> getOutputFormat() {
        return this.outputFormat;
    }
    /**
     * The ARN of the role that provides access to the Kinesis Firehose.
     * 
     */
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that provides access to the Kinesis Firehose.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * Displays the state of the Metric Stream.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Displays the state of the Metric Stream.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * A set of tags to assign to the delivery stream.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={MetricStreamTag.class})
    private Output</* @Nullable */ List<MetricStreamTag>> tags;

    /**
     * @return A set of tags to assign to the delivery stream.
     * 
     */
    public Output</* @Nullable */ List<MetricStreamTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricStream(String name, MetricStreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:MetricStream", name, args == null ? MetricStreamArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MetricStream(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudwatch:MetricStream", name, null, makeResourceOptions(options, id));
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
    public static MetricStream get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricStream(name, id, options);
    }
}
