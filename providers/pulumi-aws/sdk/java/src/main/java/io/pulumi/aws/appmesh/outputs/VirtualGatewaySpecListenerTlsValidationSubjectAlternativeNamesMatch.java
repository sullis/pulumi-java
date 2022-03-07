// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch {
    /**
     * The values sent must match the specified values exactly.
     * 
     */
    private final List<String> exacts;

    @OutputCustomType.Constructor({"exacts"})
    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch(List<String> exacts) {
        this.exacts = Objects.requireNonNull(exacts);
    }

    /**
     * The values sent must match the specified values exactly.
     * 
    */
    public List<String> getExacts() {
        return this.exacts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exacts;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exacts = defaults.exacts;
        }

        public Builder setExacts(List<String> exacts) {
            this.exacts = Objects.requireNonNull(exacts);
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch build() {
            return new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch(exacts);
        }
    }
}