// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelDynamoDBv2 {
    private final @Nullable DetectorModelPayload payload;
    private final String tableName;

    @OutputCustomType.Constructor({"payload","tableName"})
    private DetectorModelDynamoDBv2(
        @Nullable DetectorModelPayload payload,
        String tableName) {
        this.payload = payload;
        this.tableName = Objects.requireNonNull(tableName);
    }

    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }
    public String getTableName() {
        return this.tableName;
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

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public DetectorModelDynamoDBv2 build() {
            return new DetectorModelDynamoDBv2(payload, tableName);
        }
    }
}
