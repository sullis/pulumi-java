// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScopeNamespaceResponse {
    /**
     * Namespace where the extensionInstance will be created for an Namespace scoped extensionInstance.  If this namespace does not exist, it will be created
     * 
     */
    private final @Nullable String targetNamespace;

    @OutputCustomType.Constructor({"targetNamespace"})
    private ScopeNamespaceResponse(@Nullable String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    /**
     * Namespace where the extensionInstance will be created for an Namespace scoped extensionInstance.  If this namespace does not exist, it will be created
     * 
     */
    public Optional<String> getTargetNamespace() {
        return Optional.ofNullable(this.targetNamespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeNamespaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeNamespaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public ScopeNamespaceResponse build() {
            return new ScopeNamespaceResponse(targetNamespace);
        }
    }
}
