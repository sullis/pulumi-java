// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceClone {
    /**
     * The timestamp of the point in time that should be restored.
     * 
     */
    private final @Nullable String pointInTime;
    /**
     * Name of the source instance which will be cloned.
     * 
     */
    private final String sourceInstanceName;

    @OutputCustomType.Constructor({"pointInTime","sourceInstanceName"})
    private DatabaseInstanceClone(
        @Nullable String pointInTime,
        String sourceInstanceName) {
        this.pointInTime = pointInTime;
        this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
    }

    /**
     * The timestamp of the point in time that should be restored.
     * 
     */
    public Optional<String> getPointInTime() {
        return Optional.ofNullable(this.pointInTime);
    }
    /**
     * Name of the source instance which will be cloned.
     * 
     */
    public String getSourceInstanceName() {
        return this.sourceInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceClone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pointInTime;
        private String sourceInstanceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceClone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pointInTime = defaults.pointInTime;
    	      this.sourceInstanceName = defaults.sourceInstanceName;
        }

        public Builder setPointInTime(@Nullable String pointInTime) {
            this.pointInTime = pointInTime;
            return this;
        }

        public Builder setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = Objects.requireNonNull(sourceInstanceName);
            return this;
        }

        public DatabaseInstanceClone build() {
            return new DatabaseInstanceClone(pointInTime, sourceInstanceName);
        }
    }
}
