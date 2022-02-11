// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.qldb.StreamArgs;
import io.pulumi.awsnative.qldb.outputs.StreamKinesisConfiguration;
import io.pulumi.awsnative.qldb.outputs.StreamTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:qldb:Stream")
public class Stream extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="exclusiveEndTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> exclusiveEndTime;

    public Output</* @Nullable */ String> getExclusiveEndTime() {
        return this.exclusiveEndTime;
    }
    @OutputExport(name="inclusiveStartTime", type=String.class, parameters={})
    private Output<String> inclusiveStartTime;

    public Output<String> getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }
    @OutputExport(name="kinesisConfiguration", type=StreamKinesisConfiguration.class, parameters={})
    private Output<StreamKinesisConfiguration> kinesisConfiguration;

    public Output<StreamKinesisConfiguration> getKinesisConfiguration() {
        return this.kinesisConfiguration;
    }
    @OutputExport(name="ledgerName", type=String.class, parameters={})
    private Output<String> ledgerName;

    public Output<String> getLedgerName() {
        return this.ledgerName;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="streamName", type=String.class, parameters={})
    private Output<String> streamName;

    public Output<String> getStreamName() {
        return this.streamName;
    }
    @OutputExport(name="tags", type=List.class, parameters={StreamTag.class})
    private Output</* @Nullable */ List<StreamTag>> tags;

    public Output</* @Nullable */ List<StreamTag>> getTags() {
        return this.tags;
    }

    public Stream(String name, StreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:qldb:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Stream(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:qldb:Stream", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Stream get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, options);
    }
}
