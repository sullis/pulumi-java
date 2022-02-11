// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class LicenseBorrowConfiguration {
    private final Boolean allowEarlyCheckIn;
    private final Integer maxTimeToLiveInMinutes;

    @OutputCustomType.Constructor({"allowEarlyCheckIn","maxTimeToLiveInMinutes"})
    private LicenseBorrowConfiguration(
        Boolean allowEarlyCheckIn,
        Integer maxTimeToLiveInMinutes) {
        this.allowEarlyCheckIn = Objects.requireNonNull(allowEarlyCheckIn);
        this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes);
    }

    public Boolean getAllowEarlyCheckIn() {
        return this.allowEarlyCheckIn;
    }
    public Integer getMaxTimeToLiveInMinutes() {
        return this.maxTimeToLiveInMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseBorrowConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowEarlyCheckIn;
        private Integer maxTimeToLiveInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseBorrowConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEarlyCheckIn = defaults.allowEarlyCheckIn;
    	      this.maxTimeToLiveInMinutes = defaults.maxTimeToLiveInMinutes;
        }

        public Builder setAllowEarlyCheckIn(Boolean allowEarlyCheckIn) {
            this.allowEarlyCheckIn = Objects.requireNonNull(allowEarlyCheckIn);
            return this;
        }

        public Builder setMaxTimeToLiveInMinutes(Integer maxTimeToLiveInMinutes) {
            this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes);
            return this;
        }

        public LicenseBorrowConfiguration build() {
            return new LicenseBorrowConfiguration(allowEarlyCheckIn, maxTimeToLiveInMinutes);
        }
    }
}
