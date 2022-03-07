// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The desired state of the Domain Mapping.
 * 
 */
public final class DomainMappingSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final DomainMappingSpecResponse Empty = new DomainMappingSpecResponse();

    /**
     * The mode of the certificate.
     * 
     */
    @InputImport(name="certificateMode", required=true)
      private final String certificateMode;

    public String getCertificateMode() {
        return this.certificateMode;
    }

    /**
     * If set, the mapping will override any mapping set before this spec was set. It is recommended that the user leaves this empty to receive an error warning about a potential conflict and only set it once the respective UI has given such a warning.
     * 
     */
    @InputImport(name="forceOverride", required=true)
      private final Boolean forceOverride;

    public Boolean getForceOverride() {
        return this.forceOverride;
    }

    /**
     * The name of the Knative Route that this DomainMapping applies to. The route must exist.
     * 
     */
    @InputImport(name="routeName", required=true)
      private final String routeName;

    public String getRouteName() {
        return this.routeName;
    }

    public DomainMappingSpecResponse(
        String certificateMode,
        Boolean forceOverride,
        String routeName) {
        this.certificateMode = Objects.requireNonNull(certificateMode, "expected parameter 'certificateMode' to be non-null");
        this.forceOverride = Objects.requireNonNull(forceOverride, "expected parameter 'forceOverride' to be non-null");
        this.routeName = Objects.requireNonNull(routeName, "expected parameter 'routeName' to be non-null");
    }

    private DomainMappingSpecResponse() {
        this.certificateMode = null;
        this.forceOverride = null;
        this.routeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateMode;
        private Boolean forceOverride;
        private String routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder setCertificateMode(String certificateMode) {
            this.certificateMode = Objects.requireNonNull(certificateMode);
            return this;
        }

        public Builder setForceOverride(Boolean forceOverride) {
            this.forceOverride = Objects.requireNonNull(forceOverride);
            return this;
        }

        public Builder setRouteName(String routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }
        public DomainMappingSpecResponse build() {
            return new DomainMappingSpecResponse(certificateMode, forceOverride, routeName);
        }
    }
}