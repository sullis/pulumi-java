// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamConsumerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamConsumerArgs Empty = new GetStreamConsumerArgs();

    /**
     * Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the stream consumer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the stream consumer.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @Import(name="streamArn", required=true)
    private Output<String> streamArn;

    /**
     * @return Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    public Output<String> streamArn() {
        return this.streamArn;
    }

    private GetStreamConsumerArgs() {}

    private GetStreamConsumerArgs(GetStreamConsumerArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.streamArn = $.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamConsumerArgs $;

        public Builder() {
            $ = new GetStreamConsumerArgs();
        }

        public Builder(GetStreamConsumerArgs defaults) {
            $ = new GetStreamConsumerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name Name of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the stream consumer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param streamArn Amazon Resource Name (ARN) of the data stream the consumer is registered with.
         * 
         * @return builder
         * 
         */
        public Builder streamArn(Output<String> streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        /**
         * @param streamArn Amazon Resource Name (ARN) of the data stream the consumer is registered with.
         * 
         * @return builder
         * 
         */
        public Builder streamArn(String streamArn) {
            return streamArn(Output.of(streamArn));
        }

        public GetStreamConsumerArgs build() {
            $.streamArn = Objects.requireNonNull($.streamArn, "expected parameter 'streamArn' to be non-null");
            return $;
        }
    }

}
