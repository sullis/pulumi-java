// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionIamActionDefinitionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionIamActionDefinitionGetArgs Empty = new BudgetActionDefinitionIamActionDefinitionGetArgs();

    /**
     * A list of groups to be attached. There must be at least one group.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return A list of groups to be attached. There must be at least one group.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * 
     */
    @Import(name="policyArn", required=true)
    private Output<String> policyArn;

    /**
     * @return The Amazon Resource Name (ARN) of the policy to be attached.
     * 
     */
    public Output<String> policyArn() {
        return this.policyArn;
    }

    /**
     * A list of roles to be attached. There must be at least one role.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return A list of roles to be attached. There must be at least one role.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * A list of users to be attached. There must be at least one user.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return A list of users to be attached. There must be at least one user.
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    private BudgetActionDefinitionIamActionDefinitionGetArgs() {}

    private BudgetActionDefinitionIamActionDefinitionGetArgs(BudgetActionDefinitionIamActionDefinitionGetArgs $) {
        this.groups = $.groups;
        this.policyArn = $.policyArn;
        this.roles = $.roles;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetActionDefinitionIamActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetActionDefinitionIamActionDefinitionGetArgs $;

        public Builder() {
            $ = new BudgetActionDefinitionIamActionDefinitionGetArgs();
        }

        public Builder(BudgetActionDefinitionIamActionDefinitionGetArgs defaults) {
            $ = new BudgetActionDefinitionIamActionDefinitionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groups A list of groups to be attached. There must be at least one group.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups A list of groups to be attached. There must be at least one group.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups A list of groups to be attached. There must be at least one group.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param policyArn The Amazon Resource Name (ARN) of the policy to be attached.
         * 
         * @return builder
         * 
         */
        public Builder policyArn(Output<String> policyArn) {
            $.policyArn = policyArn;
            return this;
        }

        /**
         * @param policyArn The Amazon Resource Name (ARN) of the policy to be attached.
         * 
         * @return builder
         * 
         */
        public Builder policyArn(String policyArn) {
            return policyArn(Output.of(policyArn));
        }

        /**
         * @param roles A list of roles to be attached. There must be at least one role.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A list of roles to be attached. There must be at least one role.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles A list of roles to be attached. There must be at least one role.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param users A list of users to be attached. There must be at least one user.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users A list of users to be attached. There must be at least one user.
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users A list of users to be attached. There must be at least one user.
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public BudgetActionDefinitionIamActionDefinitionGetArgs build() {
            $.policyArn = Objects.requireNonNull($.policyArn, "expected parameter 'policyArn' to be non-null");
            return $;
        }
    }

}
