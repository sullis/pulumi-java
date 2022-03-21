// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityLocationResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 * 
 */
public final class PackageIssueResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageIssueResponse Empty = new PackageIssueResponse();

    /**
     * The location of the vulnerability.
     * 
     */
    @Import(name="affectedLocation", required=true)
      private final VulnerabilityLocationResponse affectedLocation;

    public VulnerabilityLocationResponse getAffectedLocation() {
        return this.affectedLocation;
    }

    /**
     * The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when it is not available.
     * 
     */
    @Import(name="effectiveSeverity", required=true)
      private final String effectiveSeverity;

    public String getEffectiveSeverity() {
        return this.effectiveSeverity;
    }

    /**
     * The location of the available fix for vulnerability.
     * 
     */
    @Import(name="fixedLocation", required=true)
      private final VulnerabilityLocationResponse fixedLocation;

    public VulnerabilityLocationResponse getFixedLocation() {
        return this.fixedLocation;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @Import(name="packageType", required=true)
      private final String packageType;

    public String getPackageType() {
        return this.packageType;
    }

    public PackageIssueResponse(
        VulnerabilityLocationResponse affectedLocation,
        String effectiveSeverity,
        VulnerabilityLocationResponse fixedLocation,
        String packageType) {
        this.affectedLocation = Objects.requireNonNull(affectedLocation, "expected parameter 'affectedLocation' to be non-null");
        this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity, "expected parameter 'effectiveSeverity' to be non-null");
        this.fixedLocation = Objects.requireNonNull(fixedLocation, "expected parameter 'fixedLocation' to be non-null");
        this.packageType = Objects.requireNonNull(packageType, "expected parameter 'packageType' to be non-null");
    }

    private PackageIssueResponse() {
        this.affectedLocation = null;
        this.effectiveSeverity = null;
        this.fixedLocation = null;
        this.packageType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VulnerabilityLocationResponse affectedLocation;
        private String effectiveSeverity;
        private VulnerabilityLocationResponse fixedLocation;
        private String packageType;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
        }

        public Builder affectedLocation(VulnerabilityLocationResponse affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }
        public Builder effectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }
        public Builder fixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedLocation, effectiveSeverity, fixedLocation, packageType);
        }
    }
}
