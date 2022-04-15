// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an action to write to the Amazon DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). A separate column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
 * 
 * You can use expressions for parameters that are strings. For more information, see [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html) in the *AWS IoT Events Developer Guide*.
 * 
 */
public final class DetectorModelDynamoDBv2 extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelDynamoDBv2 Empty = new DetectorModelDynamoDBv2();

    @Import(name="payload")
      private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> payload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
      private final String tableName;

    public String tableName() {
        return this.tableName;
    }

    public DetectorModelDynamoDBv2(
        @Nullable DetectorModelPayload payload,
        String tableName) {
        this.payload = payload;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private DetectorModelDynamoDBv2() {
        this.payload = null;
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDBv2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelPayload payload;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDBv2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.tableName = defaults.tableName;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public DetectorModelDynamoDBv2 build() {
            return new DetectorModelDynamoDBv2(payload, tableName);
        }
    }
}
