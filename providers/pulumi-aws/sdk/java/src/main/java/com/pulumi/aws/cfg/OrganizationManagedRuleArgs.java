// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationManagedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationManagedRuleArgs Empty = new OrganizationManagedRuleArgs();

    /**
     * Description of the rule
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of AWS account identifiers to exclude from the rule
     * 
     */
    @Import(name="excludedAccounts")
    private @Nullable Output<List<String>> excludedAccounts;

    /**
     * @return List of AWS account identifiers to exclude from the rule
     * 
     */
    public Optional<Output<List<String>>> excludedAccounts() {
        return Optional.ofNullable(this.excludedAccounts);
    }

    /**
     * A string in JSON format that is passed to the AWS Config Rule Lambda Function
     * 
     */
    @Import(name="inputParameters")
    private @Nullable Output<String> inputParameters;

    /**
     * @return A string in JSON format that is passed to the AWS Config Rule Lambda Function
     * 
     */
    public Optional<Output<String>> inputParameters() {
        return Optional.ofNullable(this.inputParameters);
    }

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
     * 
     */
    @Import(name="maximumExecutionFrequency")
    private @Nullable Output<String> maximumExecutionFrequency;

    /**
     * @return The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
     * 
     */
    public Optional<Output<String>> maximumExecutionFrequency() {
        return Optional.ofNullable(this.maximumExecutionFrequency);
    }

    /**
     * The name of the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Identifier of the AWS resource to evaluate
     * 
     */
    @Import(name="resourceIdScope")
    private @Nullable Output<String> resourceIdScope;

    /**
     * @return Identifier of the AWS resource to evaluate
     * 
     */
    public Optional<Output<String>> resourceIdScope() {
        return Optional.ofNullable(this.resourceIdScope);
    }

    /**
     * List of types of AWS resources to evaluate
     * 
     */
    @Import(name="resourceTypesScopes")
    private @Nullable Output<List<String>> resourceTypesScopes;

    /**
     * @return List of types of AWS resources to evaluate
     * 
     */
    public Optional<Output<List<String>>> resourceTypesScopes() {
        return Optional.ofNullable(this.resourceTypesScopes);
    }

    /**
     * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
     * 
     */
    @Import(name="ruleIdentifier", required=true)
    private Output<String> ruleIdentifier;

    /**
     * @return Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
     * 
     */
    public Output<String> ruleIdentifier() {
        return this.ruleIdentifier;
    }

    /**
     * Tag key of AWS resources to evaluate
     * 
     */
    @Import(name="tagKeyScope")
    private @Nullable Output<String> tagKeyScope;

    /**
     * @return Tag key of AWS resources to evaluate
     * 
     */
    public Optional<Output<String>> tagKeyScope() {
        return Optional.ofNullable(this.tagKeyScope);
    }

    /**
     * Tag value of AWS resources to evaluate
     * 
     */
    @Import(name="tagValueScope")
    private @Nullable Output<String> tagValueScope;

    /**
     * @return Tag value of AWS resources to evaluate
     * 
     */
    public Optional<Output<String>> tagValueScope() {
        return Optional.ofNullable(this.tagValueScope);
    }

    private OrganizationManagedRuleArgs() {}

    private OrganizationManagedRuleArgs(OrganizationManagedRuleArgs $) {
        this.description = $.description;
        this.excludedAccounts = $.excludedAccounts;
        this.inputParameters = $.inputParameters;
        this.maximumExecutionFrequency = $.maximumExecutionFrequency;
        this.name = $.name;
        this.resourceIdScope = $.resourceIdScope;
        this.resourceTypesScopes = $.resourceTypesScopes;
        this.ruleIdentifier = $.ruleIdentifier;
        this.tagKeyScope = $.tagKeyScope;
        this.tagValueScope = $.tagValueScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationManagedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationManagedRuleArgs $;

        public Builder() {
            $ = new OrganizationManagedRuleArgs();
        }

        public Builder(OrganizationManagedRuleArgs defaults) {
            $ = new OrganizationManagedRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param excludedAccounts List of AWS account identifiers to exclude from the rule
         * 
         * @return builder
         * 
         */
        public Builder excludedAccounts(@Nullable Output<List<String>> excludedAccounts) {
            $.excludedAccounts = excludedAccounts;
            return this;
        }

        /**
         * @param excludedAccounts List of AWS account identifiers to exclude from the rule
         * 
         * @return builder
         * 
         */
        public Builder excludedAccounts(List<String> excludedAccounts) {
            return excludedAccounts(Output.of(excludedAccounts));
        }

        /**
         * @param excludedAccounts List of AWS account identifiers to exclude from the rule
         * 
         * @return builder
         * 
         */
        public Builder excludedAccounts(String... excludedAccounts) {
            return excludedAccounts(List.of(excludedAccounts));
        }

        /**
         * @param inputParameters A string in JSON format that is passed to the AWS Config Rule Lambda Function
         * 
         * @return builder
         * 
         */
        public Builder inputParameters(@Nullable Output<String> inputParameters) {
            $.inputParameters = inputParameters;
            return this;
        }

        /**
         * @param inputParameters A string in JSON format that is passed to the AWS Config Rule Lambda Function
         * 
         * @return builder
         * 
         */
        public Builder inputParameters(String inputParameters) {
            return inputParameters(Output.of(inputParameters));
        }

        /**
         * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
         * 
         * @return builder
         * 
         */
        public Builder maximumExecutionFrequency(@Nullable Output<String> maximumExecutionFrequency) {
            $.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }

        /**
         * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
         * 
         * @return builder
         * 
         */
        public Builder maximumExecutionFrequency(String maximumExecutionFrequency) {
            return maximumExecutionFrequency(Output.of(maximumExecutionFrequency));
        }

        /**
         * @param name The name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceIdScope Identifier of the AWS resource to evaluate
         * 
         * @return builder
         * 
         */
        public Builder resourceIdScope(@Nullable Output<String> resourceIdScope) {
            $.resourceIdScope = resourceIdScope;
            return this;
        }

        /**
         * @param resourceIdScope Identifier of the AWS resource to evaluate
         * 
         * @return builder
         * 
         */
        public Builder resourceIdScope(String resourceIdScope) {
            return resourceIdScope(Output.of(resourceIdScope));
        }

        /**
         * @param resourceTypesScopes List of types of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder resourceTypesScopes(@Nullable Output<List<String>> resourceTypesScopes) {
            $.resourceTypesScopes = resourceTypesScopes;
            return this;
        }

        /**
         * @param resourceTypesScopes List of types of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder resourceTypesScopes(List<String> resourceTypesScopes) {
            return resourceTypesScopes(Output.of(resourceTypesScopes));
        }

        /**
         * @param resourceTypesScopes List of types of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder resourceTypesScopes(String... resourceTypesScopes) {
            return resourceTypesScopes(List.of(resourceTypesScopes));
        }

        /**
         * @param ruleIdentifier Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
         * 
         * @return builder
         * 
         */
        public Builder ruleIdentifier(Output<String> ruleIdentifier) {
            $.ruleIdentifier = ruleIdentifier;
            return this;
        }

        /**
         * @param ruleIdentifier Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
         * 
         * @return builder
         * 
         */
        public Builder ruleIdentifier(String ruleIdentifier) {
            return ruleIdentifier(Output.of(ruleIdentifier));
        }

        /**
         * @param tagKeyScope Tag key of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder tagKeyScope(@Nullable Output<String> tagKeyScope) {
            $.tagKeyScope = tagKeyScope;
            return this;
        }

        /**
         * @param tagKeyScope Tag key of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder tagKeyScope(String tagKeyScope) {
            return tagKeyScope(Output.of(tagKeyScope));
        }

        /**
         * @param tagValueScope Tag value of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder tagValueScope(@Nullable Output<String> tagValueScope) {
            $.tagValueScope = tagValueScope;
            return this;
        }

        /**
         * @param tagValueScope Tag value of AWS resources to evaluate
         * 
         * @return builder
         * 
         */
        public Builder tagValueScope(String tagValueScope) {
            return tagValueScope(Output.of(tagValueScope));
        }

        public OrganizationManagedRuleArgs build() {
            $.ruleIdentifier = Objects.requireNonNull($.ruleIdentifier, "expected parameter 'ruleIdentifier' to be non-null");
            return $;
        }
    }

}
