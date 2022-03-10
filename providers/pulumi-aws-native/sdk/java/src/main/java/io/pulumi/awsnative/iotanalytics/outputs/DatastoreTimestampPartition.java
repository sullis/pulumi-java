// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatastoreTimestampPartition {
    private final String attributeName;
    private final @Nullable String timestampFormat;

    @OutputCustomType.Constructor
    private DatastoreTimestampPartition(
        @OutputCustomType.Parameter("attributeName") String attributeName,
        @OutputCustomType.Parameter("timestampFormat") @Nullable String timestampFormat) {
        this.attributeName = attributeName;
        this.timestampFormat = timestampFormat;
    }

    public String getAttributeName() {
        return this.attributeName;
    }
    public Optional<String> getTimestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreTimestampPartition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private @Nullable String timestampFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreTimestampPartition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.timestampFormat = defaults.timestampFormat;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setTimestampFormat(@Nullable String timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }
        public DatastoreTimestampPartition build() {
            return new DatastoreTimestampPartition(attributeName, timestampFormat);
        }
    }
}
