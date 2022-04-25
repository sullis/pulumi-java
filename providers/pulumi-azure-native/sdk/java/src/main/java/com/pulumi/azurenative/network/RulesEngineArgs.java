// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.RulesEngineRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesEngineArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesEngineArgs Empty = new RulesEngineArgs();

    /**
     * Name of the Front Door which is globally unique.
     * 
     */
    @Import(name="frontDoorName", required=true)
    private Output<String> frontDoorName;

    /**
     * @return Name of the Front Door which is globally unique.
     * 
     */
    public Output<String> frontDoorName() {
        return this.frontDoorName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RulesEngineRuleArgs>> rules;

    /**
     * @return A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    public Optional<Output<List<RulesEngineRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Name of the Rules Engine which is unique within the Front Door.
     * 
     */
    @Import(name="rulesEngineName")
    private @Nullable Output<String> rulesEngineName;

    /**
     * @return Name of the Rules Engine which is unique within the Front Door.
     * 
     */
    public Optional<Output<String>> rulesEngineName() {
        return Optional.ofNullable(this.rulesEngineName);
    }

    private RulesEngineArgs() {}

    private RulesEngineArgs(RulesEngineArgs $) {
        this.frontDoorName = $.frontDoorName;
        this.resourceGroupName = $.resourceGroupName;
        this.rules = $.rules;
        this.rulesEngineName = $.rulesEngineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesEngineArgs $;

        public Builder() {
            $ = new RulesEngineArgs();
        }

        public Builder(RulesEngineArgs defaults) {
            $ = new RulesEngineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frontDoorName Name of the Front Door which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder frontDoorName(Output<String> frontDoorName) {
            $.frontDoorName = frontDoorName;
            return this;
        }

        /**
         * @param frontDoorName Name of the Front Door which is globally unique.
         * 
         * @return builder
         * 
         */
        public Builder frontDoorName(String frontDoorName) {
            return frontDoorName(Output.of(frontDoorName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param rules A list of rules that define a particular Rules Engine Configuration.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RulesEngineRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A list of rules that define a particular Rules Engine Configuration.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesEngineRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A list of rules that define a particular Rules Engine Configuration.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesEngineRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineName(@Nullable Output<String> rulesEngineName) {
            $.rulesEngineName = rulesEngineName;
            return this;
        }

        /**
         * @param rulesEngineName Name of the Rules Engine which is unique within the Front Door.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngineName(String rulesEngineName) {
            return rulesEngineName(Output.of(rulesEngineName));
        }

        public RulesEngineArgs build() {
            $.frontDoorName = Objects.requireNonNull($.frontDoorName, "expected parameter 'frontDoorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
