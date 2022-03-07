// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlPathMatchConditionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the UrlPath condition for the delivery rule.
 * 
 */
public final class DeliveryRuleUrlPathConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleUrlPathConditionArgs Empty = new DeliveryRuleUrlPathConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is 'UrlPath'.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<UrlPathMatchConditionParametersArgs> parameters;

    public Input<UrlPathMatchConditionParametersArgs> getParameters() {
        return this.parameters;
    }

    public DeliveryRuleUrlPathConditionArgs(
        Input<String> name,
        Input<UrlPathMatchConditionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleUrlPathConditionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlPathConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<UrlPathMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlPathConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(Input<UrlPathMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(UrlPathMatchConditionParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }
        public DeliveryRuleUrlPathConditionArgs build() {
            return new DeliveryRuleUrlPathConditionArgs(name, parameters);
        }
    }
}