// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RequestBodyMatchConditionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestBody condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestBodyConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleRequestBodyConditionArgs Empty = new DeliveryRuleRequestBodyConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;RequestBody&#39;.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;RequestBody&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<RequestBodyMatchConditionParametersArgs> parameters;

    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public Output<RequestBodyMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    private DeliveryRuleRequestBodyConditionArgs() {}

    private DeliveryRuleRequestBodyConditionArgs(DeliveryRuleRequestBodyConditionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleRequestBodyConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleRequestBodyConditionArgs $;

        public Builder() {
            $ = new DeliveryRuleRequestBodyConditionArgs();
        }

        public Builder(DeliveryRuleRequestBodyConditionArgs defaults) {
            $ = new DeliveryRuleRequestBodyConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the condition for the delivery rule.
         * Expected value is &#39;RequestBody&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the condition for the delivery rule.
         * Expected value is &#39;RequestBody&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Defines the parameters for the condition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<RequestBodyMatchConditionParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Defines the parameters for the condition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(RequestBodyMatchConditionParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public DeliveryRuleRequestBodyConditionArgs build() {
            $.name = Codegen.stringProp("name").output().arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
