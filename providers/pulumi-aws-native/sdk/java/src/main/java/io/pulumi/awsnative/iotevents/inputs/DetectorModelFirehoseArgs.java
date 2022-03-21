// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis Data Firehose delivery stream.
 * 
 */
public final class DetectorModelFirehoseArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelFirehoseArgs Empty = new DetectorModelFirehoseArgs();

    /**
     * The name of the Kinesis Data Firehose delivery stream where the data is written.
     * 
     */
    @Import(name="deliveryStreamName", required=true)
      private final Output<String> deliveryStreamName;

    public Output<String> getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * A character separator that is used to separate records written to the Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * 
     */
    @Import(name="separator")
      private final @Nullable Output<String> separator;

    public Output<String> getSeparator() {
        return this.separator == null ? Output.empty() : this.separator;
    }

    public DetectorModelFirehoseArgs(
        Output<String> deliveryStreamName,
        @Nullable Output<DetectorModelPayloadArgs> payload,
        @Nullable Output<String> separator) {
        this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
        this.payload = payload;
        this.separator = separator;
    }

    private DetectorModelFirehoseArgs() {
        this.deliveryStreamName = Output.empty();
        this.payload = Output.empty();
        this.separator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelFirehoseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deliveryStreamName;
        private @Nullable Output<DetectorModelPayloadArgs> payload;
        private @Nullable Output<String> separator;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelFirehoseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.payload = defaults.payload;
    	      this.separator = defaults.separator;
        }

        public Builder deliveryStreamName(Output<String> deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }
        public Builder deliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Output.of(Objects.requireNonNull(deliveryStreamName));
            return this;
        }
        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }
        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }
        public Builder separator(@Nullable Output<String> separator) {
            this.separator = separator;
            return this;
        }
        public Builder separator(@Nullable String separator) {
            this.separator = Output.ofNullable(separator);
            return this;
        }        public DetectorModelFirehoseArgs build() {
            return new DetectorModelFirehoseArgs(deliveryStreamName, payload, separator);
        }
    }
}
