// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSiteConfigScmIpRestrictionHeaders {
    /**
     * @return Specifies a list of Azure Front Door IDs.
     * 
     */
    private final @Nullable List<String> xAzureFdids;
    /**
     * @return Specifies if a Front Door Health Probe should be expected.
     * 
     */
    private final @Nullable String xFdHealthProbe;
    /**
     * @return Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
     * 
     */
    private final @Nullable List<String> xForwardedFors;
    /**
     * @return Specifies a list of Hosts for which matching should be applied.
     * 
     */
    private final @Nullable List<String> xForwardedHosts;

    @CustomType.Constructor
    private WindowsWebAppSiteConfigScmIpRestrictionHeaders(
        @CustomType.Parameter("xAzureFdids") @Nullable List<String> xAzureFdids,
        @CustomType.Parameter("xFdHealthProbe") @Nullable String xFdHealthProbe,
        @CustomType.Parameter("xForwardedFors") @Nullable List<String> xForwardedFors,
        @CustomType.Parameter("xForwardedHosts") @Nullable List<String> xForwardedHosts) {
        this.xAzureFdids = xAzureFdids;
        this.xFdHealthProbe = xFdHealthProbe;
        this.xForwardedFors = xForwardedFors;
        this.xForwardedHosts = xForwardedHosts;
    }

    /**
     * @return Specifies a list of Azure Front Door IDs.
     * 
     */
    public List<String> xAzureFdids() {
        return this.xAzureFdids == null ? List.of() : this.xAzureFdids;
    }
    /**
     * @return Specifies if a Front Door Health Probe should be expected.
     * 
     */
    public Optional<String> xFdHealthProbe() {
        return Optional.ofNullable(this.xFdHealthProbe);
    }
    /**
     * @return Specifies a list of addresses for which matching should be applied. Omitting this value means allow any.
     * 
     */
    public List<String> xForwardedFors() {
        return this.xForwardedFors == null ? List.of() : this.xForwardedFors;
    }
    /**
     * @return Specifies a list of Hosts for which matching should be applied.
     * 
     */
    public List<String> xForwardedHosts() {
        return this.xForwardedHosts == null ? List.of() : this.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSiteConfigScmIpRestrictionHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> xAzureFdids;
        private @Nullable String xFdHealthProbe;
        private @Nullable List<String> xForwardedFors;
        private @Nullable List<String> xForwardedHosts;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSiteConfigScmIpRestrictionHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xAzureFdids = defaults.xAzureFdids;
    	      this.xFdHealthProbe = defaults.xFdHealthProbe;
    	      this.xForwardedFors = defaults.xForwardedFors;
    	      this.xForwardedHosts = defaults.xForwardedHosts;
        }

        public Builder xAzureFdids(@Nullable List<String> xAzureFdids) {
            this.xAzureFdids = xAzureFdids;
            return this;
        }
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }
        public Builder xFdHealthProbe(@Nullable String xFdHealthProbe) {
            this.xFdHealthProbe = xFdHealthProbe;
            return this;
        }
        public Builder xForwardedFors(@Nullable List<String> xForwardedFors) {
            this.xForwardedFors = xForwardedFors;
            return this;
        }
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }
        public Builder xForwardedHosts(@Nullable List<String> xForwardedHosts) {
            this.xForwardedHosts = xForwardedHosts;
            return this;
        }
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }        public WindowsWebAppSiteConfigScmIpRestrictionHeaders build() {
            return new WindowsWebAppSiteConfigScmIpRestrictionHeaders(xAzureFdids, xFdHealthProbe, xForwardedFors, xForwardedHosts);
        }
    }
}
