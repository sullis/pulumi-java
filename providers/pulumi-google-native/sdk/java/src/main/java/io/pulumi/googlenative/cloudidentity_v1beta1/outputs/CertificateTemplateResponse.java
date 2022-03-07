// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class CertificateTemplateResponse {
    /**
     * The Major version of the template. Example: 100.
     * 
     */
    private final Integer majorVersion;
    /**
     * The minor version of the template. Example: 12.
     * 
     */
    private final Integer minorVersion;

    @OutputCustomType.Constructor({"majorVersion","minorVersion"})
    private CertificateTemplateResponse(
        Integer majorVersion,
        Integer minorVersion) {
        this.majorVersion = Objects.requireNonNull(majorVersion);
        this.minorVersion = Objects.requireNonNull(minorVersion);
    }

    /**
     * The Major version of the template. Example: 100.
     * 
    */
    public Integer getMajorVersion() {
        return this.majorVersion;
    }
    /**
     * The minor version of the template. Example: 12.
     * 
    */
    public Integer getMinorVersion() {
        return this.minorVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer majorVersion;
        private Integer minorVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.majorVersion = defaults.majorVersion;
    	      this.minorVersion = defaults.minorVersion;
        }

        public Builder setMajorVersion(Integer majorVersion) {
            this.majorVersion = Objects.requireNonNull(majorVersion);
            return this;
        }

        public Builder setMinorVersion(Integer minorVersion) {
            this.minorVersion = Objects.requireNonNull(minorVersion);
            return this;
        }
        public CertificateTemplateResponse build() {
            return new CertificateTemplateResponse(majorVersion, minorVersion);
        }
    }
}