// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the source of an event channel.
 * 
 */
public final class EventChannelSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventChannelSourceArgs Empty = new EventChannelSourceArgs();

    /**
     * The identifier of the resource that&#39;s the source of the events.
     * This represents a unique resource in the partner&#39;s resource model.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The identifier of the resource that&#39;s the source of the events.
     * This represents a unique resource in the partner&#39;s resource model.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private EventChannelSourceArgs() {}

    private EventChannelSourceArgs(EventChannelSourceArgs $) {
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventChannelSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventChannelSourceArgs $;

        public Builder() {
            $ = new EventChannelSourceArgs();
        }

        public Builder(EventChannelSourceArgs defaults) {
            $ = new EventChannelSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param source The identifier of the resource that&#39;s the source of the events.
         * This represents a unique resource in the partner&#39;s resource model.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The identifier of the resource that&#39;s the source of the events.
         * This represents a unique resource in the partner&#39;s resource model.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public EventChannelSourceArgs build() {
            return $;
        }
    }

}
