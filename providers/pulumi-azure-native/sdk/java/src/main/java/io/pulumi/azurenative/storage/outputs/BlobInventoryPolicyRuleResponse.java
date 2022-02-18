// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicyDefinitionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BlobInventoryPolicyRuleResponse {
    /**
     * An object that defines the blob inventory policy rule.
     * 
     */
    private final BlobInventoryPolicyDefinitionResponse definition;
    /**
     * Rule is enabled when set to true.
     * 
     */
    private final Boolean enabled;
    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"definition","enabled","name"})
    private BlobInventoryPolicyRuleResponse(
        BlobInventoryPolicyDefinitionResponse definition,
        Boolean enabled,
        String name) {
        this.definition = Objects.requireNonNull(definition);
        this.enabled = Objects.requireNonNull(enabled);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * An object that defines the blob inventory policy rule.
     * 
     */
    public BlobInventoryPolicyDefinitionResponse getDefinition() {
        return this.definition;
    }
    /**
     * Rule is enabled when set to true.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyDefinitionResponse definition;
        private Boolean enabled;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
        }

        public Builder setDefinition(BlobInventoryPolicyDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public BlobInventoryPolicyRuleResponse build() {
            return new BlobInventoryPolicyRuleResponse(definition, enabled, name);
        }
    }
}
