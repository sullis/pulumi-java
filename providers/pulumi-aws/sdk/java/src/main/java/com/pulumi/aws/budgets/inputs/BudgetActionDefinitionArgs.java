// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionArgs;
import com.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionArgs;
import com.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionArgs Empty = new BudgetActionDefinitionArgs();

    /**
     * The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    @Import(name="iamActionDefinition")
    private @Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition;

    /**
     * @return The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * 
     */
    public Optional<Output<BudgetActionDefinitionIamActionDefinitionArgs>> iamActionDefinition() {
        return Optional.ofNullable(this.iamActionDefinition);
    }

    /**
     * The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    @Import(name="scpActionDefinition")
    private @Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition;

    /**
     * @return The service control policies (SCPs) action definition details. See SCP Action Definition.
     * 
     */
    public Optional<Output<BudgetActionDefinitionScpActionDefinitionArgs>> scpActionDefinition() {
        return Optional.ofNullable(this.scpActionDefinition);
    }

    /**
     * The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    @Import(name="ssmActionDefinition")
    private @Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition;

    /**
     * @return The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * 
     */
    public Optional<Output<BudgetActionDefinitionSsmActionDefinitionArgs>> ssmActionDefinition() {
        return Optional.ofNullable(this.ssmActionDefinition);
    }

    private BudgetActionDefinitionArgs() {}

    private BudgetActionDefinitionArgs(BudgetActionDefinitionArgs $) {
        this.iamActionDefinition = $.iamActionDefinition;
        this.scpActionDefinition = $.scpActionDefinition;
        this.ssmActionDefinition = $.ssmActionDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetActionDefinitionArgs $;

        public Builder() {
            $ = new BudgetActionDefinitionArgs();
        }

        public Builder(BudgetActionDefinitionArgs defaults) {
            $ = new BudgetActionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iamActionDefinition The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder iamActionDefinition(@Nullable Output<BudgetActionDefinitionIamActionDefinitionArgs> iamActionDefinition) {
            $.iamActionDefinition = iamActionDefinition;
            return this;
        }

        /**
         * @param iamActionDefinition The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder iamActionDefinition(BudgetActionDefinitionIamActionDefinitionArgs iamActionDefinition) {
            return iamActionDefinition(Output.of(iamActionDefinition));
        }

        /**
         * @param scpActionDefinition The service control policies (SCPs) action definition details. See SCP Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder scpActionDefinition(@Nullable Output<BudgetActionDefinitionScpActionDefinitionArgs> scpActionDefinition) {
            $.scpActionDefinition = scpActionDefinition;
            return this;
        }

        /**
         * @param scpActionDefinition The service control policies (SCPs) action definition details. See SCP Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder scpActionDefinition(BudgetActionDefinitionScpActionDefinitionArgs scpActionDefinition) {
            return scpActionDefinition(Output.of(scpActionDefinition));
        }

        /**
         * @param ssmActionDefinition The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder ssmActionDefinition(@Nullable Output<BudgetActionDefinitionSsmActionDefinitionArgs> ssmActionDefinition) {
            $.ssmActionDefinition = ssmActionDefinition;
            return this;
        }

        /**
         * @param ssmActionDefinition The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
         * 
         * @return builder
         * 
         */
        public Builder ssmActionDefinition(BudgetActionDefinitionSsmActionDefinitionArgs ssmActionDefinition) {
            return ssmActionDefinition(Output.of(ssmActionDefinition));
        }

        public BudgetActionDefinitionArgs build() {
            return $;
        }
    }

}
