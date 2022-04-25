// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetKinesisTargetGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetKinesisTargetGetArgs Empty = new EventTargetKinesisTargetGetArgs();

    /**
     * The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    @Import(name="partitionKeyPath")
    private @Nullable Output<String> partitionKeyPath;

    /**
     * @return The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    public Optional<Output<String>> partitionKeyPath() {
        return Optional.ofNullable(this.partitionKeyPath);
    }

    private EventTargetKinesisTargetGetArgs() {}

    private EventTargetKinesisTargetGetArgs(EventTargetKinesisTargetGetArgs $) {
        this.partitionKeyPath = $.partitionKeyPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetKinesisTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetKinesisTargetGetArgs $;

        public Builder() {
            $ = new EventTargetKinesisTargetGetArgs();
        }

        public Builder(EventTargetKinesisTargetGetArgs defaults) {
            $ = new EventTargetKinesisTargetGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionKeyPath The JSON path to be extracted from the event and used as the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(@Nullable Output<String> partitionKeyPath) {
            $.partitionKeyPath = partitionKeyPath;
            return this;
        }

        /**
         * @param partitionKeyPath The JSON path to be extracted from the event and used as the partition key.
         * 
         * @return builder
         * 
         */
        public Builder partitionKeyPath(String partitionKeyPath) {
            return partitionKeyPath(Output.of(partitionKeyPath));
        }

        public EventTargetKinesisTargetGetArgs build() {
            return $;
        }
    }

}
