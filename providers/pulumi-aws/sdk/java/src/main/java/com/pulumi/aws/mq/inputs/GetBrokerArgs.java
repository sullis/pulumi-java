// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrokerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBrokerArgs Empty = new GetBrokerArgs();

    /**
     * The unique id of the mq broker.
     * 
     */
    @Import(name="brokerId")
    private @Nullable Output<String> brokerId;

    /**
     * @return The unique id of the mq broker.
     * 
     */
    public Optional<Output<String>> brokerId() {
        return Optional.ofNullable(this.brokerId);
    }

    /**
     * The unique name of the mq broker.
     * 
     */
    @Import(name="brokerName")
    private @Nullable Output<String> brokerName;

    /**
     * @return The unique name of the mq broker.
     * 
     */
    public Optional<Output<String>> brokerName() {
        return Optional.ofNullable(this.brokerName);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetBrokerArgs() {}

    private GetBrokerArgs(GetBrokerArgs $) {
        this.brokerId = $.brokerId;
        this.brokerName = $.brokerName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrokerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrokerArgs $;

        public Builder() {
            $ = new GetBrokerArgs();
        }

        public Builder(GetBrokerArgs defaults) {
            $ = new GetBrokerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brokerId The unique id of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerId(@Nullable Output<String> brokerId) {
            $.brokerId = brokerId;
            return this;
        }

        /**
         * @param brokerId The unique id of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerId(String brokerId) {
            return brokerId(Output.of(brokerId));
        }

        /**
         * @param brokerName The unique name of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerName(@Nullable Output<String> brokerName) {
            $.brokerName = brokerName;
            return this;
        }

        /**
         * @param brokerName The unique name of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerName(String brokerName) {
            return brokerName(Output.of(brokerName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetBrokerArgs build() {
            return $;
        }
    }

}
