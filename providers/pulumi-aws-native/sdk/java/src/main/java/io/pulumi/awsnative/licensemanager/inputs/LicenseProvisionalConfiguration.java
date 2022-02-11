// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class LicenseProvisionalConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final LicenseProvisionalConfiguration Empty = new LicenseProvisionalConfiguration();

    @InputImport(name="maxTimeToLiveInMinutes", required=true)
    private final Integer maxTimeToLiveInMinutes;

    public Integer getMaxTimeToLiveInMinutes() {
        return this.maxTimeToLiveInMinutes;
    }

    public LicenseProvisionalConfiguration(Integer maxTimeToLiveInMinutes) {
        this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes, "expected parameter 'maxTimeToLiveInMinutes' to be non-null");
    }

    private LicenseProvisionalConfiguration() {
        this.maxTimeToLiveInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseProvisionalConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxTimeToLiveInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseProvisionalConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxTimeToLiveInMinutes = defaults.maxTimeToLiveInMinutes;
        }

        public Builder setMaxTimeToLiveInMinutes(Integer maxTimeToLiveInMinutes) {
            this.maxTimeToLiveInMinutes = Objects.requireNonNull(maxTimeToLiveInMinutes);
            return this;
        }

        public LicenseProvisionalConfiguration build() {
            return new LicenseProvisionalConfiguration(maxTimeToLiveInMinutes);
        }
    }
}
