// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a license service that is associated with a studio resource.</p>
 * 
 */
public final class StudioComponentLicenseServiceConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StudioComponentLicenseServiceConfiguration Empty = new StudioComponentLicenseServiceConfiguration();

    /**
     * <p>The endpoint of the license service that is accessed by the studio component resource.</p>
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    public StudioComponentLicenseServiceConfiguration(@Nullable String endpoint) {
        this.endpoint = endpoint;
    }

    private StudioComponentLicenseServiceConfiguration() {
        this.endpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentLicenseServiceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentLicenseServiceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public StudioComponentLicenseServiceConfiguration build() {
            return new StudioComponentLicenseServiceConfiguration(endpoint);
        }
    }
}
