// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePassthroughExtensionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePassthroughExtensionsArgs Empty = new CertificateTemplatePassthroughExtensionsArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @InputImport(name="additionalExtensions")
      private final @Nullable Input<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs>> additionalExtensions;

    public Input<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    @InputImport(name="knownExtensions")
      private final @Nullable Input<List<String>> knownExtensions;

    public Input<List<String>> getKnownExtensions() {
        return this.knownExtensions == null ? Input.empty() : this.knownExtensions;
    }

    public CertificateTemplatePassthroughExtensionsArgs(
        @Nullable Input<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Input<List<String>> knownExtensions) {
        this.additionalExtensions = additionalExtensions;
        this.knownExtensions = knownExtensions;
    }

    private CertificateTemplatePassthroughExtensionsArgs() {
        this.additionalExtensions = Input.empty();
        this.knownExtensions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePassthroughExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Input<List<String>> knownExtensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePassthroughExtensionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.knownExtensions = defaults.knownExtensions;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setKnownExtensions(@Nullable Input<List<String>> knownExtensions) {
            this.knownExtensions = knownExtensions;
            return this;
        }

        public Builder setKnownExtensions(@Nullable List<String> knownExtensions) {
            this.knownExtensions = Input.ofNullable(knownExtensions);
            return this;
        }
        public CertificateTemplatePassthroughExtensionsArgs build() {
            return new CertificateTemplatePassthroughExtensionsArgs(additionalExtensions, knownExtensions);
        }
    }
}