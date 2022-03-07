// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityLocationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DetailResponse {
    /**
     * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
     */
    private final String cpeUri;
    /**
     * A vendor-specific description of this note.
     * 
     */
    private final String description;
    /**
     * The fix for this specific package version.
     * 
     */
    private final VulnerabilityLocationResponse fixedLocation;
    /**
     * Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    private final Boolean isObsolete;
    /**
     * The max version of the package in which the vulnerability exists.
     * 
     */
    private final VersionResponse maxAffectedVersion;
    /**
     * The min version of the package in which the vulnerability exists.
     * 
     */
    private final VersionResponse minAffectedVersion;
    /**
     * The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
     */
    private final String $package;
    /**
     * The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
     */
    private final String packageType;
    /**
     * The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    private final String severityName;
    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    private final String source;
    /**
     * The vendor of the product. e.g. "google"
     * 
     */
    private final String vendor;

    @OutputCustomType.Constructor({"cpeUri","description","fixedLocation","isObsolete","maxAffectedVersion","minAffectedVersion","$package","packageType","severityName","source","vendor"})
    private DetailResponse(
        String cpeUri,
        String description,
        VulnerabilityLocationResponse fixedLocation,
        Boolean isObsolete,
        VersionResponse maxAffectedVersion,
        VersionResponse minAffectedVersion,
        String $package,
        String packageType,
        String severityName,
        String source,
        String vendor) {
        this.cpeUri = Objects.requireNonNull(cpeUri);
        this.description = Objects.requireNonNull(description);
        this.fixedLocation = Objects.requireNonNull(fixedLocation);
        this.isObsolete = Objects.requireNonNull(isObsolete);
        this.maxAffectedVersion = Objects.requireNonNull(maxAffectedVersion);
        this.minAffectedVersion = Objects.requireNonNull(minAffectedVersion);
        this.$package = Objects.requireNonNull($package);
        this.packageType = Objects.requireNonNull(packageType);
        this.severityName = Objects.requireNonNull(severityName);
        this.source = Objects.requireNonNull(source);
        this.vendor = Objects.requireNonNull(vendor);
    }

    /**
     * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
    */
    public String getCpeUri() {
        return this.cpeUri;
    }
    /**
     * A vendor-specific description of this note.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The fix for this specific package version.
     * 
    */
    public VulnerabilityLocationResponse getFixedLocation() {
        return this.fixedLocation;
    }
    /**
     * Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
    */
    public Boolean getIsObsolete() {
        return this.isObsolete;
    }
    /**
     * The max version of the package in which the vulnerability exists.
     * 
    */
    public VersionResponse getMaxAffectedVersion() {
        return this.maxAffectedVersion;
    }
    /**
     * The min version of the package in which the vulnerability exists.
     * 
    */
    public VersionResponse getMinAffectedVersion() {
        return this.minAffectedVersion;
    }
    /**
     * The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
    */
    public String get$package() {
        return this.$package;
    }
    /**
     * The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
    */
    public String getPackageType() {
        return this.packageType;
    }
    /**
     * The severity (eg: distro assigned severity) for this vulnerability.
     * 
    */
    public String getSeverityName() {
        return this.severityName;
    }
    /**
     * The source from which the information in this Detail was obtained.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * The vendor of the product. e.g. "google"
     * 
    */
    public String getVendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String description;
        private VulnerabilityLocationResponse fixedLocation;
        private Boolean isObsolete;
        private VersionResponse maxAffectedVersion;
        private VersionResponse minAffectedVersion;
        private String $package;
        private String packageType;
        private String severityName;
        private String source;
        private String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.$package = defaults.$package;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.vendor = defaults.vendor;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }

        public Builder setIsObsolete(Boolean isObsolete) {
            this.isObsolete = Objects.requireNonNull(isObsolete);
            return this;
        }

        public Builder setMaxAffectedVersion(VersionResponse maxAffectedVersion) {
            this.maxAffectedVersion = Objects.requireNonNull(maxAffectedVersion);
            return this;
        }

        public Builder setMinAffectedVersion(VersionResponse minAffectedVersion) {
            this.minAffectedVersion = Objects.requireNonNull(minAffectedVersion);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setPackageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }

        public Builder setSeverityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setVendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }
        public DetailResponse build() {
            return new DetailResponse(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, $package, packageType, severityName, source, vendor);
        }
    }
}