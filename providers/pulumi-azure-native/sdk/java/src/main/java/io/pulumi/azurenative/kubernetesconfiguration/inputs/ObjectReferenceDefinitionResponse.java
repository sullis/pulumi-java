// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Object reference to a Kubernetes object on a cluster
 * 
 */
public final class ObjectReferenceDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectReferenceDefinitionResponse Empty = new ObjectReferenceDefinitionResponse();

    /**
     * Name of the object
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Namespace of the object
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    public ObjectReferenceDefinitionResponse(
        @Nullable String name,
        @Nullable String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    private ObjectReferenceDefinitionResponse() {
        this.name = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReferenceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReferenceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public ObjectReferenceDefinitionResponse build() {
            return new ObjectReferenceDefinitionResponse(name, namespace);
        }
    }
}
