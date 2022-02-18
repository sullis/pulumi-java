// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CertificateTemplatePassthroughExtensionsAdditionalExtension {
    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    private final List<Integer> objectIdPaths;

    @OutputCustomType.Constructor({"objectIdPaths"})
    private CertificateTemplatePassthroughExtensionsAdditionalExtension(List<Integer> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
    }

    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    public List<Integer> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePassthroughExtensionsAdditionalExtension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePassthroughExtensionsAdditionalExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }

        public CertificateTemplatePassthroughExtensionsAdditionalExtension build() {
            return new CertificateTemplatePassthroughExtensionsAdditionalExtension(objectIdPaths);
        }
    }
}
