// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines reference to subnet.
 * 
 */
public final class SubnetReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetReferenceArgs Empty = new SubnetReferenceArgs();

    /**
     * Gets the name of the proxy resource on the target side.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @InputImport(name="sourceArmResourceId", required=true)
    private final Input<String> sourceArmResourceId;

    public Input<String> getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public SubnetReferenceArgs(
        @Nullable Input<String> name,
        Input<String> sourceArmResourceId) {
        this.name = name;
        this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
    }

    private SubnetReferenceArgs() {
        this.name = Input.empty();
        this.sourceArmResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSourceArmResourceId(Input<String> sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }

        public Builder setSourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Input.of(Objects.requireNonNull(sourceArmResourceId));
            return this;
        }

        public SubnetReferenceArgs build() {
            return new SubnetReferenceArgs(name, sourceArmResourceId);
        }
    }
}
