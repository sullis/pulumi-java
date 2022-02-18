// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies an object.
 * 
 */
public final class NameIdentifierResponse extends io.pulumi.resources.InvokeArgs {

    public static final NameIdentifierResponse Empty = new NameIdentifierResponse();

    /**
     * Name of the object.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public NameIdentifierResponse(@Nullable String name) {
        this.name = name;
    }

    private NameIdentifierResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NameIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NameIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public NameIdentifierResponse build() {
            return new NameIdentifierResponse(name);
        }
    }
}
