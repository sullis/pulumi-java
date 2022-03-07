// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters schema of integration account map.
 * 
 */
public final class IntegrationAccountMapPropertiesParametersSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountMapPropertiesParametersSchemaArgs Empty = new IntegrationAccountMapPropertiesParametersSchemaArgs();

    /**
     * The reference name.
     * 
     */
    @InputImport(name="ref")
      private final @Nullable Input<String> ref;

    public Input<String> getRef() {
        return this.ref == null ? Input.empty() : this.ref;
    }

    public IntegrationAccountMapPropertiesParametersSchemaArgs(@Nullable Input<String> ref) {
        this.ref = ref;
    }

    private IntegrationAccountMapPropertiesParametersSchemaArgs() {
        this.ref = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMapPropertiesParametersSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ref;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountMapPropertiesParametersSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
        }

        public Builder setRef(@Nullable Input<String> ref) {
            this.ref = ref;
            return this;
        }

        public Builder setRef(@Nullable String ref) {
            this.ref = Input.ofNullable(ref);
            return this;
        }
        public IntegrationAccountMapPropertiesParametersSchemaArgs build() {
            return new IntegrationAccountMapPropertiesParametersSchemaArgs(ref);
        }
    }
}