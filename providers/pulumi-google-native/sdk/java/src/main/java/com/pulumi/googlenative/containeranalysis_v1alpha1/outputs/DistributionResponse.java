// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VersionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DistributionResponse {
    /**
     * @return The CPU architecture for which packages in this distribution channel were built
     * 
     */
    private final String architecture;
    /**
     * @return The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    private final String cpeUri;
    /**
     * @return The distribution channel-specific description of this package.
     * 
     */
    private final String description;
    /**
     * @return The latest available version of this package in this distribution channel.
     * 
     */
    private final VersionResponse latestVersion;
    /**
     * @return A freeform string denoting the maintainer of this package.
     * 
     */
    private final String maintainer;
    /**
     * @return The distribution channel-specific homepage for this package.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private DistributionResponse(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("latestVersion") VersionResponse latestVersion,
        @CustomType.Parameter("maintainer") String maintainer,
        @CustomType.Parameter("url") String url) {
        this.architecture = architecture;
        this.cpeUri = cpeUri;
        this.description = description;
        this.latestVersion = latestVersion;
        this.maintainer = maintainer;
        this.url = url;
    }

    /**
     * @return The CPU architecture for which packages in this distribution channel were built
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    public String cpeUri() {
        return this.cpeUri;
    }
    /**
     * @return The distribution channel-specific description of this package.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The latest available version of this package in this distribution channel.
     * 
     */
    public VersionResponse latestVersion() {
        return this.latestVersion;
    }
    /**
     * @return A freeform string denoting the maintainer of this package.
     * 
     */
    public String maintainer() {
        return this.maintainer;
    }
    /**
     * @return The distribution channel-specific homepage for this package.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String cpeUri;
        private String description;
        private VersionResponse latestVersion;
        private String maintainer;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.latestVersion = defaults.latestVersion;
    	      this.maintainer = defaults.maintainer;
    	      this.url = defaults.url;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder latestVersion(VersionResponse latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }
        public Builder maintainer(String maintainer) {
            this.maintainer = Objects.requireNonNull(maintainer);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public DistributionResponse build() {
            return new DistributionResponse(architecture, cpeUri, description, latestVersion, maintainer, url);
        }
    }
}
