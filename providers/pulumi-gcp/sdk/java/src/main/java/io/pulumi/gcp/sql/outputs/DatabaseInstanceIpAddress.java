// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceIpAddress {
    private final @Nullable String ipAddress;
    private final @Nullable String timeToRetire;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"ipAddress","timeToRetire","type"})
    private DatabaseInstanceIpAddress(
        @Nullable String ipAddress,
        @Nullable String timeToRetire,
        @Nullable String type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Optional<String> getTimeToRetire() {
        return Optional.ofNullable(this.timeToRetire);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String timeToRetire;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setTimeToRetire(@Nullable String timeToRetire) {
            this.timeToRetire = timeToRetire;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DatabaseInstanceIpAddress build() {
            return new DatabaseInstanceIpAddress(ipAddress, timeToRetire, type);
        }
    }
}