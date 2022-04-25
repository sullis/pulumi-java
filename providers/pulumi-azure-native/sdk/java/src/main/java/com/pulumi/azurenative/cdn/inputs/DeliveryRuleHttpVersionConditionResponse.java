// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.HttpVersionMatchConditionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the HttpVersion condition for the delivery rule.
 * 
 */
public final class DeliveryRuleHttpVersionConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleHttpVersionConditionResponse Empty = new DeliveryRuleHttpVersionConditionResponse();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;HttpVersion&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the condition for the delivery rule.
     * Expected value is &#39;HttpVersion&#39;.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
    private HttpVersionMatchConditionParametersResponse parameters;

    /**
     * @return Defines the parameters for the condition.
     * 
     */
    public HttpVersionMatchConditionParametersResponse parameters() {
        return this.parameters;
    }

    private DeliveryRuleHttpVersionConditionResponse() {}

    private DeliveryRuleHttpVersionConditionResponse(DeliveryRuleHttpVersionConditionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleHttpVersionConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleHttpVersionConditionResponse $;

        public Builder() {
            $ = new DeliveryRuleHttpVersionConditionResponse();
        }

        public Builder(DeliveryRuleHttpVersionConditionResponse defaults) {
            $ = new DeliveryRuleHttpVersionConditionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the condition for the delivery rule.
         * Expected value is &#39;HttpVersion&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parameters Defines the parameters for the condition.
         * 
         * @return builder
         * 
         */
        public Builder parameters(HttpVersionMatchConditionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public DeliveryRuleHttpVersionConditionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
