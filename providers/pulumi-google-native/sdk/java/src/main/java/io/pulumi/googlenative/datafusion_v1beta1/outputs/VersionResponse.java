// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class VersionResponse {
    /**
     * Represents a list of available feature names for a given version.
     * 
     */
    private final List<String> availableFeatures;
    /**
     * Whether this is currently the default version for Cloud Data Fusion
     * 
     */
    private final Boolean defaultVersion;
    /**
     * Type represents the release availability of the version
     * 
     */
    private final String type;
    /**
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * 
     */
    private final String versionNumber;

    @OutputCustomType.Constructor({"availableFeatures","defaultVersion","type","versionNumber"})
    private VersionResponse(
        List<String> availableFeatures,
        Boolean defaultVersion,
        String type,
        String versionNumber) {
        this.availableFeatures = Objects.requireNonNull(availableFeatures);
        this.defaultVersion = Objects.requireNonNull(defaultVersion);
        this.type = Objects.requireNonNull(type);
        this.versionNumber = Objects.requireNonNull(versionNumber);
    }

    /**
     * Represents a list of available feature names for a given version.
     * 
    */
    public List<String> getAvailableFeatures() {
        return this.availableFeatures;
    }
    /**
     * Whether this is currently the default version for Cloud Data Fusion
     * 
    */
    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }
    /**
     * Type represents the release availability of the version
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * 
    */
    public String getVersionNumber() {
        return this.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availableFeatures;
        private Boolean defaultVersion;
        private String type;
        private String versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableFeatures = defaults.availableFeatures;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.type = defaults.type;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder setAvailableFeatures(List<String> availableFeatures) {
            this.availableFeatures = Objects.requireNonNull(availableFeatures);
            return this;
        }

        public Builder setDefaultVersion(Boolean defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersionNumber(String versionNumber) {
            this.versionNumber = Objects.requireNonNull(versionNumber);
            return this;
        }
        public VersionResponse build() {
            return new VersionResponse(availableFeatures, defaultVersion, type, versionNumber);
        }
    }
}